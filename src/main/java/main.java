/**
 * Created by mikealegria on 2/10/15.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void ejecutarFactor(Factores factores, long timeStart) {
        System.out.println("Los factores primos son:");
        factores.factores();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //  long timeEnd = (System.currentTimeMillis() - timeStart)/MICROSECONDS;
        System.out.println("\n Hola Mike");

        System.out.println("\nEl tiempo de ejucion es de " + ((System.currentTimeMillis() - timeStart)) + " Micro-Segundos");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el num: ");
        int num = Integer.parseInt(br.readLine());
        long time_ini = System.currentTimeMillis();
        log(time_ini + " TIMEPO ININICIAL");
//        Factores factores = new Factores(num);
//        factores.factores();

        Factorial factorial = new Factorial(num);
        // factorial.initDoWhile();
        //factorial.initFor();
        // factorial.initWhile();
        NumeroPefercto numeroPefercto = new NumeroPefercto(num);
        // numeroPefercto.init();
        hyperSuma();
        sumaRecursiva(1);

        long time_final = System.currentTimeMillis();
        log(time_final + " TIMEPO FINAL");
        long final_time = time_final - time_ini;
        log(final_time + " MILISEGUNDOS");


    }

    public static void log(String msg) {
        System.out.println("\n LOG==> " + msg);
    }
    /**
     * Escribir un programa que calcule Ia suma de los 1000000 primeros números enteros.
     * */
//
    public static void hyperSuma() {
        final int max = 1000000;
        int result = 0;

        for (int i = 0; i < max; i++) {
            result += i;
        }
        log("el resultado de la suma es " + result);

    }


    public static double sumaRecursiva(int n){
        if(n == 1000000){
            log("el resultado de la suma recursiva es " + n);
            return 1;
        }  //caso base

        else{
           // log("la suma va en " );
            return n + sumaRecursiva(n+1);
        }

    }

}
