package com.openbootcamp.ejercicio3al5.models;

// POJO -> Plain Old Java Object
public class Bootcamper {
    private String nombre;
    private double valor;

    public Bootcamper() {}

    public Bootcamper(String nombre) {
        this.nombre = nombre;
        this.valor = Math.random();
    }

    public Bootcamper(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Bootcamper{" +
                "nombre='" + nombre + '\'' +
                ", valor=" + valor +
                '}';
    }
}
