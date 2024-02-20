package Estructuras_De_Control;

import java.util.Scanner;
public class EjsEstrucControlDos7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num,cifras=0;
        System.out.println("Escribe un número de hasta 5 cifras y te diré cuántas cifras tiene");
        do {
            num=scan.nextInt();
            if(num>=-99999&&num<=99999)
                break;
            System.out.println("Este número no es válido, tiene más de 5 cifras.\nEscribe otro.");
        }while(true);
        do{
            num=num/10;
            cifras++;
        }while(num!=0);
        System.out.println("El número tiene " + cifras + " cifras");
    }
}