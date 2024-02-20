package Arrays;

import java.util.Scanner;

public class EjEjemploArrays9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = {1, 5, 8, 2, 4};
        System.out.println("¿Qué número quieres saber si está?");
        int buscar = scan.nextInt();
        if (buscarenarray(array,buscar)) {
            System.out.println(buscar + " se encuentra en el array");
        } else System.out.println(buscar + " no se encuentra en el array");
    }
    public static boolean buscarenarray(int[]array, int elem){
        for(int i:array) {
            if (i == elem) {
                return true;
            }
        }
        return false;
    }
}
