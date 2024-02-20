package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjEjemploArrays1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []MyArray = new int[5];
        System.out.println("Creada un array de longitud " + MyArray.length);
        System.out.println("Escribe los números para rellenar el array:");
        for(int i = 0; i<=4; i++){
            MyArray[i]=scan.nextInt();
        }
        String res = Arrays.toString(MyArray);
        System.out.print("Los valores del array son: " + res);
    }
}
