package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjEjemploArrays2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []Array = new int[5];
        boolean hayPares=false;
        System.out.println("Array de 5 números iniciada, comenta qué valores meter");
        for(int i=0; i<Array.length; i++){
            Array[i]=scan.nextInt();
        }
        System.out.println("Array de 5 elementos: " + Arrays.toString(Array));
        for (int num:Array){
            if (num % 2 == 0) {
                hayPares = true;
                break;
            }
        }
        if(hayPares){
            System.out.println("En el array hay pares");
        } else{
            System.out.println("En el array no hay valores pares");
        }
    }
}