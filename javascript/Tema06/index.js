let compra = ["leche", "arroz", "frijol", "harina", "pasta"];
compra.push("Aceite de Girasol");
compra.pop();
console.log(compra);

let favoritas = [
    {
        titulo: "Orgullo y Prejuicio",
        director: "Joe Wright",
        fecha: new Date(2006, 1, 10)
    },
    {
        titulo: "Un amor para recordar",
        director: "Adam Shankman",
        fecha: new Date(2002, 4, 21)
    },
    {
        titulo: "Ya te extraño",
        director: "Catherine Hardwicke",
        fecha: new Date(2015, 11, 25)
    }
]

let reciente = new Date(2010, 01, 01);
let recientes = favoritas.filter(peli => peli.fecha >= reciente);
console.log(recientes);

let directores = favoritas.map(peli => peli.director);
console.log(directores);

let titulos = favoritas.map(peli => peli.titulo);
console.log(titulos);

let peliculas = directores.concat(titulos);
console.log(peliculas);

let peliculasP = [...directores, ...titulos];
console.log(peliculasP);