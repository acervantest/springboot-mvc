<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
<br><br>
    The Student is confirmed: ${student.firstName} ${student.lastName}
<br><br>
    Country: ${student.country}
<br><br>
    Favorite Language: ${student.favoriteLanguage}
<br><br>
    Operating Systems:

    <ul>
        <c:forEach var="temp" items="${student.operatingSystems}" >

            <li> ${temp} </li>

        </c:forEach>
    </ul>

    <br><br>

     Free Passes: ${student.freePasses}

    <br><br>

    Postal Code: ${student.postalCode}

    <br><br>

    Postal Code: ${student.courseCode}

</body>
</html>