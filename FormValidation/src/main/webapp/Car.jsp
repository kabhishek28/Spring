<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Car Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Car Form</h2>

    <c:forEach var="error" items="${errors}">
        <p class="text-danger">${error.defaultMessage}</p>
    </c:forEach>
    <form action="car" method="post">
        <input type="text" name="brand" class="form-control mb-2" placeholder="Brand">
        <input type="text" name="model" class="form-control mb-2" placeholder="Model">
        <input type="text" name="color" class="form-control mb-2" placeholder="Color">
        <input type="number" name="year" class="form-control mb-2" placeholder="Year">
        <input type="text" name="ownerName" class="form-control mb-2" placeholder="Owner Name">
        <input type="double" name="price" class="form-control mb-2" placeholder="Price">
        <input type="text" name="registrationNumber" class="form-control mb-2" placeholder="Registration Number">
        <button type="submit" class="btn btn-danger w-100">Submit</button>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
