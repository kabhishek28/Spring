<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Festivoo | Sign Up</title>
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

<!-- Right Centered Sign Up Card -->
<div class="right-center-wrapper">
    <div class="card" style="width: 30rem; height: auto;">
        <div class="card-body">
            <h5 class="card-title">Sign up</h5>
            <h6 class="card-subtitle mb-2 text-muted">Sing up your account</h6>

            <!------------------ Sing up from--------- -->
            <form  class="p-4"  action="singInPage"   method="post" >
                <div class="row g-3 mb-3">
                    <div class="col-md-6">
                        <label for="NameID" class="form-label">Name</label>
                        <input type="text" class="form-control" id="NameID" name="userName" placeholder="Enter your name" oninput="nameValidation()" maxlength="10"  required>
                        <div id="NameError" class="input-text text-danger"></div>
                    </div>

                    <div class="col-md-6">
                        <label for="emailID" class="form-label">Email</label>
                        <input type="email" class="form-control" id="emailID" name="userEmail" placeholder="name@example.com" oninput="emailValidation()" required>
                        <div id="emailError" class = "input-text text-danger"></div>
                    </div>
                </div>

                <div class="row g-3 mb-3">
                    <div class="col-md-6">
                        <label for="phoneID" class="form-label">Phone Number</label>
                        <input type="tel" class="form-control" id="phoneID" name="userPhoneNo" placeholder="e.g. +91 98765 43210" oninput="phoneValidation()" required>
                        <div id="phoneError" class = "input-text text-danger"></div>

                    </div>

                    <div class="col-md-3">
                        <label for="ageID" class="form-label">Age</label>
                        <input type="number" class="form-control" id="ageID" name="userAge" placeholder="Enter age" oninput="ageValidation()" required>
                        <div id="ageError" class = "input-text text-danger"></div>
                    </div>

                    <div class="col-md-3">
                        <label for="genderID" class="form-label">Gender</label>
                        <select id="genderID" class="form-select" name="userGender" oninput="genderValidation()" required>
                            <option selected disabled>Choose...</option>
                            <option value="M">Male</option>
                            <option value="F">Female</option>
                            <option value="O">Other</option>
                        </select>
                    </div>
                    <div id="genderError" class = "input-text text-danger"></div>

                </div>

                <div class="mb-3">
                    <label for="addressID" class="form-label">Address</label>
                    <input type="text" class="form-control" id="addressID" name="userAddress" placeholder="Enter address" oninput="addressValidation()" required>
                    <div id="addressError" class = "input-text text-danger"></div>

                </div>

                <div class="row g-3 mb-3">
                    <div class="col-md-6">
                        <label for="passwordID" class="form-label">Password</label>
                        <input type="password" class="form-control" id="passwordID" name="userPassword" placeholder="Password" oninput="passwordValidation()" required>
                        <div id="PasswordError" class = "input-text text-danger"></div>

                    </div>

                    <div class="col-md-6">
                        <label for="ConfirmPasswordID" class="form-label">Confirm Password</label>
                        <input type="password" class="form-control" id="ConfirmPasswordID" name="userConfirmPassword" placeholder="Confirm password" required>
                    </div>
                </div>

                <div class="mb-3">
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>

                <p class="card-text mt-3">
                    <strong>Join X-Workz</strong> to master in-demand software skills and launch your tech career.
                </p>
            </form>

            <!--                <a href="signIn" class="card-link">Already have an account?</a>-->
        </div>
    </div>
</div>

<div class="left-center">
    <h1 class="extra-large-text1 animate-text">X-Workz</h1>
    <h2 class="extra-large-text1 animate-text delay-1">ODC</h2>
    <!--    <h3 class="extra-large-text1 animate-text delay-2">NOT CHAOS.</h3>-->
</div>
<SCRIPT src="resources/js/formScript.js"></SCRIPT>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>

</body>

</html>