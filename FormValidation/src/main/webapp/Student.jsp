<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Student Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Student Form</h2>

    <c:if test="${not empty error}">
        <c:forEach var="err" items="${error}">
            <p class="text-danger">${err.defaultMessage}</p>
        </c:forEach>
    </c:if>

    <form action="student" method="post">
        <input type="text" name="name" class="form-control mb-2" placeholder="Name">
        <input type="number" name="age" class="form-control mb-2" placeholder="Age">
        <input type="text" name="rollNumber" class="form-control mb-2" placeholder="Roll Number">
        <input type="text" name="course" class="form-control mb-2" placeholder="Course">
        <input type="text" name="email" class="form-control mb-2" placeholder="Email">
        <input type="text" name="phone" class="form-control mb-2" placeholder="Phone">
        <input type="text" name="college" class="form-control mb-2" placeholder="College">
        <button type="submit" class="btn btn-danger w-100">Submit</button>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
