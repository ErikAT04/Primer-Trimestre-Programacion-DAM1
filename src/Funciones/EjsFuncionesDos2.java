package Funciones;

import java.util.Scanner;

public class EjsFuncionesDos2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num, res = 0;
        int opcion;
        System.out.println("Escribe la cantidad de dinero que quieres convertir");
        num = scan.nextInt();
        System.out.println("Elige la opción de conversión que buscas:\n1:Conversor de euros a libras.\n2:Conversor de libras a euros");
        opcion = scan.nextInt();
        res = conversor(num, opcion);
        switch (opcion) {
            case 1:
                System.out.println(num + " euros son " + res + " libras.");
                break;
            case 2:

                System.out.println(num + " libras son " + res + " euros.");
                break;
            default:
                System.out.println("Esa opción no es válida");
                break;
        }
    }

    static double conversor(double dinero, int modo) {
        if (modo == 1) {
            return dinero * 0.86;
        } else {
            return dinero * 1.16;
        }
    }
}