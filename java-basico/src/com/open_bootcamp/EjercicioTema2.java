package com.open_bootcamp;

/**
 * Crear una función que reciba un precio y
 * devuelva el precio con el IVA incluido
 */
public class EjercicioTema2 {

    public static void main(String[] args) {

        float precio = 98.50f;

        System.out.printf(
                "Precio sin IVA: $%3.2f%n" +
                "Precio con IVA: $%3.2f%n",
                precio, aplicarIVA(precio));
    }

     public static float aplicarIVA(float precio) {
        return (float) (precio * 1.16);
    }
}
