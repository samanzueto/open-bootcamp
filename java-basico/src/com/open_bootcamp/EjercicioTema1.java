package com.open_bootcamp;

public class EjercicioTema1 {
    public static void main(String[] args) {
        // Numéricos
        byte    numero1 = 5;
        short   numero2 = 10;
        int     numero3 = 15;
        long    numero4 = 20;

        float   numero5 = 25.3f;
        double  numero6 = 35.45d;

        // Texto
        char    texto1 = 'a';
        String  texto2 = "Este es un texto";

        // Booleano
        boolean verdadero = false;

        System.out.printf("byte %d%n", numero1);
        System.out.printf("short %d%n", numero2);
        System.out.printf("int %d%n", numero3);
        System.out.printf("long %d%n", numero4);
        System.out.printf("float %f%n", numero5);
        System.out.printf("double %f%n", numero6);

        System.out.printf("char %c%n", texto1);
        System.out.printf("String %s%n", texto2);

        System.out.printf("boolean %b%n", verdadero);
    }
}
