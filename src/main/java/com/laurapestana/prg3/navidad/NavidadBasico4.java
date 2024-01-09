package com.laurapestana.prg3.navidad;

import java.util.Scanner;

public class NavidadBasico4 {

    private Scanner scanner; // Cambiado a campo de instancia

    // Constructor de la clase
    public NavidadBasico4() {
        scanner = new Scanner(System.in); // Inicializar el Scanner en el constructor


    // Método principal para ejecutar las operaciones

        // Operaciones con variables de tipo entero
        int a = 10;
        int b = 5;

        imprimirResultado("Suma", suma(a, b));
        imprimirResultado("Resta", resta(a, b));
        imprimirResultado("Multiplicación", multiplicacion(a, b));
        imprimirResultado("División", division(a, b));
        imprimirResultado("Resto de la división", restoDivision(a, b));


        // Descuento
        System.out.print("Ingrese el precio del artículo: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese el porcentaje de descuento: ");
        double descuento = scanner.nextDouble();
        double precioFinal = calcularPrecioConDescuento(precio, descuento);
        imprimirResultado("Precio final con descuento", precioFinal);

        // Conversión de segundos a horas, minutos y segundos
        System.out.print("Ingrese un número de segundos: ");
        int segundos = scanner.nextInt();
        String tiempoFormateado = convertirSegundosATiempo(segundos);
        imprimirResultado("Tiempo convertido", Double.parseDouble(tiempoFormateado));
    }

    // Métodos con tipo de retorno
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

    public double calcularPrecioConDescuento(double precio, double descuento) {
        return precio - (precio * (descuento / 100));
    }

    public String convertirSegundosATiempo(int segundos) {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = (segundos % 3600) % 60;
        return horas + "h " + minutos + "m " + segundosRestantes + "s";
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
