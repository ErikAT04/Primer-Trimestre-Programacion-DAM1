package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjEjemploArrays7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe el tamaño del array");
        int []array = new int[scan.nextInt()];
        System.out.println("De acuerdo, creado un array con " + array.length + " huecos");
        RellenarPares(array);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
    static void RellenarPares(int[]array){
        for(int i = 0; i<array.length; i++){
            do{
                array[i]=(int)(Math.random()*array.length)+1;
            }while(array[i]%2!=0);
        }
    }
}