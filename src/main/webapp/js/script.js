const username = document.getElementById("username");
const card = document.getElementById("usernameCard");
const registerBtn = document.getElementById("registerBtn");

// Hide card on page load
card.innerHTML = "";
card.style.display = "none";


username.addEventListener("input", function () {
    let uname = username.value.trim();

    if (uname === "") {
        card.style.display = "none";
        registerBtn.disabled = false;
        registerBtn.innerHTML = "Register";
        return;
    }

    fetch("checkUsername?username=" + encodeURIComponent(uname))
        .then(response => response.text())
        .then(data => {

            if (data === "EXISTS") {

                card.style.display = "block";
                card.innerHTML = "❌ Username already exists! Please try another username.";

                registerBtn.disabled = true;
                registerBtn.innerHTML = "Username Not Available";

            } else {

                card.style.display = "none";

                registerBtn.disabled = false;
                registerBtn.innerHTML = "Register";

            }

        })
        .catch(error => {

            console.error(error);

        });

});
const password=document.getElementById("password");
const confirmPassword=document.getElementById("confirmPassword");
const passwordMessage=document.getElementById("passwordMessage");

confirmPassword.addEventListener("input",function(){

    if(confirmPassword.value===""){
        passwordMessage.style.display="none";
        registerBtn.disabled=false;
        return;
    }

    if(password.value!==confirmPassword.value){

        passwordMessage.style.display="block";
        passwordMessage.innerHTML="❌ Passwords do not match.";

        registerBtn.disabled=true;

    }else{

        passwordMessage.style.display="none";

        registerBtn.disabled=false;

    }

});