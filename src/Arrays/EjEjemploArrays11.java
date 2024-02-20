package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class EjEjemploArrays11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayaborrar = {1,4,6,7,8,9};
        int[] arrayordenada = { 2, 6, 8, 20, 13, 5};
        Arrays.sort(arrayordenada);
        int pos;
        boolean continuar;
        do {
            if(arrayaborrar.length==0){
                System.out.println("Ya no quedan números a borrar en el array");
                break;
            }
            System.out.println("Array que puedes borrar: " + Arrays.toString(arrayaborrar));
            System.out.println("Array ordenada: " + Arrays.toString(arrayordenada));
            System.out.println("Escribe el número que quieres pasar del primer array al otro");
            pos = Arrays.binarySearch(arrayaborrar, sc.nextInt());
            if(pos>=0){
                int aux = arrayaborrar[pos];
                arrayaborrar=transformar(arrayaborrar, pos);
                arrayordenada=Arrays.copyOf(arrayordenada, (arrayordenada.length+1));
                arrayordenada[arrayordenada.length-1]=aux;
                Arrays.sort(arrayordenada);
                System.out.println("Cambio realizado");
            } else {
                System.out.println("Ese número no está aquí");
            }

            System.out.println("¿Quieres continuar? Si es así, escribe 'sí' ");
            continuar = (sc.next().equalsIgnoreCase("si"));
        } while (continuar);
        System.out.println("Resultados finales: ");
        System.out.println("Array borrable: " + Arrays.toString(arrayaborrar));
        System.out.println("Array ordenada: " + Arrays.toString(arrayordenada));
    }
    static int[] transformar(int[] array, int pos){
        for(int i=pos+1; i<array.length; i++){
            array[i-1]=array[i];
        }
        array=Arrays.copyOf(array, (array.length-1));
        return array;
    }
}
