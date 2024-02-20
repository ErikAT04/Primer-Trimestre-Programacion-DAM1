package Estructuras_De_Control;

import java.util.Scanner;

public class EjsEstrucControlTres6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, i;
        System.out.println("Escribe un número y te diré sus menores hasta que encuentre uno divisible entre 13");
        num = scan.nextInt();
        for(i=num-1; i%13!=0; i--){
            System.out.println(i);
        }
        System.out.println("El primer número divisible entre 13 es " + i);
    }
}