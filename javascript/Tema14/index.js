const btn = document.getElementById("btn");

btn.addEventListener("click", e => {
 alert("click en el botón")
});

$(document).ready(() => {
    $('#btn').click(() => {
        console.log("Hola, estoy utilizando jQuery");
    });
});