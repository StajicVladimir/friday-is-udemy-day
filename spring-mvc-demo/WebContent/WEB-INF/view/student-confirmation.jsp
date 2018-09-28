<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Student Confirmation</title>
	</head>
	<body>
		The student is confirmed: ${student.firstName} ${student.lastName} 
	<br><br>
		Country: ${student.country}
		
	<br><br>
	
		Student's favorite language: ${student.favoriteLanguage}
	
	<br><br>
		
		Operating Systems: 
		<ul>
		<c:forEach items="${student.operatingSystems}" var="operatingSystem">
			<li>${operatingSystem}</li>	
		</c:forEach>
		</ul>
	</body>
</html>