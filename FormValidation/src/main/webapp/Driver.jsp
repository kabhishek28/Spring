<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Driver Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Driver Form</h2>

    <c:if test="${not empty errors}">
        <div class="alert alert-danger">
            <c:forEach var="error" items="${errors}">
                <p>${error.defaultMessage}</p>
            </c:forEach>
        </div>
    </c:if>

    <form action="driver" method="post">
        <input type="text" name="name" class="form-control mb-2" placeholder="Name">
        <input type="number" name="age" class="form-control mb-2" placeholder="Age">
        <input type="text" name="phone" class="form-control mb-2" placeholder="Phone">
        <input type="email" name="email" class="form-control mb-2" placeholder="Email">
        <input type="text" name="place" class="form-control mb-2" placeholder="Place">
        <input type="text" name="licenseNumber" class="form-control mb-2" placeholder="License Number">
        <input type="text" name="vehicleType" class="form-control mb-2" placeholder="Vehicle Type">
        <button type="submit" class="btn btn-danger w-100">Submit</button>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
