package org.example;

/*************************************

 - Ejercicio Tema 8

 *************************************/

// Crear clase Persona.
// Crear variables las privadas edad, nombre y telefono de la clase Persona.
// Crear gets y sets de cada propiedad.
class Persona{
    private int edad;
    private String nombre, telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
}

public class Main {

    // Crear un objeto persona en el main.
    //Utiliza los gets y sets para darle valores
    // a las propiedades edad, nombre y telefono,
    // por último muéstralas por consola.

    public static void main(String[] args) {

        Persona yo = new Persona();
        yo.setNombre("Sam Anzueto");
        yo.setEdad(30);
        yo.setTelefono("+52123456789");
        System.out.printf("Me llamo %s, tengo %d%nPuedes llamarme al %s %n", yo.getNombre(), yo.getEdad(), yo.getTelefono() );
    }
}