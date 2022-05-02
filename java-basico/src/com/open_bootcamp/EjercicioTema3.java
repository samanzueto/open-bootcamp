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

        System.out.printf("%s%n",concatenarNombres(nombres));
    }

    private static Object concatenarNombres(String[] nombres) {
        String nombreCompleto = "";
        for(String nombre : nombres)
            nombreCompleto += nombre + " ";
        return nombreCompleto;
    }

}
