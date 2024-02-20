package Estructuras_De_Control;

import java.util.Scanner;

public class EjEjemploDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String respuesta;
        do{
            System.out.println("¿Estás seguro de que quieres ejecutar este programa?");
            respuesta=scan.next();
        } while (respuesta.equals("SI"));
        System.out.println("Perfecto, tenga un buen día");
    }
}
