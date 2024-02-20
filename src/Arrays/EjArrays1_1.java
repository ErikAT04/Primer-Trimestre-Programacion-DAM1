package Arrays;

import java.util.Arrays;

public class EjArrays1_1 {
    public static void main(String[] args) {
        int []array = new int[10];
        int suma=0;
        for(int i = 0; i < array.length; i++){
            array[i] = (int) ((Math.random()*9)+18);
            suma=suma+array[i];
        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Suma: " + suma);
    }
}
