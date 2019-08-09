	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Product Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Add a Product
</h1>


<form:form action="/saveProductRecord" modelAttribute="product">
<table>
	<tr>
		<td>
			<form:label path="productId">
				<spring:message text="productId"/>
			</form:label>
		</td>
		<td>
			<form:input path="productId" size="8"   />
			
		</td> 
	</tr>
	<%-- </c:if> --%>
	<tr>
		<td>
			<form:label path="productName">
				<spring:message text="productName"/>
			</form:label>
		</td>
		<td>
			<form:input path="productName" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="quantity">
				<spring:message text="quantity"/>
			</form:label>
		</td>
		<td>
			<form:input path="quantity" />
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="price">
				<spring:message text="price"/>
			</form:label>
		</td>
		<td>
			<form:input path="price" size="8"   />
			
		</td> 
	</tr>
	<tr>
		<td colspan="2">
			<c:if test="${!empty product.productName}">
				<input type="submit" 
				formaction="add/update"
					value="<spring:message text="Edit Product" />" />
			</c:if>
			<c:if test="${empty product.productName}">
				<input type="submit"
					value="<spring:message text="Add Product"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>


${message}
<br>
<h3>Products List</h3>
<c:if test="${!empty listProducts}">
	<table class="tg">
	<tr>
		<th width="80">Product ID</th>
		<th width="120">Product Name</th>
		<th width="120">Quantity</th>
		<th width="120">Price</th>
		
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listProducts}" var="product">
		<tr>
			<td>${product.productId}</td>
			<td>${product.productName}</td>
			<td>${product.quantity}</td>
			<td>${product.price}</td>
			<td><a href="<c:url value='/edit/${product.productId}' />" >Edit</a></td>
			<td><a href="<c:url value='/delete/${product.productId}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
