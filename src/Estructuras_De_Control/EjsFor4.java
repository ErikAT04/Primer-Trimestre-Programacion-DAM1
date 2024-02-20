package Estructuras_De_Control;

import java.util.Scanner;
public class EjsFor4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe un entero POSITIVO para decirte los pares que le preceden hasta el 0");
        int num=scan.nextInt();
        for(int i=num; i>=0; i--){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}