package Estructuras_De_Control;

import java.util.Scanner;

public class EjsSwitch5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe un número y te diré a qué mes corresponde");
        int x = scan.nextInt();
        switch(x){
            case 1:
                System.out.println("Enero");
            case 2:
                System.out.println("Febrero");
            case 3:
                System.out.println("Marzo");
            case 4:
                System.out.println("Abril");
            case 5:
                System.out.println("Mayo");
            case 6:
                System.out.println("Junio");
            case 7:
                System.out.println("Julio");
            case 8:
                System.out.println("Agosto");
            case 9:
                System.out.println("Septiembre");
            case 10:
                System.out.println("Octubre");
            case 11:
                System.out.println("Noviembre");
            case 12:
                System.out.println("Diciembre");
            default:
                System.out.println("Eso no es un mes");
        }
    }
}
