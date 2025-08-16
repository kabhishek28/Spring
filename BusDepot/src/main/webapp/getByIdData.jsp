<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>DUME KSRTC</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>

<div class="container mt-5">
    <div class="card text-center shadow p-3 mb-5 bg-body-tertiary rounded">
        <h1 class="text-center">All Data</h1>
    </div>

    <h2> Details List By ID</h2>

    <table class="table table-bordered table-striped">

        <tbody>

        <tr>
            <th>Name</th>
            <td>${bus.personName}</td>
        </tr>
        <tr>
            <th>Email</th>
            <td>${bus.personEmail}</td>
        </tr>
        <tr>
            <th>Phone Number</th>
            <td>${bus.personPhoneNumber}</td>
        </tr>
        <tr>
            <th>Age</th>
            <td>${bus.personAge}</td>
        </tr>
        <tr>
            <th>City</th>
            <td>${bus.personCity}</td>
        </tr>
        <tr>
            <th>State</th>
            <td>${bus.personState}</td>
        </tr>
        </tbody>
    </table>


</div>

</body>
</html>
