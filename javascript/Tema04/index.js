let nombre = "Sam A";
let apellido = "Anzueto";
let estudiante = nombre.concat(" ", apellido);
let estudianteMayus = estudiante.toUpperCase();
let estudianteMinus = estudiante.toLowerCase();
let letras = estudiante.length;
let inicialNombre = nombre.charAt();
let finalApellido = apellido.charAt(apellido.length-1);
let sinEspacios = estudiante.replace(/\x20/g, "");
let isNombre = estudiante.includes(nombre);

console.log(nombre, apellido, estudiante, estudianteMayus, estudianteMinus, letras, inicialNombre, finalApellido, sinEspacios, isNombre);