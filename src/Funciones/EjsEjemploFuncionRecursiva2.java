package Funciones;

import java.util.Scanner;

public class EjsEjemploFuncionRecursiva2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pos;
        do {
            System.out.println("Escribe una posición en la secuencia de Fibonacci y diré su número(Empieza en 0)");
            pos = scan.nextInt();
        }while(pos<0);
        int num=Fibonacci(pos);
        System.out.println(num + " es la posición numero " + pos + " de la secuencia de Fibonacci.");
    }
    public static int Fibonacci(int pos){
        if(pos==1||pos==0){
            return 1;
        } else{
            return Fibonacci(pos-1)+Fibonacci(pos-2);
        }
    }
}
