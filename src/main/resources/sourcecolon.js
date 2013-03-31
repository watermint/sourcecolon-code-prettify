var document = window.document;

function sourcecolon(source){
  var body = document.documentElement.childNodes[1];
  var tag = document.createElement("code");
  tag.className = "prettyprint";
  tag.innerHTML = source.code;
  body.appendChild(tag);

  prettyPrint();

  var printed = document.innerHTML;

  body.removeChild(tag);

  return printed;
}
