package Estructuras_De_Control;

import java.util.Scanner;

public class EjsEstrucControlTres1 {
    public static void main(String[] args) {
        int num1, num2, mayor=0, menor=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe dos números para ordenarlos");
        num1=scan.nextInt();
        num2=scan.nextInt();
        if (num1==num2){
            System.out.println("Los números son iguales, da igual cómo los ordenes");
        } else {
            mayor = (num1 > num2) ? num1 : num2;
            menor = (num1 < num2) ? num1 : num2;
            System.out.println("Los numeros ordenados son: " + mayor + ", " + menor);
        }
    }
}
