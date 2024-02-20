package Funciones;

import java.util.Scanner;

public class EjEjemploFuncionRecursiva {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe un número base (La base de a^n es a)");
        int num=scan.nextInt();
        System.out.println("Escribe un numero para el exponente (El exponente de a^n es n)");
        int expo=scan.nextInt();
        int res=IterativaPotencia(num,expo);
        System.out.println(res);
        res= (int) RecursivaPotencia(num,expo);
        System.out.println(res);
    }
    //Función Iterativa:
    public static int IterativaPotencia(int num, int expo){
        int res=1;
        for (int i=0; i<expo; i++){
            res=res*num;
        }
        return res;
    }
    //Función Recursiva;
    public static long RecursivaPotencia(int num, int expo){
        if(expo==0){
            return 1;
        } else{
            expo--;
            return num * RecursivaPotencia(num,expo);
        }
    }
}
