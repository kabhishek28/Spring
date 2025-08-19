<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book Submitted</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light text-dark">
<div class="container mt-5">
    <h2 class="text-center mb-4 text-success">${Submitted} Successfully ✅</h2>

<!--    <div class="card p-4 shadow-sm">-->
<!--        <p><strong>Book Name:</strong> ${bookName}</p>-->
<!--        <p><strong>Author:</strong> ${author}</p>-->
<!--        <p><strong>Price:</strong> ₹${price}</p>-->
<!--        <p><strong>Genre:</strong> ${genre}</p>-->
<!--        <p><strong>Published Date:</strong> ${publishedDate}</p>-->
<!--    </div>-->

    <div class="text-center mt-3">
        <a href="Book.jsp" class="btn btn-primary">Submit Another</a>
        <a href="index.jsp" class="btn btn-secondary">Back to Home</a>
    </div>
</div>
</body>
</html>
