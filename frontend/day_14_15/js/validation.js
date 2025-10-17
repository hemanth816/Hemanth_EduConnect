function login() {
   let username = document.getElementById("loginUsername").value;
   let password = document.getElementById("loginPassword").value;
    // You can perform login validation and authentication here
    // For simplicity, let's just display an alert
    console.log(`Login clicked. Username: ${username}, Password: ${password}`);
    
}

function register() {
   
    let registerName = document.getElementById("registerName").value;
    let registerEmail = document.getElementById("registerEmail").value;
    let registerUsername = document.getElementById("registerUsername").value;
    let registerPassword = document.getElementById("registerPassword").value;
    // Frontend validation for registration form
    console.log(`Register clicked. Name: ${registerName}, Email: ${registerEmail}, Username: ${registerUsername}, Password: ${registerPassword}`);

    // Validate email format
    // if(/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]/.test(registerEmail)){
    //     alert("Email Format wrong");
    // }
    // Validate username (no special characters)
    

    // Validate password (at least 8 characters, one capital letter, and one numeric)
    
}
module.exports = { login, register };
