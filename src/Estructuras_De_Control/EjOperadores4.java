package Estructuras_De_Control;

import java.util.Scanner;
public class EjOperadores4 {
    public static void main(String[] args) {
        Scanner pide = new Scanner(System.in);
        int x, y;
        System.out.print("Escribe el primer número");
        x=pide.nextInt();
        System.out.print("¿De qué número quieres saber si es múltiplo?");
        y=pide.nextInt();
        System.out.print("¿Es " + x + " múltiplo de " + y + "?\n" + (x%y==0));
    }
}