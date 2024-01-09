package com.laurapestana.prg3.navidad;

import java.util.Scanner;

public class NavidadBasico1 {

    private Scanner scanner; // Cambiado a campo de instancia

    // Constructor de la clase
    public NavidadBasico1() {
        // Operaciones con variables de tipo entero
        int a = 10;
        int b = 5;

        System.out.println(imprimirResultado("Suma", suma(a, b)));
        System.out.println(imprimirResultado("Resta", resta(a, b)));
        System.out.println(imprimirResultado("Multiplicación", multiplicacion(a, b)));
        System.out.println(imprimirResultado("División", division(a, b)));
        System.out.println(imprimirResultado("Resto de la división", restoDivision(a, b)));

    }

    // Métodos operaciones basicas
    public int suma(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public int multiplicacion(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public int restoDivision(int a, int b) {
        return a % b;
    }


    // Nuevo método para imprimir los resultados y tener tipo de retorno
    public String imprimirResultado(String operacion, double resultado) {
        return resultadoComoString(operacion, resultado);
    }

    // Método para convertir resultado a String
    public String resultadoComoString(String operacion, double resultado) {
        return operacion + ": " + resultado;
    }



}

