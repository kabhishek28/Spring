<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Festivo |index </title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">



    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        html,
        body {
            height: 100%;
            width: 100%;
            overflow: hidden;
        }

        .fullscreen-bg {
            position: fixed;
            top: 0;
            left: 0;
            width: 100vw;
            height: 100vh;
            object-fit: cover;
            z-index: -1;
        }

        .right-center-wrapper {
            display: flex;
            justify-content: flex-end;
            align-items: center;
            height: 90vh;
            padding-right: 5%;
        }

        .card {
            background-color: rgba(255, 255, 255, 0.8);
            /* Optional translucent effect */
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.3);
        }

        .left-center {
            position: fixed;
            left: 5%;
            top: 55%;
            transform: translateY(-50%);
        }

        .extra-large-text1 {
            color: white;
            font-size: 4rem;
            font-weight: bold;
            margin: 0;
            opacity: 0;
        }

        /* Animation */
        @keyframes slideIn {
            0% {
                transform: translateX(-200px);
                opacity: 0;
            }

            100% {
                transform: translateX(0);
                opacity: 1;
            }
        }

        .animate-text {
            animation: slideIn 1s ease-out forwards;
        }

        /* Delay for second and third lines */
        .delay-1 {
            animation-delay: 0.5s;
        }

        .delay-2 {
            animation-delay: 1s;
        }

        .extra-large-text1 {
            font-size: 7rem;
            /* adjust size as you like */
            font-weight: 900;
            /* extra bold */
            color: rgba(0, 0, 0, 0.748);
        }

        .webName {
            margin-left: 20px;
        }
    </style>
</head>

<body>


<nav class="navbar navbar-expand-lg sticky-top bg-body-tertiary" data-bs-theme="dark">
    <div class="container-fluid px-4">
        <!-- Logo -->
        <a class="navbar-brand me-4" href="#">
            <img src="image/logo1.png" alt="Logo" width="150" height="50">
        </a>

        <!-- Toggle button for mobile -->
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarContent"
                aria-controls="navbarContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <!-- Navbar links -->
        <div class="collapse navbar-collapse" id="navbarContent">
            <!-- Left-side nav items -->
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="#">About Us</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="#">Contact</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="#">Review</a>
                </li>
            </ul>

            <!-- Right-side auth links -->
            <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" href="signUpPage">Sign Up</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="directSignIn">Sign In</a>
                </li>
            </ul>

        </div>
    </div>
</nav>


<div class="left-center d-flex">
    <div>
        <h1 class="extra-large-text1 animate-text">X-Workz</h1>
        <h2 class="extra-large-text1 animate-text delay-1">ODC</h2>
    </div>

<!--    <h3 class="extra-large-text1 animate-text delay-2">NOT CHAOS.</h3>-->

        <img src="image/pc.png" alt="Logo" width="550" height="500">


</div>


</body>

</html>