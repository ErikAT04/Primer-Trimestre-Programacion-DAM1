package Funciones;

import java.util.Scanner;
public class EjsFuncionesDos1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, res;
        int[][] array = new int[3][3];
        System.out.println("Escribe un número cualquiera para saber cuál es su última cifra");
        num=scan.nextInt();
        res=ultimaCifra(num);
        System.out.println("La última cifra de " + num + " es " + res);
    }
    static int ultimaCifra(int num){
        num=(num>=0)?num:-num;
        num=num%10;
        return num;
    }
}
