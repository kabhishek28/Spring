<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<html lang="en">
<head>
    <meta charset="utf-8">
    <title>DUME KSRTC</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <div class="card text-center shadow p-3 mb-5 bg-body-tertiary rounded">
        <h1 class="text-center">All Data</h1>
    </div>

    <h2>All emails ending with @gmail.com</h2>
        <table class="table table-bordered table-hover mx-auto table-striped text-center table-center align-middle w-50">
            <tr>
                <th>Email</th>
            </tr>
            <c:forEach var="email" items="${list}" varStatus="loop">
                <tr>
                    <td>${email}</td>
                </tr>
            </c:forEach>
        </table>



</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>


