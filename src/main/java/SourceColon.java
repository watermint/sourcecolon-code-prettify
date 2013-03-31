import net.arnx.jsonic.JSON;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.tools.shell.Global;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class SourceColon {
    public static void loadScript(Context context, Scriptable scope, String name) throws IOException {
        String path = "src/main/resources";

        try (Reader reader = new FileReader(new File(path + "/" + name))) {
            Script script = context.compileReader(reader, name, 1, null);
            script.exec(context, scope);
        }
    }

    public static String[] getGoogleCodePrettifyScripts() {
        return new String[] {
                "prettify.js",
                "lang-apollo.js",
                "lang-basic.js",
                "lang-clj.js",
                "lang-css.js",
                "lang-dart.js",
                "lang-erlang.js",
                "lang-go.js",
                "lang-hs.js",
                "lang-lisp.js",
                "lang-llvm.js",
                "lang-lua.js",
                "lang-matlab.js",
                "lang-ml.js",
                "lang-mumps.js",
                "lang-n.js",
                "lang-pascal.js",
                "lang-proto.js",
                "lang-r.js",
                "lang-rd.js",
                "lang-scala.js",
                "lang-sql.js",
                "lang-tcl.js",
                "lang-tex.js",
                "lang-vb.js",
                "lang-vhdl.js",
                "lang-wiki.js",
                "lang-xq.js",
                "lang-yaml.js"
        };
    }

    public static void main(String... args) throws IOException {
        Global global = new Global();
        Context context = ContextFactory.getGlobal().enterContext();

        global.init(context);

        context.setOptimizationLevel(-1);
        context.setLanguageVersion(Context.VERSION_1_5);
        Scriptable scope = context.initStandardObjects(global);

        loadScript(context, scope, "env.rhino.1.2.js");
        for (String name : getGoogleCodePrettifyScripts()) {
            loadScript(context, scope, name);
        }
        loadScript(context, scope, "sourcecolon.js");

        StringBuilder code = new StringBuilder();
//        code.append("public class Sakura {\n");
//        code.append("    public static void main(String... args) {\n");
//        code.append("        System.out.println(\"bloom!\");\n");
//        code.append("        /* hanami */\n");
//        code.append("    }\n");
//        code.append("}\n");

        try (Reader source = new FileReader("src/main/java/SourceColon.java")) {
            BufferedReader s = new BufferedReader(source);
            String line = null;
            while ((line = s.readLine()) != null) {
                code.append(line);
                code.append("\n");
            }
        }

        Map<String,String> params = new HashMap<>();
        params.put("code", code.toString());
        String paramString = JSON.encode(params);
        String evaluate = "sourcecolon(" + paramString + ")";

        System.out.println(evaluate);

        Object result = context.evaluateString(scope, evaluate, "<cmd>", 1, null);
        System.out.println(Context.toString(result));
    }
}
