<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Manager Home</title>
    </head>
    <body>
    	<div align="center">
	        <h1>Contact List</h1>
	        <h3><a href="newContact">New Contact</a></h3>
	        <table border="1">
	        	<th>studentId</th>
	        	<th>studentName</th>
	        	<th>studentHobby</th>
	        	<th>studentMobile</th>
	        	<th>studentDOB</th>
	        	<th>studentSkills</th>
	        	
				<c:forEach var="student" items="${students}" varStatus="status">
	        	<tr>
	        		<td>${student.studentId}</td>
					<td>${student.studentName}</td>
					<td>${student.studentHobby}</td>
					<td>${student.studentMobile}</td>
					<td>${student.studentDOB}</td>
					<td>${student.studentSkills}</td>
							
	        	</tr>
				</c:forEach>	        	
			</table>
    	</div>
    </body>
</html>
