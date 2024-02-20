package Arrays;

import java.util.Arrays;

public class EjArrays1_2 {
    public static void main(String[] args) {
        int[] array = new int[20];
        int[] auxiliarpar = new int[0];
        int[] auxiliarimpar = new int[0];
        for(int i=0; i<array.length; i++){
            array[i]=(int)(Math.random()*101);
            if (array[i]%2==0){
                auxiliarpar= Arrays.copyOf(auxiliarpar, auxiliarpar.length+1);
                auxiliarpar[auxiliarpar.length-1]=array[i];
            } else{
                auxiliarimpar=Arrays.copyOf(auxiliarimpar, auxiliarimpar.length+1);
                auxiliarimpar[auxiliarimpar.length-1]=array[i];
            }
        }

        System.arraycopy(auxiliarpar, 0, array, 0, auxiliarpar.length);
        System.arraycopy(auxiliarimpar, 0, array, auxiliarpar.length, auxiliarimpar.length);

        System.out.println("Array solo con pares: " + Arrays.toString(auxiliarpar));
        System.out.println("Array solo con impares: " + Arrays.toString(auxiliarimpar));
        System.out.println("Array final: " + Arrays.toString(array));

    }
}
