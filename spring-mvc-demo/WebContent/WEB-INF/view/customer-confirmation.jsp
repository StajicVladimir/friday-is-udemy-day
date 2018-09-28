<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Customer Confirmation</title>
	</head>
	<body>
		The customer is confirmed: ${customer.firstName} ${customer.lastName} 
	
		Free passes: ${customer.freePasses}
		
		Course Code: ${customer.courseCode}
	</body>
</html>