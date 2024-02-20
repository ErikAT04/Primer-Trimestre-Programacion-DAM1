package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjEjemploArrays4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe el tamaño del array");
        int tamaño = scan.nextInt();
        int[] MyArray = new int[tamaño];
        int[] ArrayInvertida = new int[tamaño];
        System.out.println("Se ha creado un array de tamaño " + tamaño);
        System.out.println("Escribe los números del array:");
        for(int i=0; i<tamaño; i++){
            MyArray[i]=scan.nextInt();
            ArrayInvertida[tamaño-1-i]=MyArray[i];
        }
        System.out.println("La array normal es " + Arrays.toString(MyArray));
        System.out.println("La array invertida es " + Arrays.toString(ArrayInvertida));
    }
}
