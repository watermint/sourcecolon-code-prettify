function sourcecolon(source){
  var body = document.documentElement.childNodes[1];
  var tag = document.createElement("xmp");
  if (source.lang) {
    tag.className = "prettyprint lang-" + source.lang;
  } else {
    tag.className = "prettyprint";
  }
  tag.innerHTML = source.code;
  body.appendChild(tag);

  prettyPrint();

  var printed = document.innerHTML;

  body.removeChild(tag);

  return printed;
}
