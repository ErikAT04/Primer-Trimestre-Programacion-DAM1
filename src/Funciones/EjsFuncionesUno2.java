package Funciones;

import java.util.Scanner;

public class EjsFuncionesUno2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion;
        double altura, radio, solu;
        System.out.println("Es momento de definir la altura y el radio de un cilindro.\nPara comenzar, escribe la altura");
        altura=scan.nextInt();
        System.out.println("Ahora escribe su radio.");
        radio=scan.nextInt();
        System.out.println("Escribe qué quieres averiguar:\n1:Área\n2:Volumen");
        opcion=scan.nextInt();
        switch (opcion){
            case 1:
                solu=calculoArea(radio,altura);
                System.out.println("El área de tu cilindro es " + solu);
                break;
            case 2:
                solu=calculoVolumen(radio,altura);
                System.out.println("El volumen de tu cilindro es " + solu);
                break;
            default:
                System.out.println(opcion + " no es una opción válida.");
        }
    }
    static double calculoArea(double r, double h){
        double a;
        a=Math.PI*2*r*(h+r);
        return a;
    }
    static double calculoVolumen(double r, double h){
        double v;
        v=Math.PI*r*r*h;
        return v;
    }
}
