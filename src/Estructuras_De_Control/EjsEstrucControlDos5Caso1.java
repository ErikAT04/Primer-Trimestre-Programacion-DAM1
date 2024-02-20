package Estructuras_De_Control;

import java.util.Scanner;

public class EjsEstrucControlDos5Caso1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num;
        int suspenso=0,aprobado=0,notable=0,sobresaliente=0,matrHonor=0,total=0;
        String respuesta;
        System.out.println("Bienvenid@ al acumulador y calificador de notas.\nEste programa está hecho con el fin de agrupar las calificaciones de los alumnos en función de si han suspendido");
        System.out.println("Comienza el programa:");
        do {
            System.out.println("Introduzca la nota del alumno");
            num = scan.nextDouble();
            while (num < 0 || num > 10){
                System.out.println("Número inválido, escribe uno entre 0 y 10");
            num = scan.nextDouble();
            }
            if(num<5){
                System.out.println("Este ha suspendido");
                suspenso++;
            }else if(num<=6.5){
                System.out.println("Este ha aprobado");
                aprobado++;
            }else if(num<8.5){
                System.out.println("Este ha sacado un notable");
                notable++;
            }else if(num==10){
                System.out.println("Este ha obtenido una matrícula de honor");
                matrHonor++;
            }else{
                System.out.println("Este ha sacado un sobresaliente");
                sobresaliente++;
            }
            total++;
            System.out.println("¿Quieres continuar metiendo notas?s/n");
            respuesta=scan.next();
        }while(!respuesta.equalsIgnoreCase("n"));
        System.out.println("Programa finalizado. Sacando resultados...");
        System.out.println("Se han introducido un total de " + total + " notas.");
        System.out.print("Han suspendido " + suspenso + " alumnos, ");
        System.out.printf("un %.2f", ((double)suspenso/total*100));
        System.out.println("%");
        System.out.print("Han aprobado " + aprobado + " alumnos, ");
        System.out.printf("un %.2f", ((double)aprobado/total*100));
        System.out.println("%");
        System.out.print("Han aprobado " + notable + " alumnos con notable, ");
        System.out.printf("un %.2f", ((double)notable/total*100));
        System.out.println("%");
        System.out.print("Han aprobado " + sobresaliente + " alumnos con sobresaliente, ");
        System.out.printf("un %.2f", ((double)sobresaliente/total*100));
        System.out.println("%");
        System.out.print(matrHonor + " alumnos han sacado matrícula de honor, ");
        System.out.printf("un %.2f", ((double)matrHonor/total*100));
        System.out.println("%");
    }
}
