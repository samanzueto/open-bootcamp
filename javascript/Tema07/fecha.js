let hoy = new Date();
let nacimiento = new Date(1991, 8, 9);

let tarde = hoy > nacimiento;

let dia = nacimiento.getDate();

let mes = nacimiento.getMonth()+1;

let anyo = nacimiento.getFullYear();

console.log(tarde, dia, mes, anyo);