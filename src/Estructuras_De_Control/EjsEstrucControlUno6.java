package Estructuras_De_Control;

import java.util.Scanner;

public class EjsEstrucControlUno6{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, num;
        do {
            System.out.println("Escribe un número de hasta 5 cifras del que quieres que te diga su primera cifra");
            num =scan.nextInt();
            if(num>=(-99999)&&num<=99999){
                break;
            }
            System.out.println("El número no es válido, recuerda que ha de tener como mucho 5 cifras.");
        } while(true);
        scan.close();
        x=num;//Para poner el resultado final más bonito, se podría utilizar num en vez de x en las siguientes operaciones
        while(x/10!=0) {
            x = x / 10;
        }
        if (num<0)//Se puede usar o num o x en este if, a gusto de consumidor, porque no dejan de venir de la misma raiz
            x=-x; //Por si es negativo que no aparezca por ejemplo que la primera cifra es -4
        System.out.print("El valor de la primera cifra del número " + num + " es " + x);
    }
}