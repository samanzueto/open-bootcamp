package com.open_bootcamp;

/**
 * En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

    Agregaréis atributos tal cual tendrían esos objetos en la realidad.

    Crear constructor vacío y con todos los parámetros para cada clase.

    Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */

public class EjercicioTema4 {

    public static void main(String[] args) {
        SmartDevice celular = new SmartPhone(5000,5.5f, "Galaxy J4", "Samsung");
        SmartDevice reloj = new SmartWatch(3000,2.5f, "R1", "Xiaomi", "piel");

        System.out.printf("%s%n%s", celular, reloj);
    }
    
}

class SmartDevice{
    int bateria;
    float pantalla;
    String modelo,
           marca;

    SmartDevice(int bateria, float pantalla, String modelo, String marca){
        this.bateria = bateria;
        this.pantalla = pantalla;
        this.modelo = modelo;
        this.marca = marca;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        
        return "SmartDevice{" +
        "bateria='" + bateria + '\'' +
        ", pantalla='" + pantalla + '\'' +
        ", modelo=" + modelo +
        ", marca=" + marca +
        '}';
    }
}

class SmartPhone extends SmartDevice{
    SmartPhone(int bateria, float pantalla, String modelo, String marca){
        super(bateria, pantalla, modelo, marca);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        
        return "SmartPhone{" +
                "bateria='" + bateria + '\'' +
                ", pantalla='" + pantalla + '\'' +
                ", modelo=" + modelo +
                ", marca=" + marca +
                '}';
    }
}

class SmartWatch extends SmartDevice{
    
    String tipoCorrea;

    SmartWatch(int bateria, float pantalla, String modelo, String marca, String tipoCorrea){
        super(bateria, pantalla, modelo, marca);
        this.tipoCorrea = tipoCorrea;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "SmartWatch{" +
                "bateria='" + bateria + '\'' +
                ", pantalla='" + pantalla + '\'' +
                ", modelo=" + modelo +
                ", marca=" + marca +
                ", correa=" + tipoCorrea +
                '}';
    }  
}

