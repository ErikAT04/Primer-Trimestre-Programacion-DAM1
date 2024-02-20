package Estructuras_De_Control;

import java.util.Scanner;

public class EjsEstrucControlUno5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cuenta=0;
        double nota;
        System.out.println("Escribe las notas de los 5 alumnos para saber si hay alguno suspenso:");
        for(int i=1; i<=5; i++){
            nota=scan.nextDouble();
            if(nota<5){
                cuenta++;
            }
        }
        if (cuenta==0){
            System.out.println("No ha suspendido ningún alumno");
        } else {
            System.out.println("Han suspendido " + cuenta + " alumnos");
        }
    }
}