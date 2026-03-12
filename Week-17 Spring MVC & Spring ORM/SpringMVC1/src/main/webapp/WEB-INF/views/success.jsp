<%@page import="com.mvc.ViewToController.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Employee details</h1>
<% Employee e1=(Employee)request.getAttribute("data"); %>
<h3>Employee Name: <%=e1.getEname() %></h3>
<h3>Employee Salary: <%=e1.getEsalary() %></h3>
<h3>Employee Experience: <%=e1.getEexp() %></h3>

</center>
</body>
</html>