/**
 * Created by mikealegria on 2/10/15.
 */
public class Factores {
    int numero;

    public Factores(int numero) {
        this.numero = numero;
    }

    public void factores() {

        for (int i = 2; i <= numero; i++) {


            while (numero % i == 0) {
                numero = numero / i;
                System.out.print(i + "  ");
                //Para evitar hacer cálculos innecesarios :
                if (numero == 1) {
                   //360 System.out.println("1 exit");
                 //  System.exit(0);
                    break;
                }
            }
        }
    }
}
