package Estructuras_De_Control;

import java.util.Scanner;

public class EjsEstrucControlDos3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numdni;
        String letraDNI="";
        System.out.println("Escribe el número del DNI y diré su letra");
        do{
            numdni=scan.nextInt();
            if(numdni>=0&&numdni<=99999999){
                break;
            }
            System.out.println("Este número no sirve, tiene que tener como mucho 8 cifras y no puede ser negativo\nEscribe otro.");
        }while(true);
        scan.close();
        letraDNI = switch (numdni % 23) {
            case 0 -> "T";
            case 1 -> "R";
            case 2 -> "W";
            case 3 -> "A";
            case 4 -> "G";
            case 5 -> "M";
            case 6 -> "Y";
            case 7 -> "F";
            case 8 -> "P";
            case 9 -> "D";
            case 10 -> "X";
            case 11 -> "B";
            case 12 -> "N";
            case 13 -> "J";
            case 14 -> "Z";
            case 15 -> "S";
            case 16 -> "Q";
            case 17 -> "V";
            case 18 -> "H";
            case 19 -> "L";
            case 20 -> "C";
            case 21 -> "K";
            case 22 -> "E";
            default -> letraDNI;
        };
        System.out.printf("La letra el DNI %08d", numdni);
        System.out.print(" es " + letraDNI);
    }
}
