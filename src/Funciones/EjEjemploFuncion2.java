package Funciones;

import java.util.Scanner;

public class EjEjemploFuncion2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, mayor, menor;
        System.out.println("Escribe dos números para saber qué numeros se encuentran entre ellos");
        num1=scan.nextInt();
        num2=scan.nextInt();
        mayor=(num1>num2)? num1 : num2;
        menor=(num1<num2)? num1 : num2;
        System.out.println("Los números comprendidos entre " + menor + " y " + mayor + " son:");
        numerosComprendidos(menor,mayor);
    }
    static void numerosComprendidos(int a, int b){
        for(int i=a+1; i<b; i++){
            System.out.println(i);
        }
    }
}