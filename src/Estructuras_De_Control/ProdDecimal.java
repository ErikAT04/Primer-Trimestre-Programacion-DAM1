package Estructuras_De_Control;

import java.util.Scanner;
public class ProdDecimal {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        double x, y;
        System.out.print("Escribe un primer número");
        x = lector.nextDouble();
        System.out.print("Escribe un segundo número");
        y = lector.nextDouble();
        double multi = x*y;
        System.out.print("El producto de " + x + " y " + y + " es " + multi);
    }
}