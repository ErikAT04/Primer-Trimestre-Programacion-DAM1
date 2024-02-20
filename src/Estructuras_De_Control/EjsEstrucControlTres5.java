package Estructuras_De_Control;

import java.util.Scanner;

public class EjsEstrucControlTres5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numCaja, intento=4, numprueba=0;
        System.out.println("Intenta abrir la caja fuerte:");
        numCaja = 3472;
        while(numprueba!=numCaja&&intento>0){
            System.out.println("Te quedan " + intento + " intentos:");
            numprueba=scan.nextInt();
            if(numprueba!=numCaja){
                System.out.println("Incorrecto! Inténtalo de nuevo.");
                intento--;
            }
        }
        if(intento==0){
            System.out.println("Mala suerte!");
        } else {
            System.out.println("Enhorabuena, has conseguido abrir la caja en " + (5-intento) + " intentos");
        }
    }
}