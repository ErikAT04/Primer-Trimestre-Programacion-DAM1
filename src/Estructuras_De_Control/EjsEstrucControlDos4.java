package Estructuras_De_Control;

import java.util.Scanner;

public class EjsEstrucControlDos4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("¿Quieres saber los múltiplos hasta 100 del 2 o del 3?");
        num=scan.nextInt();
        if(num==2||num==3){
            System.out.println("Entendido, mostrando múltiplos de " + num + " hasta el 100");
            for(int i=1; i<=100; i++){
                if(i%num==0){
                    System.out.println(i);
                }
            }
        }else {
            System.out.println("Este número no es ni 3 ni 2, lo siento");
        }
    }
}
