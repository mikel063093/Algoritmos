import java.util.ArrayList;

/**
 * Created on 3/7/15.
 * Realizar un programa que encuentre un (s) número natural (del 0 al 10000), el cual es
 igual a la suma de sus divisores propios positivos, sin incluirse él mismo.
 */
public class NumeroPefercto {
    int num;
  ArrayList<Integer> numList = new ArrayList<Integer>();
    public NumeroPefercto(int num) {
        this.num = num; //Se ejecuta 1 OE (Asignacion)
    }
    private boolean validateNum(){
        if(num>0 && num<=10000){
            return  true;
        }else{
            return false;
        }
    }
    public void init(){
        if(validateNum()){
            int result=0;// Se ejecuta 1 OE (Asignacion)
            for (int i = 1; i <num ; i++) {
                if(num%i==0) //Se ejecuta 2 OE (Comparacion & Modulo)
                {
                    result+=i;//Se ejecutan 2 OE (Asignacion y Suma)
                    numList.add(i);

                    if(result==num)// Se ejecuta 1 OE (Comparacion)
                    {
                        System.out.println("hemos hallado la suma perfecta de "+num);
                        for (int j = 0; j < numList.size() ; j++) {
                            System.out.println("numeros hallados de la suma perfecta :: "+numList.get(j));
                        }
                        break;
                    }
                }
            }
        }else{
            System.out.println("valor fuera del rango 0-10000");
        }
    }
}
