package Funciones;

import java.util.Scanner;

public class EjsFuncionesUno3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num,cantprimos=0;
        boolean primo;
        System.out.println("Escribe un número del que quieres saber qué divisores primos tiene");
        num=scan.nextInt();
        for(int i = 1; i<=num; i++){
            primo=esPrimo(i);
            if(num%i==0&&primo){
                System.out.println(i);
                cantprimos++;
            }
        }
        System.out.println("Tiene un total de " + cantprimos + " primos.");
    }
    static boolean esPrimo(int num) {
        boolean primo=(num != 1);
        for(int i = 2; i<num; i++){
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }
}
