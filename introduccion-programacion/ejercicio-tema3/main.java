package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(suma(20,30,5));

        Coche bochito=new Coche(4);
        bochito.agregarPuerta();

        System.out.println(bochito.puertas);
    }

    public static int suma(int x, int y, int z){
        return x+y+z;
    }
}

class Coche {
    int puertas=0;

    public Coche(int i) {
        this.puertas=i;
    }

    public void agregarPuerta(){
        this.puertas++;
    }
}