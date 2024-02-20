package Estructuras_De_Control;

import java.util.Scanner;
public class EjsIfElse4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escribe la hora actual");
        int hora=scan.nextInt();
        System.out.print("Escribe los minutos");
        int min=scan.nextInt();
        if((0<=hora&&hora<24)&&(0<=min&&min<60)) {
            int segs = (min * 60) + (hora * 3600);
            int faltan = 86400 - segs;
            System.out.print("Faltan " + faltan + " segundos para la media noche");
        } else{
            System.out.print("Formatos inválidos en horas o minutos");
        }
    }
}
