<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="validate.jsp">
Username: <input type="text" name="username"><br/>
Password: <input type="password" name="password"><br/>
<input type="submit" value="Go">
</form>

<% String errorMessage = (String)session.getAttribute("errMessage");
if(errorMessage==null)
errorMessage="";%>
<font colour="red"><%=errorMessage %></font>

</body>
</html>