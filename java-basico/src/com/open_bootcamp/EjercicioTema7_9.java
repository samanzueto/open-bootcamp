package com.open_bootcamp;


import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

/**
 * Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".

    Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

    Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

    Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.

    Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

    Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

    Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

    Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

    Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

    Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
 */
public class EjercicioTema7_9 {
    public static void main(String[] args) {
        /*
        System.out.println(reverse("hola mundo"));
        arrayUnidimensional();
        arrayBidimensional();
        vectores();
        arrayLinked();
        arrayList();
        try {
            dividePorCero();
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de código");
        }
        */
        archivos("fichero.txt", "copia-fichero.txt");
    }

    private static void archivos(String fileIn, String fileOut) {
        try {
            InputStream original = new FileInputStream(fileIn);
            byte[] datos = original.readAllBytes();

            PrintStream copia = new PrintStream(fileOut);
            copia.write(datos);

        }catch (Exception e){
            System.out.println("No se pudo copiar " + e.getLocalizedMessage());
        }
    }

    private static void dividePorCero() throws ArithmeticException{
        System.out.println(30/0);
    }

    private static void arrayList() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }

        numeros.removeIf(n -> (n%2 == 0));

        // Recorrer un ArrayList con un Iterador
        Iterator<Integer> iterador = numeros.iterator();
        while(iterador.hasNext())
            System.out.println(iterador.next());
    }

    private static void arrayLinked() {
        ArrayList<String> listado = new ArrayList<String>(4);
        listado.add("Sam");
        listado.add("Cris");
        listado.add("Anto");
        listado.add("Andy");

        LinkedList<String> enlazado = new LinkedList<>(listado);
        for (int i = 0; i < listado.size(); i++) {
            System.out.printf("Listado: %s | Enlazado: %s %n", listado.get(i), enlazado.get(i));
        }
    }

    private static void vectores() {
        Vector<Integer> enteros = new Vector<Integer>();
        for (int i = 0; i < 6; i++) {
            enteros.add(i);
        }

        enteros.remove(2);
        enteros.remove(3);

        System.out.println(enteros);
        System.out.println("El problema de usar Vectores radica en el consumo de recursos entre cada incremento.");

    }

    private static void arrayBidimensional() {
        int arrayBidimensional[][] = {
                { 1, 2 , 3 , 4, 5, 6},
                { 10, 20, 30, 40, 50, 60}
        };

        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length ; j++) {
                System.out.printf("Posicion: %d,%d | Valor: %d %n", i,j,arrayBidimensional[i][j]);
            }
        }
    }

    private static void arrayUnidimensional() {
        String[] nombres = {"Sam", "Alejandra", "Judith", "Alberto"};
        for (String nombre :
                nombres) {
            System.out.println(nombre);
        }
    }

    public static String reverse(String texto) {
        String reverse = "";
        for(int i = texto.length()-1; i >= 0; i--){
            reverse += texto.charAt(i);
        }
        return reverse;
    }
}
