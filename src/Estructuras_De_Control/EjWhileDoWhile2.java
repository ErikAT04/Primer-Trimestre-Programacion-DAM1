package Estructuras_De_Control;

import java.util.Scanner;

public class EjWhileDoWhile2 {
    public static void main(String[] args) {
        int suma=0, num=0, i=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Comience a meter números para calcular su media.\nUna vez quieras finalizar, introduzca un númmero negativo");
        do {
            suma=suma+num;
            num=scan.nextInt();
            if(num>=0){
                i++;
            }
        }while(num>=0);
        System.out.println("Operación finalizada");
        double media = (double)suma/i;
        System.out.println("La media de los números introducidos es " + media);
    }
}
