function nameValidation(){

let nameInput = document.getElementById("NameID").value;
let nameError = document.getElementById("NameError");

 const nameRegex = /^[A-Za-z]+$/;

 if (nameInput.length < 3 || nameInput.length > 10) {
     nameError.textContent = " Name must be between 3 and 10 characters.";
 } else if (!nameRegex.test(nameInput)) {
     nameError.textContent = " Name should contain only letters (A-Z, a-z).";
 } else {
     nameError.textContent = "";
 }

}

function emailValidation(){
let emailInput = document.getElementById("emailID").value;
let emailError = document.getElementById("emailError");

const emailRegex = /^[a-zA-Z0-9._]+@gmail\.com$/;
    if (!emailRegex.test(emailInput)) {
       emailError.textContent = "Please enter a valid Gmail address (example: name@gmail.com)";
    }else{
    emailError.textContent="";
    }
}

function phoneValidation() {
    let phoneInput = document.getElementById("phoneID").value;
    let phoneError = document.getElementById("phoneError");

    const phoneRegex = /^\+91\s?[6-9]\d{9}$/;

    if (!phoneRegex.test(phoneInput)) {
        phoneError.textContent = " Invalid Indian phone number. Example: +91 9876543210";
    } else {
        phoneError.textContent = "";
    }
}

function ageValidation() {
    let ageInput = document.getElementById("ageID").value;
    let ageError = document.getElementById("ageError");

    if (ageInput < 15 || ageInput > 50) {
        ageError.textContent = " Age must be between 15 and 50.";
    } else {
        ageError.textContent = "";
    }
}

function genderValidation() {
    let genderInput = document.getElementById("genderID").value;
    let genderError = document.getElementById("genderError");

    if (genderInput === "Choose...") {
        genderError.textContent = " Please select your gender.";
    } else {
        genderError.textContent = "";
    }
}

function addressValidation() {
    let addressInput = document.getElementById("addressID").value;
    let addressError = document.getElementById("addressError");

    if (addressInput.trim().length < 5) {
        addressError.textContent = " Address must be at least 5 characters long.";
    } else {
        addressError.textContent = "";
    }
}


function passwordValidation() {
    let password = document.getElementById("passwordID").value;
    let confirmPassword = document.getElementById("ConfirmPasswordID").value;
    let passwordError = document.getElementById("PasswordError");

    const passwordRegex = /^(?=.*[A-Z])(?=(?:.*\d){3,})(?=.*[!@#$%^&*()_+\[\]{};':"\\|,.<>\/?]).{5,15}$/;

    if (!passwordRegex.test(password)) {
        passwordError.textContent = " Password must be 5–15 characters, include 1 uppercase, 3 digits, and 1 special character.";
    } else if (password !== confirmPassword) {
        passwordError.textContent = " Passwords do not match.";
    } else {
        passwordError.textContent = "";
    }
}
