package com.poo.abstraccion;

public abstract class Figura {

    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularArea();

    // método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Figura: " + nombre);
        System.out.println("Área: " + calcularArea());
        System.out.println("-------------------");
    }
}