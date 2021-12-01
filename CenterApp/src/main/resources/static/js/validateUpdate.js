
function validateForm() {
  var x = document.forms["myForm"]["place"].value;
  var y = document.forms["myForm"]["strength"].value;
  if (x == "") {
    alert("place must be filled out");
    return false;
  }
  if (y == "") {
	    alert("place must be filled out");
	    return false;
	  }
  if (y >1000 ) {
	    alert("tooo many people reduce the strength");
	    return false;
	  }
  
}