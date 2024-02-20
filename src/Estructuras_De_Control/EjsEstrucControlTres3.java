package Estructuras_De_Control;

import java.util.Scanner;

public class EjsEstrucControlTres3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, mayor, menor,suma=0,cuenta=0;
        System.out.println("Comience a escribir números para sacar la media, el mayor y el menor de todos ellos.\nUna vez quieras acabar, ingrese un 0");
        num=scan.nextInt();
        mayor=num;
        menor=num;
        while(num!=0){
            mayor=(mayor<num)?num:mayor;
            menor=(menor>num)?num:menor;
            suma=suma+num;
            cuenta++;
            System.out.println("Introduce el siguiente número");
            num=scan.nextInt();
        }
        System.out.println("Cuenta finalizada:");
        if(cuenta==0){
            System.out.println("No se ha introducido ningún número.");
        } else{
            System.out.println("Se han introducido " + cuenta + " números.");
            System.out.println("El mayor de todos es " + mayor);
            System.out.println("El menor de todos es " + menor);
            System.out.println("La media es: " + (suma/cuenta));
        }
    }
}