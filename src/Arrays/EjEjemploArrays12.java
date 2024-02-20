package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjEjemploArrays12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos números me quieres dar?");
        int tam = sc.nextInt();
        int[] array1 = new int[tam];
        int[] arraypar = new int[0];
        int[] arrayimpar = new int[0];
        System.out.println("De acuerdo, ve dándome valores a almacenar");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            if(array1[i]%2==0){
                arraypar= Arrays.copyOf(arraypar, arraypar.length+1);
                arraypar[arraypar.length-1]=array1[i];
            } else {
                arrayimpar = Arrays.copyOf(arrayimpar, arrayimpar.length+1);
                arrayimpar[arrayimpar.length-1]=array1[i];
            }
        }
        //System.out.println("Array introducida: " + Arrays.toString(array1));
        System.out.println("Pares ordenados: " + Arrays.toString(arraypar));
        System.out.println("Impares ordenados: " + Arrays.toString(arrayimpar));
    }
}
