package com.laurapestana.prg3.navidad;
import java.util.Scanner;

public class NavidadBasico3 {
    private static Scanner scanner = new Scanner(System.in);
    // Constructor de la clase
    public NavidadBasico3() {

        // Descuento
        System.out.print("Ingrese el precio del artículo: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese el porcentaje de descuento: ");
        double descuento = scanner.nextDouble();
        double precioFinal = calcularPrecioConDescuento(precio, descuento);
        System.out.println(resultadoComoString("Precio final con descuento", precioFinal));
        scanner.close();
    }

    // Otros métodos de la clase
    public double calcularPrecioConDescuento(double precio, double descuento) {
        return precio - (precio * (descuento / 100));
    }

    public String imprimirResultado(String operacion, double resultado) {
        return resultadoComoString(operacion, resultado);
    }

    // Método para convertir resultado a String
    public String resultadoComoString(String operacion, double resultado) {
        return operacion + ": " + resultado;
    }
}
