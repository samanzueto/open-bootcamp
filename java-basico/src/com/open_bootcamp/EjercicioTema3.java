package com.open_bootcamp;
/**
 * 
    Crear un bucle que permita concatenar textos y imprima el resultado final por consola.
    Concatenar nombres
    Los textos pueden venir de un array String
    String[] nombres = {"", "", "", ""};
    Separados por un espacio
    Se puede usar el método concat o si no el operador + Ejemplo
    "Pepe", "Juan", "Anthony" Resultado:
    Pepe Juan Anthony (en la misma línea)

 */
public class EjercicioTema3 {
    public static void main(String[] args) {
        String[] nombres = { "Sam", "Alejandra", "Judith", "Cris" };

        for(String nombre : nombres)
            System.out.print(nombre + " ");
    }

}
