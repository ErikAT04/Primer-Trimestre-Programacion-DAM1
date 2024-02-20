package Funciones;

import java.util.Scanner;

public class EjsFuncionesDos4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, dia;
        System.out.println("Escribe un número de mes y te diré el número de días");
        num = scan.nextInt();
        scan.close();
        dia=DiasEnMes(num);
        if(dia==0){
            System.out.println("Ese mes no existe");
        } else {
            System.out.println("Ese mes tiene " + dia + " días");
        }
    }
    static int DiasEnMes(int mes){
        return switch (mes){
            case 1,3,5,7,8,10,12 -> 31;
            case 2 -> 28;
            case 4,6,9,11 -> 30;
            default -> 0;
        };
    }
}