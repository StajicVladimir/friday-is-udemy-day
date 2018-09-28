<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Hello Student bla</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student">
		
			First Name: <form:input path="firstName"/>
			
			<br><br>
			
			Last Name: <form:input path="lastName"/>
			
			<br><br>
			
			Country: 
			<form:select path="country">
				<form:options items="${student.countryOptions}"/>
			</form:select>
			
			<br><br>
			
			Favorite Language: 
			<br>Java <form:radiobutton path="favoriteLanguage" value="Java" />
			<br>PHP  <form:radiobutton path="favoriteLanguage" value="PHP" />
			<br>C#   <form:radiobutton path="favoriteLanguage" value="C#" />
			<br>Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
			
			<br><br>
			
			Operating Systems:
			<br>Linux  <form:checkbox path="operatingSystems" value="Linux"/>
			<br>Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
			<br>MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
			
			<br><br>
			
			<input type="submit" value="Submit"/>
			
		</form:form>
	</body>
</html>