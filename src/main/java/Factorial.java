/**
 * Created on 3/7/15.
 * Punto #1 del taller:
 * Realizar un programa que calcule el factorial de un número, utilizando: ciclo for, while, dowhile
 */
public class Factorial {
    int num;
    long result = 1;// Se ejecuta 1 OE (Asignacion)
    int i = 1;//Se ejecuta 1 OE (Asignacion)

    //    contructor
    public Factorial(int num) {
        this.num = num;//Se ejecuta 1 OE (Asignacion)
    }

    public void initDoWhile() {
        if (validateNum()) {
            do // Se ejecuta 1 OE (Comparacion)
            {
                result *= i; // Se ejecutan 2 OE (Asignacion y Multiplicacion)

                i++; // Se ejecuta 1 OE (Incrementar)
            }

            while (i <= num);

            System.out.println("El Factrorial de " + num + " es = " + result);
            restoreAtrrs();
        }
    }

    public void initWhile() {
        if(validateNum()){
            while (i <= num) // Se ejecuta 1 OE (Comparacion)
            {
                result *= i; // Se ejecutan 2 OE (Asignacion y Multiplicacion)

                i++; // Se ejecuta 1 OE (Incrementar)
            }
            System.out.println("El Factrorial de " + num + " es = " + result);
            restoreAtrrs();
        }
    }

    public void initFor() {
        if (validateNum()) {
            for (int i = 1; i <= num; i++) // Se ejecuta 3 OE (Asignacion, comparacion e incremento)
            {
                result *= i; // Se ejecuta 2 OE (Asignacion y multiplicacion)
            }
            System.out.println("El Factrorial de " + num + " es = " + result);
            restoreAtrrs();
        }


    }

    private boolean validateNum() {
        if (num < 2 || num > 1000) // Se ejecutan 2 OE (Comparacion)
        {
            System.out.println("El num no esta comprendido en el rango... (2 - 1000)");
            return false;
        } else {
            return true;
        }

    }

    private void restoreAtrrs() {
        result = 1;// Se ejecuta 1 OE (Asignacion)
        i = 1;//Se ejecuta 1 OE (Asignacion)
    }
}
