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

    <h2>Bus Details List</h2>

    <table class="table table-bordered table-striped">
        <thead>
        <tr>
            <th>Name</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${nameList}" var="bus">
            <tr>
                <td>${bus}</td>

            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
