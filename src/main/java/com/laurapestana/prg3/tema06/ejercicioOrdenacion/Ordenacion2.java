package com.laurapestana.prg3.tema06.ejercicioOrdenacion;
import java.util.Random;

/**
 * The type Ordenacion 2.
 */
public class Ordenacion2 {
    public static final  int MIN=50;
    public static final int MAX=100;
    public static final int LONGITUD=10;


    public Ordenacion2() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++ORDENACION DE ARRAYS++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int nums[]= rellenarArray(MIN,MAX,LONGITUD);
        int otros[]= {14,3,77,4,23};

        System.out.println("*Array aleatorios sin ordenar: "+imprimirArray(nums));
        System.out.println("*Array otros sin ordenar: "+imprimirArray(otros));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //ARRAY RESULTADO ES EL QUE LLAMA A ORDENAR
        int resultado[]=ordenarArray(nums);
        int resultado2[]=ordenarArray(otros);

        System.out.println("*Array aleatorios ordenado: "+imprimirArray(resultado));
        System.out.println("*Array otros ordenado: "+imprimirArray(resultado2));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


    }

    // Relleno el array con función Math.random()
    private int[] rellenarArray(int MIN, int MAX, int LONGITUD) {
        int[] arr = new int[LONGITUD];
        Random rnd = new Random();

        for (int i = 0; i < LONGITUD; i++) {
            arr[i] = rnd.nextInt(MAX - MIN + 1) + MIN; // Rellena con valores aleatorios entre 0 y 99 (puedes ajustar según tus necesidades)
        }
        return arr;
    }

    //ORDENO ARRAY CON AUXILIAR

    private int[] ordenarArray(int[] array) {
        for(int i=0;i<array.length-1;i++) {
            for(int j=i+1;j<array.length;j++) {
                if(array[i]>=array[j]){//intercambiamos
                    int aux=array[i];
                    array[i]=array[j];
                    array[j]=aux;
                }
            }
        }
        return array;
    }
    //IMPRIMO STRING CON ARRAY
    private String imprimirArray(int[] array) {
        // TODO Auto-generated method stub
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<array.length;i++) {

            if(i<array.length-1) {
                sb.append(array[i]).append(",");

            }else {
                sb.append(array[i]);
            }
        }
        return sb.toString();

    }

}
