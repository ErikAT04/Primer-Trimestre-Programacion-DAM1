package Estructuras_De_Control;

import java.util.Scanner;

public class EjsEstrucControlDos2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, mayor, menor;
        do {
            System.out.println("Escribe dos números positivos mayores a 0");
            num1=scan.nextInt();
            num2=scan.nextInt();
            if(num1>0||num2>0){
                break;
            }
            System.out.println("Alguno de los números introducidos es negativo, deberían ser ambos positivos para que funcione.");
        }while(true);
        if(num1>num2){
            mayor=num1;
            menor=num2;
        } else{
            mayor=num2;
            menor=num1;
        }
        System.out.println("Los números del 1 al " + num1 + " divisibles entre " + num2 + " son:");
        for(int i=num1; i!=0; i--){
            if(i%num2==0){
                System.out.println(i);
            }
        }
    }
}