package Estructuras_De_Control;

import java.util.Scanner;
public class EjsFor1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe la cantidad de veces que quieres escribir la palabra 'eco'");
        int num=scan.nextInt();
        System.out.println("De acuerdo, se dirá 'eco' " + num + " veces");
        for(int i=0; i!=num; i++){
            System.out.println("ECO");
        }
    }
}