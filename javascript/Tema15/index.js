let nombre = "Sam"
let apellido = "Anzueto"

const persona = {
    nombre,
    apellido
}

// console.log(persona)

// SessionStorage
// sessionStorage.setItem("persona", JSON.stringify(persona));

// // LocalStorage
// localStorage.setItem("persona", JSON.stringify(persona));

// Cookie (2min)
const d = new Date();
d.setTime(d.getTime() + (2*60*1000));
document.cookie = "persona="+persona.nombre+" "+persona.apellido+";expires="+ d.toUTCString();