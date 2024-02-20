package Estructuras_De_Control;

import java.util.Scanner;
public class EjsIfElse3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escribe un número para saber si es par o múltiplo de 5");
        int x = scan.nextInt();
        if(x%5==0){
            System.out.print(x + " es divisible entre 5.\n");
            if(x%2==0){
                System.out.print("Además, es par.");
            }
        } else if (x % 2 == 0) {
            System.out.print(x + " es par.");

        } else{
            System.out.print("El número " + x + " no es ni par ni divisible entre 5");
        }
    }
}
