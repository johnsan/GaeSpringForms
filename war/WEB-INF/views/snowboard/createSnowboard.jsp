<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>Create Snowboard</title>
</head>
<body>
<h2>Create</h2>
<form:form method="post" action="/snowboard/processCreateSnowboard">

	<table>
	<tr>
		<td><form:label path="brand">Brand</form:label></td>
		<td><form:input path="brand" /></td> 
	</tr>
	<tr>
		<td><form:label path="model">Model</form:label></td>
		<td><form:input path="model" /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="Create Snowboard"/>
		</td>
	</tr>
</table>	
	
</form:form>
</body>
</html>
