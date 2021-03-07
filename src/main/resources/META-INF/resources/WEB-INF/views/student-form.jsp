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

        Country:
            <form:select path="country">
                <form:option value="MX" label="Mexico"/>
                <form:option value="BRA" label="Brazil"/>
                <form:option value="FRA" label="France"/>
                <form:option value="DEU" label="Germany"/>
                <form:option value="INR" label="India"/>
            </form:select>
        <br>
        <br>
        <input type="submit" value="Submit"/>
    </form:form>
</body>
</html>