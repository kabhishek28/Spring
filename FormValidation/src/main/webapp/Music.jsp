<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Music Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Music Form</h2>

    <c:if test="${not empty error}">
        <c:forEach var="err" items="${error}">
            <p class="text-danger">${err.defaultMessage}</p>
        </c:forEach>
    </c:if>

    <form action="music" method="post">
        <input type="text" name="title" class="form-control mb-2" placeholder="Title">
        <input type="text" name="artist" class="form-control mb-2" placeholder="Artist">
        <input type="text" name="album" class="form-control mb-2" placeholder="Album">
        <input type="text" name="genre" class="form-control mb-2" placeholder="Genre">
        <input type="number" name="duration" class="form-control mb-2" placeholder="Duration in seconds">
        <input type="text" name="language" class="form-control mb-2" placeholder="Language">
        <input type="text" name="releaseYear" class="form-control mb-2" placeholder="Release Year">
        <button type="submit" class="btn btn-danger w-100">Submit</button>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
