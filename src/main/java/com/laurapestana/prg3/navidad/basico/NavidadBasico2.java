package com.laurapestana.prg3.navidad.basico;

import java.util.Scanner;

public class NavidadBasico2 {

    private Scanner scanner; // Cambiado a campo de instancia

    // Constructor de la clase
    public NavidadBasico2() {

        // Operaciones con variables de tipo real
        double aReal = 7.5;
        double bReal = 3.2;

        System.out.println(resultadoComoString("Suma (real)", sumaReal(aReal, bReal)));
        System.out.println(resultadoComoString("Resta (real)", restaReal(aReal, bReal)));
        System.out.println(resultadoComoString("Multiplicación (real)", multiplicacionReal(aReal, bReal)));
        System.out.println(resultadoComoString("División (real)", divisionReal(aReal, bReal)));
    }
    public double sumaReal(double a, double b) {
        return a + b;
    }

    public double restaReal(double a, double b) {
        return a - b;
    }

    public double multiplicacionReal(double a, double b) {
        return a * b;
    }

    public double divisionReal(double a, double b) {
        return a / b;
    }

    public String imprimirResultado(String operacion, double resultado) {
        return resultadoComoString(operacion, resultado);
    }

    // Método para convertir resultado a String
    public String resultadoComoString(String operacion, double resultado) {
        return operacion + ": " + resultado;
    }

}

