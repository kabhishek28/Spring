<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>College Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">College Form</h2>

    <c:if test="${not empty errors}">
        <div class="alert alert-danger">
            <c:forEach var="error" items="${errors}">
                <p>${error.defaultMessage}</p>
            </c:forEach>
        </div>
    </c:if>

    <form action="college" method="post">
        <input type="text" name="name" class="form-control mb-2" placeholder="College Name">
        <input type="text" name="principal" class="form-control mb-2" placeholder="Principal Name">
        <input type="text" name="location" class="form-control mb-2" placeholder="Location">
        <input type="number" name="establishedYear" class="form-control mb-2" placeholder="Established Year">
        <input type="number" name="students" class="form-control mb-2" placeholder="Number of Students">
        <input type="text" name="courses" class="form-control mb-2" placeholder="Courses">
        <input type="text" name="affiliation" class="form-control mb-2" placeholder="Affiliation">
        <button type="submit" class="btn btn-danger w-100">Submit</button>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
