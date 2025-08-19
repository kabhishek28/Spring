<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Mobile Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Mobile Form</h2>

    <c:if test="${not empty error}">
        <c:forEach var="err" items="${error}">
            <p class="text-danger">${err.defaultMessage}</p>
        </c:forEach>
    </c:if>

    <form action="mobile" method="post">
        <input type="text" name="brand" class="form-control mb-2" placeholder="Brand">
        <input type="text" name="model" class="form-control mb-2" placeholder="Model">
        <input type="text" name="os" class="form-control mb-2" placeholder="Operating System">
        <input type="text" name="ram" class="form-control mb-2" placeholder="RAM">
        <input type="text" name="storage" class="form-control mb-2" placeholder="Storage">
        <input type="text" name="camera" class="form-control mb-2" placeholder="Camera">
        <input type="number" name="price" class="form-control mb-2" placeholder="Price">
        <button type="submit" class="btn btn-danger w-100">Submit</button>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
