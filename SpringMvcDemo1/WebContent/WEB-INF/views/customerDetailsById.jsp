<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri= "http://www.springframework.org/tags/form" prefix ="f" %>
<html>
<head>
<title>
Hello Customer
</title>
<body bgcolor="yellow" text="red" >
<center>
<b>
<font face="comic sans ms" size="20"> Hello Delloite </b> Please fill customer details
</font>
</center>
 
<f:form action="searchCustomerById.do">
 
    <table cellspacing="10" cellpadding="10" align="center">
    <tr><td>Customer Id </td> <td> <f:input type="text" path="customerId" name="customerId"></f:input></td></tr>
            <tr><td><input type="submit" value="Search "></td> <td> 
            <input type="reset" value="Clear"></td></tr>
    <tr><td>Customer Name </td><td> <f:input type="text" path="customerName" name="customerName"></f:input>:</td></tr>
    <tr><td>Customer Address </td><td> 
        <f:input type="text" path="customerAddress" name="customerAddress"></f:input>
       
        </td></tr>
        
    <tr><td>Bill Amount </td> <td> <f:input type="text" path="billAmount" name="billAmount"></f:input></td>
        </tr>
        
    </table>
</f:form>
 
 
<a href="index.html">Home</a>
 
</body>
</html>