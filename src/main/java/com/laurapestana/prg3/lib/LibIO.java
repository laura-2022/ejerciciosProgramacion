package com.laurapestana.prg3.lib;
import java.util.Random;
import java.util.Scanner;
public class LibIO {
    public static final Scanner scanner = new Scanner(System.in);
    //metodo solicita y valida a la vez y puedes poner el min y max
    public static int solicitarEntero(String mensaje, int min, int max) {
        boolean valido;

        int value;
        do {
            System.out.println(mensaje);
            value = Integer.parseInt(scanner.nextLine());
            valido = (value >= min || value <= max);
            if(!valido){
                System.out.println("solo numeros entre"+min+ "y"+max);
            }
        } while (!valido);

        return value;
    }
    public static Random random=new Random();
    public static int randomInt(int min, int max){

        int resultado=random.nextInt(max-min+1)+min; //puedo poner return antes del r.ne..
        return resultado;
    }


    public static double randomDouble(double min, double max){
        //ÇRandom r=new Random();
        double resultado=random.nextDouble()*(max-min+1)+min; //puedo poner return antes del r.ne..
        return resultado;
    }

}

