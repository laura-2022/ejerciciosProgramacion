package com.laurapestana.prg3.tema06.ejercicio25;


import java.util.Arrays;

public class Ejercicio25Profe {
    public static final int longitud = 50;

    public Ejercicio25Profe() {
        int[] arrayV = rellenarArray();
        int[] arrayP = imprimirArrayP(arrayV);
        if(arrayP==null){
            System.out.println("no hay pares");
        }else {
            System.out.println(Arrays.toString(arrayP));
        }

        // Imprimo el array P con Arrays.toString()

    }

    // Relleno el array con función Math.random()
    private int[] rellenarArray() {
        int[] arrayV = new int[longitud];
        for (int i = 0; i < arrayV.length; i++) {
            arrayV[i] = (int) (Math.random() * 100);
        }
        return arrayV;
    }

    // Imprimo el array P rellenado con los números pares
    private int[] imprimirArrayP(int[] arrayV) {
        int contador = 0;

        // Cuento la cantidad de elementos pares
        for (int e : arrayV) {
            if (e % 2==0) {
                contador++;
            }
        }
        if (contador==0) {
            return null; //retorno null si no hay pares
        }

        // Creo el array P con la longitud exacta necesaria
        int[] arrayP = new int[contador];
        contador = 0; // Reinicio el contador para rellenar y que el for este tambien a cero a la hora re recorrer array y pasar los datos

        // Relleno el array P con los números pares
        for (int i = 0; i < arrayV.length; i++) {
            if (arrayV[i] % 2==0) {
                arrayP[contador] = arrayV[i];
                contador++;
            }
        }
        return arrayP;
    }

}






