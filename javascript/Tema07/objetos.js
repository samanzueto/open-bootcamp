const persona = {
    nombre: "Sam",
    apellido: "Anzueto",
    edad: 30,
    altura: 1.53,
    eresDesarrollador: true
}

let {edad} = persona;
console.log(edad);

const amigos = [
    {...persona},
    {
        nombre: "Kriss",
        apellido: "Y",
        edad: 33,
        altura: 1.53,
        eresDesarrollador: false
    },
    {
        nombre: "Anto",
        apellido: "E",
        edad: 30,
        altura: 1.65,
        eresDesarrollador: false
    }
]

const ordenados = amigos.sort((a, b) => b.edad - a.edad);
console.log(ordenados);