package Funciones;

import java.util.Scanner;

public class EjEjemploFuncion3 {
    public static void main(String[] args) {
        int x,y,max=0,z,numnumeros;
        Scanner scan = new Scanner(System.in);
        System.out.println("Elige si quieres dos números o tres.");
        numnumeros=scan.nextInt();
        switch (numnumeros){
            case 2:
                System.out.println("Escribe dos números");
                x=scan.nextInt();
                y=scan.nextInt();
                max = maximodedos(x,y);
                System.out.println("El valor máximo es " + max);
                break;
            case 3:
                System.out.println("Escribe tres números");
                x=scan.nextInt();
                y=scan.nextInt();
                z=scan.nextInt();
                max = maximodetres(x,y,z);
                System.out.println("El valor máximo es " + max);
                break;
            default:
                System.out.println("Te he dado las opciones de 2 o 3 numeros, no " + numnumeros + ".");
                break;
        }

    }
    static int maximodetres(int a, int b, int c){
        int max;
        if(a>b&&a>c){
            max=a;
        } else if (b>a&&b>c){
            max=b;
        } else {
            max=c;
        }
        return max;
    }
    static int maximodedos(int a, int b){
        int max=(a>b)?a:b;
        return max;
    }
}
