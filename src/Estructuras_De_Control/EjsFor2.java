package Estructuras_De_Control;

import java.util.Scanner;
public class EjsFor2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe un número y te diré los 5 siguientes:");
        int num=scan.nextInt();
        System.out.println("Los números que siguen a " + num + " son:");
        for(int i=1; i<=5; i++){
            System.out.println((i+num));
        }
    }
}