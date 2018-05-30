<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Search</title>
</head>
<body>
		<sf:form method="POST" modelAttribute="searchModel">
			<table>
				<tr>
					<td><sf:input path="query" /></td>
					<td><input type="submit" value="Search"/></td>
				</tr>
			</table>
		</sf:form>
</body>
</html>