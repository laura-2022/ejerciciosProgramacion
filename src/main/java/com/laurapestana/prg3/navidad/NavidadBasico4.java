package com.laurapestana.prg3.navidad;

import java.util.Scanner;

public class NavidadBasico4 {


        private static Scanner scanner = new Scanner(System.in);

        // Constructor de la clase
        public NavidadBasico4() {
            // Conversión de segundos a horas, minutos y segundos
            System.out.print("Ingrese un número de segundos: ");
            int segundos = scanner.nextInt();
            String tiempoFormateado = convertirSegundosATiempo(segundos);
            System.out.println(resultadoComoString("Tiempo convertido", tiempoFormateado));
        }

        public String convertirSegundosATiempo(int segundos) {
            int horas = segundos / 3600;
            int minutos = (segundos % 3600) / 60;
            int segundosRestantes = (segundos % 3600) % 60;
            return horas + "h " + minutos + "m " + segundosRestantes + "s";
        }

        public String resultadoComoString(String operacion, String resultado) {

            return operacion + ": " + resultado;
        }
    }
