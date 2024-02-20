package Estructuras_De_Control;

import java.util.Scanner;
public class EjsEstrFOR3Caso1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, i;
        String op;
        do {
            System.out.println("Escribe el número del 0 al 9 que desea introducir en la tabla de operación");
            num = scan.nextInt();
            if (num<0||num>9){
                System.out.println("Este número no es válido");
            }
        }while(num<0||num>9);
        System.out.println("Escribe la operación que desea realizar(s,r,m,S,R,M,+,-,x)");
        op = scan.next();
        switch (op){
            case "s","S","+":
                System.out.println("La tabla de la suma de " + num + " es:");
                for(i=0; i<=10; i++){
                    System.out.println(num + " + " + i + " es " + (num+i));
                }
                break;
            case "r","R","-":
                System.out.println("La tabla de la resta de " + num + " es:");
                for(i=0; i<=10; i++){
                    System.out.println(num + " - " + i + " es " + (num-i));
                }
                break;
            case "m","M","x":
                System.out.println("La tabla de multiplicar de " + num + " es:");
                for(i=0; i<=10; i++){
                    System.out.println(num + " * " + i + " es " + (num*i));
                }
                break;
            default:
                System.out.println("El valor que has introducido para la operación no es válido.");
                break;
        }
    }
}