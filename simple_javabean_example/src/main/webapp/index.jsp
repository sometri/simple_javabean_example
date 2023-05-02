<%-- This is a JSP comment. --%>
<!-- HTML comment -->
<%-- source: https://www.youtube.com/watch?v=u2QWxX7Iy3E --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- my code --%>
<jsp:useBean id='employee' scope='session' class='model.EmployeeBean' />

<jsp:setProperty property='firstName' name='employee' value='Bill' />
<jsp:setProperty property='lastName' name='employee' value='Gates' />
<jsp:setProperty property='payRate' name='employee' value='12' />
<jsp:setProperty property='startYear' name='employee' value='2014' />

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Employee JavaBean Introduction</title>
</head>
<body>

	<h1>Welcome to Employee JavaBean Introduction</h1>
	<p>Employee Data:</p>
	<table border="1">
		<tr>
			<td>First Name:</td>
			<td>
				<jsp:getProperty property='firstName' name='employee' />			
			</td>		
		</tr>
		
		<tr>
			<td>Last Name:</td>
			<td>
				<jsp:getProperty property='lastName' name='employee' />			
			</td>
		</tr>
		
		<tr>
			<td>Pay Rate:</td>
			<td>
				<jsp:getProperty property='payRate' name='employee' />			
			</td>
		</tr>
		
		<tr>
			<td>Start Year:</td>
			<td>
				<jsp:getProperty property='startYear' name='employee' />			
			</td>		
		</tr>	
	</table>

</body>
</html>