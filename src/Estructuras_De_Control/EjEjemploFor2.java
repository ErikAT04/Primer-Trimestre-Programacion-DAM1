package Estructuras_De_Control;

import java.util.Scanner;

public class EjEjemploFor2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suma=0, num;
        System.out.println("Escribe 10 números para sumarlos entre ellos");
        for(int i=0; i<10; i++){
            num=scan.nextInt();
            suma=suma+num;
        }
        System.out.println("La suma de los números es " + suma);
    }
}
