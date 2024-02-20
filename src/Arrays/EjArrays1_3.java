package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjArrays1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i=0; i<array.length; i++){
            array[i]=(int) (Math.random()*31);
        }
        System.out.println("Se ha creado el siguiente array de 10 números: " + Arrays.toString(array));
        System.out.println("Escribe un número y se eliminarán los mayores a ese");
        int num = sc.nextInt();

        array=eliminarMayores(array,num);

        System.out.println("El array resultado es: " + Arrays.toString(array));
    }
    static int[] eliminarMayores(int[] t, int valor){
        for(int i=0; i<t.length; i++){
            if(t[i]>valor){
                System.arraycopy(t, i+1, t, i, t.length-i-1);
                t=Arrays.copyOf(t, t.length-1);
                i--;
            }
        }
        return t;
    }
}
