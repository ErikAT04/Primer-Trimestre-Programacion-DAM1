package Estructuras_De_Control;

import java.util.Scanner;

public class EjsEstrucControlCuatro3 {
    public static void main(String[] args) {
        int base, exponente;
        double num=1;
        boolean negativo=false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe el número que quieres usar como base(en x^n, la base es la x)");
        base=scan.nextInt();
        System.out.println("Ahora escribe el exponente (de x^n, el exponente es n)");
        exponente=scan.nextInt();
        if (exponente<0){
            exponente=-exponente;
            negativo=true;
        }
        for(int i=1; i<=exponente; i++){
            num=num*base;
        }
        num=(negativo)? (1/num) : num;
        System.out.println("El resultado es " + num);
    }
}
