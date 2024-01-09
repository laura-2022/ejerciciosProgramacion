package com.laurapestana.prg3.navidad.conversion;

import java.util.Scanner;

public class NavidadConv1 {
    private static Scanner scanner = new Scanner(System.in);
    public NavidadConv1(){

        // Solicitar al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero: ");
        int numeroEntero = scanner.nextInt();

        // Calcular el doble del número como un número real utilizando una función
        double resultado = calcularDobleComoReal(numeroEntero);

        // Imprimir el resultado
        System.out.println("El doble del número como un número real es: " + resultado);

        // Cerrar el scanner
        scanner.close();
    }

    // Función para calcular el doble del número como un número real
    public static double calcularDobleComoReal(int numero) {
        return 2 * (double) numero;
    }
}


