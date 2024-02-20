package Estructuras_De_Control;

import java.util.Scanner;
public class EjsIfElse1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escribe tres números");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        double max1, max2= Double.NEGATIVE_INFINITY , max3=Double.NEGATIVE_INFINITY;
        max1 = x;
        if(max1<y){
            max1 = y;
        }
        if(max1<z){
            max1=z;
        }
        if(max2<x&&x!=max1) {
            max2 = x;
        }
        if(max2<y&&y!=max1){
            max2=y;
        }
        if(max2<z&&z!=max1){
            max2=z;
        }
        if(max3<y&&y!=max2&&y!=max1){
            max3=y;
        }
        if(max3<x&&x!=max1&&x!=max2){
            max3=x;
        }
        if(max3<z&&z!=max1&&z!=max2){
            max3=z;
        }
        System.out.print("El orden es: " + (int)max1 + ", " + (int)max2 + ", " + (int)max3);
    }
}