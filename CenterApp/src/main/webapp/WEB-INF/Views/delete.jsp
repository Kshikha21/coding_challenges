<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style type="text/css">
 

</style>
</head>
<body>
<div>
	<form action="deleteQuarantine">

		<table id="part">
			<tr>
				<th>check
				<th>Id</th>
				<th>Name</th>
				<th>Delete</th>

			</tr>
			<c:forEach var="part" items="${list}">
				<tr>
					<td><input type="checkbox" name="id"
						value="${part.quarantineID}" /></td>
					<td>${part.quarantineID}</td>
					<td>${part.placeName}</td>
					<td>${part.strength}</td>
					
					<td><button type="submit" class="btn btn-primary">Delete</button></td> <br>
					
				</tr>
			</c:forEach>
		</table>

	</form>

</div>

</body>
</html>