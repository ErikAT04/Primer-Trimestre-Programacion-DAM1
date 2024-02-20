package Funciones;

import java.util.Scanner;

public class EjsFuncionesDos3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Escribe el número del día de la semana del que quieres saber la clase a primera hora");
        num=scan.nextInt();
        if(num>5||num<1){
            System.out.println("Ese día no hay clase o directamente no existe");
        }else {
            System.out.println("Ese día a primera hay " + HoraAPrimera(num));
        }
    }
    static String HoraAPrimera(int dia){
        return switch (dia) {
            case 2 -> "Entornos de Desarrollo";
            case 3 -> "Sistemas Informáticos";
            case 5 -> "Bases de Datos";
            default -> "Programación";
        };
    }
}