<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>DUME KSRTC</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>

<div>
    <div class="card container text-center mt-5 shadow p-3 mb-5 bg-body-tertiary rounded">
        <h1 class="text-center">All DATA </h1>
    </div>

    <h2>Bus Details List</h2>

    <table STYLE="board">
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Phone Number</th>
            <th>Age</th>
            <th>City</th>
            <th>State</th>
        </tr>

    <c:forEach var="bus" items="${busList}">
        <tr>
            <td>${bus.personName}</td>
            <td>${bus.personEmail}</td>
            <td>${bus.personPhoneNumber}</td>
            <td>${bus.personAge}</td>
            <td>${bus.personCity}</td>
            <td>${bus.personState}</td>
        </tr>
    </c:forEach>
    </table>

</div>
</body>
</html>