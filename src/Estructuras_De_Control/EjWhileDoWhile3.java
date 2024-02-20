package Estructuras_De_Control;

import java.util.Scanner;
public class EjWhileDoWhile3 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int opcion;
        double dinero, resul;
        String resp;
        System.out.println("Bienvenido al conversor de libras y euros.");
        do {
            System.out.println("¿Qué le gustaría hacer?\n1:Convertir libras a euros.\n2:Convertir euros a libras");
            opcion = scan1.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Conversor de libras a euros iniciado.\nIngrese la cantidad de libras que quiere convertir a euros");
                    dinero = scan1.nextInt();
                    resul = (dinero * 1.16);
                    System.out.println(dinero + " libras son " + resul + " euros.");
                    break;
                case 2:
                    System.out.println("Conversor de euros a libras iniciado.\nIngrese la cantidad de euros que quiere convertir a libras");
                    dinero = scan1.nextInt();
                    resul = (dinero * 0.86);
                    System.out.println(dinero + " euros son " + resul + " libras.");
                    break;
                default:
                    System.out.println("El número que ha introducido no es válido.");
                    break;
            }
            System.out.println("Programa finalizado.\n¿Quiere volver a iniciarlo?");
            resp=scan2.next();
        }while(resp.equals("SI"));
    }
}
