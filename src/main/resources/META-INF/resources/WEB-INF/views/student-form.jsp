<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Form Registration</title>
    <style>
        .error {
            color: red;
         }
    </style>
</head>
<body>

    Fill out the form. Asterisk (*) means required.
    <br>
    <br>

    <form:form action="processForm" modelAttribute="student">
        <br>

        First name: <form:input path="firstName" />

        <br>
        <br>

        Last name (*): <form:input path="lastName" />
        <form:errors path="lastName" cssClass="error" />

        <br><br>

        Free Pases: <form:input path="freePasses" />
        <form:errors path="freePasses" cssClass="error" />

        <br><br>

        Postal Code: <form:input path="postalCode" />
                <form:errors path="postalCode" cssClass="error" />

                <br><br>

        Country:
            <form:select path="country">
                <form:options items="${student.countryOptions}"/>
            </form:select>
        <br>
        <br>

        Favorite Language:

            Java <form:radiobutton path="favoriteLanguage" value="Java" />
            C# <form:radiobutton path="favoriteLanguage" value="C#" />
            PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
            Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />

        <br>
        <br>

        Operating Systems:

            Linux <form:checkbox path="operatingSystems" value="Linux" />
            Mac Os <form:checkbox path="operatingSystems" value="Mac OS" />
            MS Windows <form:checkbox path="operatingSystems" value="MS Windows" />
        <br>
        <br>
        <input type="submit" value="Submit"/>
    </form:form>
</body>
</html>