function singUpValidation(event) {
    // Prevent default submission for validation
//    event.preventDefault();

    // Get form elements
    const name = document.getElementById("NameID").value.trim();
    const email = document.getElementById("floatingInput").value.trim();
    const phone = document.getElementById("phoneID").value.trim();
    const age = parseInt(document.getElementById("ageID").value);
    const gender = document.getElementById("genderID").value;
    const address = document.getElementById("addressID").value.trim();
    const password = document.getElementById("passwordID").value;
    const confirmPassword = document.getElementById("ConfirmPasswordID").value;

    // Name validation
    if (name.length < 3 || name.length > 10) {
        alert("Name must be at least 3 characters and at Most 10 character");
        return false;
    }


    const emailRegex = /^[a-zA-Z0-9._]+@gmail\.com$/;
    if (!emailRegex.test(email)) {
        alert("Email must be a valid Gmail address and can only contain letters, numbers, '.', and '_'. Example: example@gmail.com");
        return false;
    }

    // Phone number validation (Indian format)
    const phoneRegex = /^\+91\s?[6-9]\d{9}$/;
    if (!phoneRegex.test(phone)) {
        alert("Please enter a valid Indian phone number (e.g., +91 98765 43210).");
        return false;
    }

    // Age validation
    if (isNaN(age) || age < 15 || age > 50) {
        alert("Please enter a valid age between 15 and 60.");
        return false;
    }

    // Gender validation
    if (gender === "Choose...") {
        alert("Please select your gender.");
        return false;
    }

    // Address validation
    if (address.length < 5) {
        alert("Address must be at least 5 characters long.");
        return false;
    }

    // Password validation
 const passwordRegex = /^(?=.*[A-Z])(?=(?:.*\d){3,})(?=.*[!@#$%^&*()_+[\]{};':"\\|,.<>/?]).{5,15}$/;
 if (!passwordRegex.test(password)) {
     alert("Password must be 5-15 characters long, include at least 1 uppercase letter, 1 special character, and 3 digits.");
     return false;
 }

    if (password !== confirmPassword) {
        alert("Passwords do not match.");
        return false;
    }

    // All validations passed → submit form
    return true;
}

function singUpValidation(event) {
 const email = document.getElementById("floatingInput").value.trim();
  const password = document.getElementById("passwordID").value;


   const emailRegex = /^[a-zA-Z0-9._]+@gmail\.com$/;
      if (!emailRegex.test(email)) {
          alert("Email must be a valid Gmail address and can only contain letters, numbers, '.', and '_'. Example: example@gmail.com");
          return false;
      }


  const passwordRegex = /^(?=.*[A-Z])(?=(?:.*\d){3,})(?=.*[!@#$%^&*()_+[\]{};':"\\|,.<>/?]).{5,15}$/;
   if (!passwordRegex.test(password)) {
       alert("Password must be 5-15 characters long, include at least 1 uppercase letter, 1 special character, and 3 digits.");
       return false;
   }

   return true;
}




