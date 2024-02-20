package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class EjEjemploArrays10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []loteria = {1, 6, 8, 3, 5, 9};
        int []adivinar = new int[6];

        Arrays.sort(loteria);
        System.out.println("Escribe tu apuesta de primitiva número por número");
        for (int i=0; i<adivinar.length; i++){
            adivinar[i] = sc.nextInt();
        }
        int apuesta= apuestaprimitiva(loteria, adivinar);
        System.out.println("Has obtenido " + apuesta + " aciertos.");
    }
    public static int apuestaprimitiva(int[]loteria, int[]apuesta){
        int contador = 0;
        for(int i=0; i< loteria.length; i++) {
            int pos=Arrays.binarySearch(loteria, apuesta[i]);
            if(pos>=0) {
                contador++;
            }
        }
        return contador;
    }
}
