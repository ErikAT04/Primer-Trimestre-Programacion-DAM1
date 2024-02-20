package Estructuras_De_Control;

import java.util.Scanner;

public class EjsEstrucControlCuatro5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        String numentexto;
        do{
            System.out.println("Escribe un número entre 0 y 99 y te diré cómo se escribe");
            num=scan.nextInt();
        } while(num<0||num>99);
        numentexto = switch (num % 10) {
            case 1 -> "uno";
            case 2 -> "dos";
            case 3 -> "tres";
            case 4 -> "cuatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "siete";
            case 8 -> "ocho";
            case 9 -> "nueve";
            default -> "cero";
        };
        switch (num/10){
            case 1:
                numentexto = switch(num%10){
                    case 0 -> ("diez");
                    case 1 -> ("once");
                    case 2 -> ("doce");
                    case 3 -> ("trece");
                    case 4 -> ("catorce");
                    case 5 -> ("quince");
                    default -> ("dieci" + numentexto);
                };
                break;
            case 2:
                if (num%10!=0) {
                    numentexto=("veinti" + numentexto);
                } else numentexto = "veinte";
                break;
            case 3:
                if (num%10!=0) {
                    numentexto=("treinta y " + numentexto);
                } else numentexto = "treinta";
                break;
            case 4:
                if (num%10!=0) {
                    numentexto=("cuarenta y " + numentexto);
                } else numentexto = "cuarenta";
                break;
            case 5:
                if (num%10!=0) {
                    numentexto=("cincuenta y " + numentexto);
                } else numentexto = "cincuenta";
                break;
            case 6:
                if (num%10!=0) {
                    numentexto=("sesenta y " + numentexto);
                } else numentexto = "sesenta";
                break;
            case 7:
                if (num%10!=0) {
                    numentexto=("setenta y " + numentexto);
                } else numentexto = "setenta";
                break;
            case 8:
                if (num%10!=0) {
                    numentexto=("ochenta y" + numentexto);
                } else numentexto = "ochenta";
                break;
            case 9:
                if (num%10!=0) {
                    numentexto=("noventa y " + numentexto);
                } else numentexto = "noventa";
                break;
        }
        System.out.println("El número " + num + " escrito es " + numentexto);
    }
}
