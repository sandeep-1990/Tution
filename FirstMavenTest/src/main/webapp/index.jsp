<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<div style="float: left;">
		<%
			HttpSession  httpSession  = request.getSession();
			String user = (String)httpSession.getAttribute("user");
			if(user!= null){
		%>
			<%="Welcome " + user %>
		<% 		
			}
		%>
	</div>
	
	
	<br/>
	
	<div>
		<% 
			String status = (String)request.getAttribute("status");
			if(status != null){
		%>
		<%= status%>
		<% 		
			}
		%>
		<form action="StudentServlet" method="post">
			
			<table>

				<tr>
					<td>Name</td>
					<td><input type="text" name="name"></td>

				</tr>
				<tr>
					<td>Roll No</td>
					<td><input type="text" name="rollNo"></td>

				</tr>
				<tr>
					<td>Phone</td>
					<td><input type="text" name="phone"></td>

				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email"></td>

				</tr>
				<tr>
					<td><input type="submit" value="Submit"></td>

				</tr>
			</table>
		</form>
	</div>

</body>
</html>