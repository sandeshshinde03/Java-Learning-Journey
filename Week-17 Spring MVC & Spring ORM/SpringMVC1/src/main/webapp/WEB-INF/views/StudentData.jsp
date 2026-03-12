<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>
</head>
<body>
	 <center>
	 <h1>This is student data</h1>
<%-- 	 <% 
 	 String n= (String) request.getAttribute("name");
 	 %> 
 	 <h4>Name: <%=n %></h4> 
--%>
	 
 	 <% 
 	 Integer a=(Integer) request.getAttribute("age");
 	 %>
 	 <h4> Age: <%=a %></h4> 

	 
	 <%
	 List<String> l=(List<String>)request.getAttribute("list");
	 %>
	 <h3>List of fruits: <%=l %></h3>
	 
	 </center>
</body>
</html>