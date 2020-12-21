<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Student</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	</head>

	<body>
		<div class="container">
			<h1>Student</h1>
			<table class="table">
				<tr>
					<td>Index</td>
					<td>Name</td>
					<td>City</td>
				</tr>
				
				<c:forEach items="${students}" var="student">
					<tr>
						<td>${student.id}</td>
						<td>${student.name}</td>
						<td>${student.city}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</body>
</html>