package Arrays;

import java.util.Arrays;

public class EjEjemploArrays5 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[numero.length];
        int[] cubo = new int[numero.length];
        for(int i=0; i!=numero.length; i++){
            numero[i]= (int) (Math.random() * 101);
            cuadrado[i]=numero[i]*numero[i];
            cubo[i]=numero[i]*cuadrado[i];
        }
        System.out.println("Números: " + Arrays.toString(numero));
        System.out.println("Cuadrados: " + Arrays.toString(cuadrado));
        System.out.println("Cubos: " + Arrays.toString(cubo));

        for(int i=0; i!=numero.length; i++){
            System.out.println("Posición " + (i+1) + ":");
            System.out.println("Número: " + numero[i]);
            System.out.println("Cuadrado: " + cuadrado[i]);
            System.out.println("Cubo: " + cubo[i]);
            System.out.println();
        }
    }
}
