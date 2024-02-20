package Estructuras_De_Control;

import java.util.Scanner;
public class ParOImpar {
    public static void main(String[] args){
        int nu;
        Scanner lector = new Scanner(System.in);
        System.out.print("Escribe el número que quieras que sea par o impar");
        nu=lector.nextInt();
        if(nu%2==0){
            System.out.print("El número " + nu + " es par");
        } else{
            System.out.print("El número " + nu + " es impar");
        }
    }
}
