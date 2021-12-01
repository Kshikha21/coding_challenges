function validation() {
	var name = document.forms["myForm"]["name"];
	if ((name.value == "") || (name.value.length <= 2)) {
		window.alert("Please enter  name and length more than 2.");
		name.focus();
		return false;
	} else {
		var format = /^[A-Za-z]+$/;
		if (!name.value.match(format)) {
			window.alert("please enter name only with letters ");
			name.focus();
			return false;
		}
	}
	if (age.value == "") {
		window.alert("Please enter your age.");
		age.focus();
		return false;
	} else {
		if ( !( age.value > 1 && age.value<100 ) ){
			window.alert("please enter age in numbers format");
			age.focus();
			return false;
		}
	}
}