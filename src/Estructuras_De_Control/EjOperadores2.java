package Estructuras_De_Control;

import java.util.Scanner;
public class EjOperadores2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x,y;
        System.out.print("Escribe dos números\n");
        x=scan.nextInt();
        y=scan.nextInt();
        System.out.print("¿Alguno de los números es 0 o son números diferentes entre ellos?\n" + (x==0 || y==0 || x!=y));
    }
}