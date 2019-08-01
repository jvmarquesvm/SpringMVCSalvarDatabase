<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Adicione um novo Produto</title>
</head>
<body>
	<h3>Adicione um novo Produto</h3>
	<s:form method="post" commandName="product" action="${pageContext.request.contextPath }/product/save">  
	<table>
		<tr>
		<td>Name</td>
		<td><s:input path="name"/></td>
		</tr>
		
		<tr>
		<td>Price</td>
		<td><s:input path="price"/></td>
		</tr>
		
		<tr>
		<td>Quantidade</td>
		<td><s:input path="quantidade"/></td>
		</tr>
		
		<tr>
		<td>Descrição</td>
		<td><s:textarea path="descricao" cols="20" rows="5"/></td>
		</tr>
		
		<tr>
		<td>Status</td>
		<td><s:checkbox path="status"/></td>
		</tr>
		
		<tr>
		<td>&nbsp;</td>
		<td><input type="submit" value="Save"/> </td>
		</tr>

	</table>
	</s:form>

</body>
</html>