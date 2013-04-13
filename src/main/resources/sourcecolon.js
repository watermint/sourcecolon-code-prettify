function sourcecolon(source){
  var body = document.documentElement.childNodes[1];
  var container = document.createElement("div");
  var xmp = document.createElement("xmp");
  if (source.lang) {
    xmp.className = "prettyprint lang-" + source.lang;
  } else {
    xmp.className = "prettyprint";
  }
  xmp.innerHTML = source.code;
  container.appendChild(xmp)
  body.appendChild(container);

  prettyPrint();

  var printed = container.innerHTML;

  body.removeChild(container);

  return printed;
}
