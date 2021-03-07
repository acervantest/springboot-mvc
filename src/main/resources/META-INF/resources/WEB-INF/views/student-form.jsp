<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Form Registration</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        <br>
        First name: <form:input path="firstName" />
        <br>
        <br>
        Last name: <form:input path="lastName" />
        <br>
        <br>
        <input type="submit" value="Submit"/>
    </form:form>
</body>
</html>