<%@page contentType="text/html; charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<h2> Welcome to JSP Hello World!</h2>
<p>${data}</p>
<form action="student" method="post">
<input type="text" name="studentName"/><br>
<input type="submit" value="Register" />
</form>
</body>
</html>
