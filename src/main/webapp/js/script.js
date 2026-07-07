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