package Estructuras_De_Control;

import java.util.Scanner;

public class EjsEstrucControlTres2 {
    public static void main(String[] args) {
        int num, suma=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe el número de números naturales que quieres sumar");
        num=scan.nextInt();
        while (num<=0){
            System.out.println(num + " no es natural, introduzca uno que sí lo sea");
            num=scan.nextInt();
        }
        for(int i=0; i<=num; i++){
            suma=suma+i;
        }
        System.out.println("La suma de los " + num + " primeros números naturales es " + suma);
    }
}
