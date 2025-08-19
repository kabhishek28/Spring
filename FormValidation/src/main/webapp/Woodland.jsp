<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Woodland Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Woodland Form</h2>

    <c:if test="${not empty error}">
        <c:forEach var="err" items="${error}">
            <p class="text-danger">${err.defaultMessage}</p>
        </c:forEach>
    </c:if>

    <form action="woodland" method="post">
        <input type="text" name="name" class="form-control mb-2" placeholder="Name">
        <input type="text" name="location" class="form-control mb-2" placeholder="Location">
        <input type="text" name="owner" class="form-control mb-2" placeholder="Owner">
        <input type="text" name="area" class="form-control mb-2" placeholder="Area">
        <input type="text" name="type" class="form-control mb-2" placeholder="Type">
        <input type="text" name="contact" class="form-control mb-2" placeholder="Contact">
        <input type="text" name="facilities" class="form-control mb-2" placeholder="Facilities">
        <button type="submit" class="btn btn-danger w-100">Submit</button>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
