package Estructuras_De_Control;

import java.util.Scanner;

public class EjsEstrucControlUno1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, cifra=0;
        while(true){
            System.out.println("Escribe el número que quieres saber cuántas cifras tiene (Tiene que estar entre (0 y 99999)");
            num=scan.nextInt();
            if(num>=0&&num<=99999){//Sale del bucle infinito siempre y cuando sea ese número
                break;
            }
            System.out.println("Número inválido.");//Si no, te escribe esto. Es como hacer un if infinito
        }
        do{
            cifra++;
            num=num/10;
        }while(num!=0);//Mientras el numero sea diferente de 0, seguirá haciendo esto
        //Ejemplo rápido, 47652
        //47652/10=4765, cifra=1
        //4765/10=476, cifra=2
        //476/10=47, cifra=3
        //47/10=4, cifra=4
        //4/10=0, cifra=5
        //Como 0 no es diferente de 0, se sale del bucle
        System.out.println("El número tiene " + cifra + " cifras");
    }
}
