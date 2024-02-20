package Tareas;

import java.util.Scanner;
public class ErikAmo_UltimaCifra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, x; //Abro dos variables, una de ellas para escanear el número y otra para obtener la última cifra
        System.out.println("Escribe un número entero y te diré su última cifra");
        num = scan.nextInt();
        scan.close(); //Cierro el escáner
        x=num%10; //La ultima cifra del número es el resto del número entero entre 10.
        //Por ejemplo, el número 423 cuando lo divides entre 10 es 42 y su resto es 3, pues la última cifra del número es 3.
        System.out.println("La última cifra de " + num + " es " + x);
    }
}