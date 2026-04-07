package com.poo.abstraccion;

public class Main {

    public static void main(String[] args) {

        Figura circulo = new Circulo("Circulo", 5);
        Figura rectangulo = new Rectangulo("Rectangulo", 4, 6);

        circulo.mostrarInformacion();
        rectangulo.mostrarInformacion();
    }
}