package com.laurapestana.prg3;
import com.laurapestana.prg3.lib.LibIO;
import com.laurapestana.prg3.tema06.ejercicio25.Ejercicio25Profe;
import com.laurapestana.prg3.tema07.ejercicio01.Ejercicio01;
import com.laurapestana.prg3.tema06.ejercicio25.Ejercicio25;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("este es main");

        Ejercicio25Profe ejercicio25Profe=new Ejercicio25Profe();


        //llamo al constructor de Ejercicio01
        Ejercicio01 ejercicio01=new Ejercicio01();
        //solicita y valida a la vez y puedes poner el min y max
        int numero= LibIO.solicitarEntero("dame numero entero",1,100);
    }
}