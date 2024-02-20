package Arrays;

import java.util.Scanner;

public class EjArrays1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i]=(int) (Math.random()*20);
        }
        //System.out.println(Arrays.toString(array));
        System.out.println("Se ha creado un array, di un número y,  si está en el array, te diré su posición.");
        int num = sc.nextInt();
        int pos = buscar(array, num);
        System.out.println("El número " + num + " está en la posición " + pos);
    }
    static int buscar(int[] t, int clave){
        for (int i = 0; i < t.length; i++) {
            if (t[i]==clave){
                return i;
            }
        }
        return -1;
    }
}
