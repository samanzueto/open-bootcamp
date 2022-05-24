class Estudiante {
    nombre;
    asignaturas = ['JavaScript', 'HTML', 'CSS'];

    constructor(nombre = "Jhon Doe"){
        this.nombre = nombre;
    }

    obtenDatos(){
        return `Soy el estudiante ${this.nombre} y mis asignaturas son ${this.asignaturas}`;
    }
}

const estudiante = new Estudiante("Sam");

console.log(estudiante.obtenDatos());