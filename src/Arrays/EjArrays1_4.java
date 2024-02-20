package Arrays;

import java.util.Scanner;

public class EjArrays1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumapos = 0;
        int sumaneg = 0;
        int media = 0;
        int cuentaceros = 0;
        int cuentapositivos = 0;
        System.out.println("Escribe qué tamaño quieres que tenga el array:");
        int tam = sc.nextInt();
        int[] array = new int[tam];
        System.out.println("Creado un array de tamaño " + tam + "\nEscribe los números que quieres en tu array:");
        for (int i = 0; i < tam; i++) {
            array[i] = sc.nextInt();
            if(array[i]==0){
                cuentaceros++;
            } else if(array[i]>0) {
                sumapos = sumapos + array[i];
                cuentapositivos++;
            } else {
                sumaneg = sumaneg + array[i];
            }
        }
        System.out.println("Se han metido " + cuentaceros + " ceros.");
        if (cuentapositivos>0){
            System.out.println("La media de los positivos es " + (double) sumapos/cuentapositivos);
        }
        if (cuentapositivos+cuentaceros!=array.length) {
            System.out.println("La media de los negativos es " + (double) sumaneg/(array.length-cuentaceros-cuentapositivos));
        }
    }
}
