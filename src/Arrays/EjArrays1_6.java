package Arrays;

import  java.util.Arrays;
import java.util.Scanner;

public class EjArrays1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux;
        int cuenta=0;
        int[] loteria1 = new int[6];
        int[] loteria2 = new int[6];
        int[] loteria3 = new int[6];
        int[] loteria4 = new int[6];
        int[] loteria5 = new int[6];
        int[] loteria6 = new int[6];
        int[] loteria7 = new int[6];
        int[] loteria8 = new int[6];
        int[] loteria9 = new int[6];
        int[] loteria10 = new int[6];
        int[] arrayaux = new int[6];

        for (int r = 1; r < 11; r++) {
            for (int i = 0; i < 6; i++) {
                do {
                    aux = (int) (Math.random() * 10);
                    if (!hayiguales(arrayaux,aux)){
                        arrayaux[i] = aux;
                    }
                } while (arrayaux[i]!=aux);
            }
            switch (r){
                case 1:
                    loteria1 = Arrays.copyOf(arrayaux, 6);
                    break;
                case 2:
                    loteria2 = Arrays.copyOf(arrayaux, 6);
                    break;
                case 3:
                    loteria3 = Arrays.copyOf(arrayaux, 6);
                    break;
                case 4:
                    loteria4 = Arrays.copyOf(arrayaux, 6);
                    break;
                case 5:
                    loteria5 = Arrays.copyOf(arrayaux, 6);
                    break;
                case 6:
                    loteria6 = Arrays.copyOf(arrayaux, 6);
                    break;
                case 7:
                    loteria7 = Arrays.copyOf(arrayaux, 6);
                    break;
                case 8:
                    loteria8 = Arrays.copyOf(arrayaux, 6);
                    break;
                case 9:
                    loteria9 = Arrays.copyOf(arrayaux, 6);
                    break;
                default:
                    loteria10 = Arrays.copyOf(arrayaux, 6);
            }
        }
        System.out.println("Lotería número 1: " + Arrays.toString(loteria1));
        System.out.println("Lotería número 2: " + Arrays.toString(loteria2));
        System.out.println("Lotería número 3: " + Arrays.toString(loteria3));
        System.out.println("Lotería número 4: " + Arrays.toString(loteria4));
        System.out.println("Lotería número 5: " + Arrays.toString(loteria5));
        System.out.println("Lotería número 6: " + Arrays.toString(loteria6));
        System.out.println("Lotería número 7: " + Arrays.toString(loteria7));
        System.out.println("Lotería número 8: " + Arrays.toString(loteria8));
        System.out.println("Lotería número 9: " + Arrays.toString(loteria9));
        System.out.println("Lotería número 10: " + Arrays.toString(loteria10));
    }
    static boolean hayiguales(int[] array, int valor){
        for (int j : array) {
            if (j == valor) {
                return true;
            }
        }
        return false;
    }
}
