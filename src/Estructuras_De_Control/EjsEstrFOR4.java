package Estructuras_De_Control;

import java.util.Scanner;
public class EjsEstrFOR4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pos=0, neg=0, num=0;
        System.out.println("Escribe 10 números y te diré cuántos son positivos y cuántos negativos");
        for(int i = 0; i<10; i++){
            num = scan.nextInt();
            if(num<0){
                neg++;
            } else{
                pos++;
            }
        }
        System.out.println("Hay " + pos + " positivos.");
        System.out.println("Hay " + neg + " negativos");
    }
}