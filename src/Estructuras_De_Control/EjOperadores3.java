package Estructuras_De_Control;

import java.util.Scanner;
public class EjOperadores3 {
    public static void main(String[] args) {
        Scanner muls = new Scanner(System.in);
        int x;
        System.out.print("Escribe un número que quieras saber si es múltiplo de 2");
        x=muls.nextInt();
        muls.close();
        System.out.print("¿Es un múltiplo de 2?\n" + (x%2==0));
    }
}