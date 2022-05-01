package org.example;

/*************************************

 - Ejercicio Tema 9

 *************************************/

/**
 * Crea una clase Persona con las siguientes variables:
 * La edad
 * El nombre
 * El teléfono.
 */
class Persona{
    byte edad;
    String nombre, telefono;

    public Persona(String nombre, String telefono, byte edad){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}

/**
* Crea una nueva clase Cliente que herede de Persona.
* Esta nueva clase tendrá la variable credito solo para esa clase.
* */
class Cliente extends Persona{
    private int credito;

    Cliente(String nombre, String telefono, byte edad, int credito){
        super(nombre,telefono,edad);
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                ", credito=" + credito +
                '}';
    }
}

/**
 *  clase Trabajador que herede de Persona,
 *  y con una variable salario que solo tenga la clase Trabajador.
 */
class Trabajador extends Persona{
    private int salario;

    Trabajador(String nombre, String telefono, byte edad, int salario){
        super(nombre,telefono,edad);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }
}

public class Main {

    /**
     * Crea ahora un objeto de la clase Cliente
     * que debe tener como propiedades
     * la edad, el telefono, el nombre y el credito,
     * tienes que darles valor y mostrarlas por pantalla.
     *
     * @param args
     */

    public static void main(String[] args) {
        Persona yo = new Cliente("Sam Anzueto","+52123456789", (byte) 30, 2000);
        Persona tu = new Trabajador("Ale J","+54123456789", (byte) 40, 40000);
        System.out.printf("%s%n%s",yo, tu);
    }
}