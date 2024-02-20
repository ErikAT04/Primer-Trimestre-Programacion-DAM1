package Estructuras_De_Control;

import java.util.Scanner;

public class EjsEstrucControlCuatro4 {
    public static void main(String[] args) {
        int num, digitos=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe el número que quieras y diré su número de digitos");
        num = scan.nextInt();
        String numentexto= Integer.toString(num);
        for(int i = 0 ; i<=9; i++){
            if (numentexto.contains(Integer.toString(i))){
                digitos++;
            }
        }
        System.out.println("El número " + num + " cuenta con " + digitos + " digitos.");
    }
}
