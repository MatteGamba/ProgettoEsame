const URL_cliente = "http://localhost:8080/api/cliente/all";

const loginBtn = document.getElementById("button");
const error = document.getElementById("error");

loginBtn.addEventListener("click", (e) => {
e.preventDefault();
const username = document.getElementById("codice-utente").value;
const password = document.getElementById("password").value;


if (username === "1"  && password === "1234546789") {
location.href="http://localhost:8080/home.html";
} else {

error.append("Credenziali errate")
}
})