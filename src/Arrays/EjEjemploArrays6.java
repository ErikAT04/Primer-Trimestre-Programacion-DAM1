package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjEjemploArrays6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[15];
        int aux;
        for(int i = 0; i<array.length; i++){
            System.out.print("Escribe el numero para la posición " + (i+1) + ": ");
            array[i] = scan.nextInt();
        }
        aux=array[array.length-1];
        System.arraycopy(array, 0, array, 1, array.length-1);
        array[0]=aux;
        System.out.println("Array rotada: " + Arrays.toString(array));
    }
}