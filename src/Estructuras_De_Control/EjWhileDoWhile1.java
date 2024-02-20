package Estructuras_De_Control;

import java.util.Scanner;

public class EjWhileDoWhile1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe un número para saber su cuadrado, si es par y si es positivo.\nUna vez escrito el 0, el programa finalizará");
        int num = scan.nextInt();
        while(num!=0){
            if(num%2==0){
                System.out.println("El número " + num + " es par");
            } else{
                System.out.println("El número " + num + " es impar");
            }
            if(num<0){
                System.out.println("El número " + num + " es negativo");
            } else{
                System.out.println("El número " + num + " es positivo");
            }
            System.out.println("El cuadrado de " + num + " es " + (num*num));
            System.out.println("Escriba el siguiente número");
            num=scan.nextInt();
        }
        System.out.println("Programa finalizado.");
    }
}
