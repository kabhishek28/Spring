<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Company Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Company Form</h2>

    <c:if test="${not empty errors}">
        <div class="alert alert-danger">
            <c:forEach var="error" items="${errors}">
                <p>${error.defaultMessage}</p>
            </c:forEach>
        </div>
    </c:if>

    <form action="company" method="post">
        <input type="text" name="name" class="form-control mb-2" placeholder="Company Name">
        <input type="text" name="ceo" class="form-control mb-2" placeholder="CEO">
        <input type="text" name="industry" class="form-control mb-2" placeholder="Industry">
        <input type="text" name="headquarters" class="form-control mb-2" placeholder="Headquarters">
        <input type="number" name="employees" class="form-control mb-2" placeholder="Number of Employees">
        <input type="number" step="0.01" name="revenue" class="form-control mb-2" placeholder="Revenue">
        <input type="text" name="founded" class="form-control mb-2" placeholder="Founded Year">
        <button type="submit" class="btn btn-danger w-100">Submit</button>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
