package Estructuras_De_Control;

import java.util.Scanner;
public class EjOperadores1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Escribe un número entero\n");
        int x= reader.nextInt();
        System.out.println("¿Es positivo?\n" + (x>=0)); 
    }
}