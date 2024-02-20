package Estructuras_De_Control;

import java.util.Scanner;

public class EjsEstrucControlDos1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, suma=0;
        do {
            System.out.println("Escribe un número POSITIVO para sumar los múlitplos de 3 entre el número 1 y ese");
            num=scan.nextInt();
            scan.close();
        }while(num<0);
        System.out.println("Los múltiplos de 3 desde 1 hasta " + num + " son:");
        for(int i=1; i<=num; i++){
            if(i%3==0){
                System.out.println(i);
                suma=suma+i;
            }
        }
        System.out.println("La suma de los múltiplos de 3 desde 1 hasta " + num + " es " + suma);
    }
}