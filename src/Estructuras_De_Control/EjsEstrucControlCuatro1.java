package Estructuras_De_Control;

import java.util.Scanner;

public class EjsEstrucControlCuatro1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe el número decimal que te apetezca y te diré si es un casi 0");
        double num = scan.nextDouble();
        if(num>-1&&num<1){
            if (num==0){
                System.out.println("El número es literalmente 0, por lo que como tal no es casi 0");
            } else {
                System.out.println("El número " + num + " es casi 0");
            }
        }else {
            System.out.println("El numero " + num + " no es casi 0");
        }
    }
}
