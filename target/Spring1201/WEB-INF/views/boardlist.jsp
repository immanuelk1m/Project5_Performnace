<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@page import="com.example.board.BoardDAO, com.example.board.BoardVO, java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Performance Board</title>
	<!-- Bootstrap CSS -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-4">
	<h1>Performance List</h1>

	<table class="table table-bordered table-hover">
		<thead class="thead-dark">
		<tr>
			<th>Performance Name</th>
			<th>From Date</th>
			<th>To Date</th>
			<th>Facility Name</th>
			<th>Cast</th>
			<th>Runtime</th>
			<th>Age Restriction</th>
			<th>Guidance</th>
			<th>Poster</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${list}" var="performance">
			<tr>
				<td>${performance.getPrfnm()}</td>
				<td>${performance.getPrfpdfrom()}</td>
				<td>${performance.getPrfpdto()}</td>
				<td>${performance.getFcltynm()}</td>
				<td>${performance.getPrfcast()}</td>
				<td>${performance.getPrfruntime()}</td>
				<td>${performance.getPrfage()}</td>
				<td>${performance.getPcseguidance()}</td>
				<td>
					<img src="${performance.getPoster()}" class="img-fluid" alt="Performance Poster">
				</td>
				<td><a href="../edit/${performance.getBid()}" class="btn btn-primary">Edit</a></td>
				<td><a href="../deleteok/${performance.getBid()}" class="btn btn-danger">Delete</a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<a href="../add" class="btn btn-success">Add</a>
</div>

<!-- Bootstrap JS, Popper.js, and jQuery -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>
