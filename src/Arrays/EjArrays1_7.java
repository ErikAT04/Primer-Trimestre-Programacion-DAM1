package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjArrays1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] myArray = new double[0];
        int aux=0;
        int contador=0;
        double suma=0;
        while (aux>-1){
            System.out.println("Escribe el siguiente sueldo (cuando desee parar, pulse el -1)");
            aux=sc.nextInt();
            if(aux>-1){
                myArray= Arrays.copyOf(myArray, myArray.length+1);
                myArray[contador]=aux;
                contador++;
            }
        }
        System.out.println("Cuenta de sueldos finalizada.");
        Arrays.sort(myArray);
        double[] arrayaux= new double[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            arrayaux[myArray.length-1-i]=myArray[i];
            suma = suma + myArray[i];

        }
        myArray = Arrays.copyOf(arrayaux, myArray.length);
        System.out.println("Sueldos en orden decerciente: " + Arrays.toString(myArray));
        System.out.println("Sueldo máximo: " + myArray[0] + "\nSueldo mínimo: " + myArray[(myArray.length-1)]);
        System.out.println("Media de los sueldos: " + suma/myArray.length);
    }
}
