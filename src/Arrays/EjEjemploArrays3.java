package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjEjemploArrays3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] MyArray = new double[5];
        System.out.println("Escribe 5 números");
        for(int i = 0; i<MyArray.length; i++){
            MyArray[i]=scan.nextDouble();
        }
        System.out.println("Números ordenados según se han escrito: " + Arrays.toString(MyArray));
    }
}
