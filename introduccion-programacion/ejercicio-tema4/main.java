package org.example;

/*************************************

 - Ejercicio Tema 4

 *************************************/

public class Main {
    public static void main(String[] args) {

        System.out.println(numero(-20));

        // Crea un bucle While,
        // este bucle tendrá que tener como condición
        // que la variable numeroWhile sea inferior a 3,
        // el bloque de código que tendrá el bucle deberá:
        // 1) Incrementar el valor de la variable en uno
        // cada vez que se ejecute.
        // 2) Mostrarlo por pantalla cada vez que se ejecute.

        int numeroWhile = 1;
        while( numeroWhile < 3 ){
            numeroWhile++;
            System.out.println("While: " + numeroWhile);
        }

        // Para el bucle Do While, deberás crear la misma estructura
        // que en el While, pero solo se debe ejecutar una vez.

        do{
            numeroWhile++;
            System.out.println("Do While: " +numeroWhile);
        }while( numeroWhile < 3 );

        // Para el bucle For, crea una variable numeroFor,
        // esta variable tendrá como valor 0 y
        // su condición será que la variable sea
        // igual o menor que 3, se irá incrementando en 1 su valor
        // cada vez que se ejecute y deberá mostrarse por pantalla.

        for(int numeroFor=0; numeroFor<=3; numeroFor++){
            System.out.println("For: " +numeroFor);
        }

        // Por último, para el Switch,
        // deberás crear la variable estacion, y
        // distintos case para las cuatro estaciones del año.
        // Dependiendo del valor de la variable estacion
        // se deberá mandar un mensaje por consola informando
        // de la estación en la que está.
        // También habrá que poner un default para cuando
        // el valor de la variable no sea una estación.

        String estacion = "verano";
        switch(estacion){
            case "primareva":
            case "verano":
            case "otoño":
            case "invierno":
                System.out.println("Es "+estacion);
                break;
            default: System.out.println("No es una estacion");
        }
    }

    // Usando un if, crear una condición que compare
    // si la variable numeroIf es positivo, negativo, o 0.
    // Pista: Los números inferiores a 0 son negativos
    // y los superiores, positivos.
    public static String numero(int numeroIf){
        String msg = "Es un 0 (cero)";
        if(numeroIf < 0) msg = "Es negativo";
        else if(numeroIf > 0) msg = "Es positivo";
        return msg;
    }
}