<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>

<html>
<head>
    <title>Book Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Book Form</h2>


        <c:forEach var="error" items="${errors}">
            <p class="text-danger">${error.defaultMessage}</p>
        </c:forEach>


    <form action="book" method="post">
        <input type="text" name="title" class="form-control mb-2" placeholder="Title">
        <input type="text" name="author" class="form-control mb-2" placeholder="Author">
        <input type="text" name="publisher" class="form-control mb-2" placeholder="Publisher">
        <input type="number" name="year" class="form-control mb-2" placeholder="Year of Publication">
        <input type="text" name="isbn" class="form-control mb-2" placeholder="ISBN">
        <input type="number" step="0.01" name="price" class="form-control mb-2" placeholder="Price">
        <input type="text" name="genre" class="form-control mb-2" placeholder="Genre">
        <button type="submit" class="btn btn-danger w-100">Submit</button>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
