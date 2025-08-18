<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Festivo | Sign In</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">

    <!-- Bootstrap JS -->
<!--    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"-->
<!--            integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO"-->
<!--            crossorigin="anonymous"></script>-->

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
            z-index: 1;

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
    <script src="resources/js/formScript.js"></script>
</head>

<body>



<!-- Navbar -->
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

<!-- Right Centered Sign in Card -->
<div class="right-center-wrapper">
    <div class="card" style="width: 30rem; height: 30rem;">
        <div class="card-body">
            <h5 class="card-title">Sign in</h5>
            <h6 class="card-subtitle mb-2 text-muted">Sing in your account</h6>
            <br>
            <!------------------ Sing in from--------- -->
            <form action="homePage" onsubmit="return singInValidation(event)" method="GET">
                <div class="mb-3">
                    <label for="floatingInput" class="form-label">Email address</label>
                    <input type="email" class="form-control" id="floatingInput" name="emailName" placeholder="Enter your Email" aria-describedby="emailHelp">
                    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                </div>
                <div class="mb-3">
                    <label for="passwordID" class="form-label">Password</label>
                    <input type="password" class="form-control" id="passwordID" placeholder="Enter your Password" name="passwordName">
                </div>

                <div class="mb-3">
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </form>
            <!--                <a href="Home" class="btn btn-primary">Submit</a><br>-->
            <a href="#" class="card-link">Need help?</a>

        </div>
    </div>
</div>

<!--------------------------- content brooooo------------------------ -->
<div class="left-center">
    <h1 class="extra-large-text1 animate-text">X-Workz</h1>
    <h2 class="extra-large-text1 animate-text delay-1">ODC</h2>
    <!--    <h3 class="extra-large-text1 animate-text delay-2">NOT CHAOS.</h3>-->
</div>








</body>

</html>