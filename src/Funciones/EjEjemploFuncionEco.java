package Funciones;

import java.util.Scanner;

public class EjEjemploFuncionEco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Introduce el numero de veces que quieres que te diga 'ECO'");
        num=scan.nextInt();
        System.out.println("De acuerdo, diciendo 'ECO' " + num + " veces");
        eco(num);
    }
    static void eco(int a){
        for(int i=1; i<=a; i++){
            System.out.println("ECO");
        }
    }
}