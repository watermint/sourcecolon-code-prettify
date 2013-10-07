# Google Code Prettify Wrapper

Wrapper module for Google Code Prettify. Google Code Prettify runs on JavaScript with browser environment. sourcecolon-code-prettify provides Java API without any browser dependency. sourcecolon-code-prettify use Rhino with Envjs to simulate browser environment.

# Synopsis

	import org.watermint.sourcecolon.prettify.*;

	class Hello {
		public static void main(String... args) throws PrettifyException {
       			Prettify p = new Prettify();

			System.out.println(p.prettify("puts 'Hello, World'"));
		}
	}

## Output

	<xmp class="prettyprint prettyprinted"><span class="pln">puts </span><span class="str">&apos;Hello, World&apos;</span></xmp>

# References

* [RhinoでjQuery](http://ka-ka-xyz.hatenablog.com/entry/20120411/1334160190)

# Libraries

## Libraries included in this distribution

* [google-code-prettify](https://code.google.com/p/google-code-prettify/), Apache License 2.0
* [Envjs](http://www.envjs.com/), MIT License/GPL 2.0

## Libraries are not included in this distribution

Libraries below are marked dependencies as maven POM configuration.

* [Rhino](https://developer.mozilla.org/docs/Rhino), 1.7R2, MPL 1.1/GPL 2.0
* [JSONIC](http://jsonic.sourceforge.jp/), 1.3.0, Apache License 2.0

# LICENSE

The MIT License (MIT)
Copyright (c) 2013 Takayuki Okazaki

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
