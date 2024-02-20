package Arrays;

import java.util.Arrays;

public class EjArrays1_8 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*20);
        }
        System.out.println("Array: " + Arrays.toString(array));
        array = sinRepetidos(array);
        System.out.println("Array sin repetidos: " + Arrays.toString(array));
    }
    static int[] sinRepetidos(int[] array){
        int aux =0;
        for (int i = 0; i < array.length; i++) {
            int pos=i+1;
            aux = array[i];
            while (pos < array.length){
                if(array[pos]==aux){
                    System.arraycopy(array, pos+1, array, pos, array.length-pos-1);
                    array = Arrays.copyOf(array, array.length-1);
                } else {
                    pos++;
                }
            }

            /*
            for (int j = i+1; j < array.length; j++) {
                if(array[j]==aux){
                    System.arraycopy(array, j+1, array, j, array.length-j-1);
                    array = Arrays.copyOf(array, array.length-1);
                    j--;
                }
            }
            //Esta es otra forma (menos eficiente quizá) de hacerlo.
            */
        }
        return array;
    }
}
