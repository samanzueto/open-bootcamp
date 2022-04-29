package org.example;

/*************************************

- Ejercicio Tema 4 

Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:

Incrementar el valor de la variable en uno cada vez que se ejecute.

Mostrarlo por pantalla cada vez que se ejecute.

Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.

*************************************/

public class Main {
    public static void main(String[] args) {

        // Imprimir mensaje de la funcion numero
        System.out.println(numero(20));

        // Declaramos variable numeroWhile
        int numeroWhile = 1;

        // Condicional numeroWhile sea menor que 3
        while( numeroWhile < 3 ){
            // Incrementamos numeroWhile en 1
            numeroWhile++;

            // Imprimir mensaje
            System.out.println(numeroWhile);
        }

        // Condicional numeroWhile sea menor que 3
        do{
            // Incrementamos numeroWhile en 1
            numeroWhile++;

            // Imprimir mensaje
            System.out.println(numeroWhile);
        }while( numeroWhile < 3 )

        for(int numeroFor=0; numeroFor<=3; numeroFor++){
            System.out.println(numeroFor);
        }

        String estacion = "invierno";
        switch(estacion){
            case "primareva":
            case "verano":
            case "otoño"
            case "invierno":
                System.out.println("Es "+estacion);
                break;
            default: System.out.println("No es una estacion");
        }
    }

    // Devuelve un String y recibe un Integer
    public static String numero(int numeroIf){
        // Declaramos variable msg
        String msg = "Es un 0 (cero)";

        // Condicional menor que 0 => negativo
        if(numeroIf < 0) msg = "Es un número negativo";
        // Condicional mayor que 0 => positivo
        else if(numeroIf > 0) msg = "Es número positivo"

        // Devuelve mensaje
        return msg;
    }
}