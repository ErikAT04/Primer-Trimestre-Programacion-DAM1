package Estructuras_De_Control;

import java.util.Scanner;

public class UltimaCifra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, num;
        System.out.println("Escribe el número del que quieres que te diga su última cifra");
        num =scan.nextInt();
        //Registro el número en una variable num,  más que nada para que al finalizar también diga el número introducido.
        scan.close(); //Cierro escaner
        x=num;
        //x es una variable que va a ir reduciéndose hasta llegar al número que busca,os
        while(x/10!=0){
            x=x/10;
        }
        //Explicación detallada de lo que hace:
        //Actualiza el valor de x para hacer x/10 y, al ser división de enteros(sin decimales), desaparece una cifra
        //Al llegar al final, como x va a ser 0 si se divide entre (10 al no haber decimales), se sale del bucle, haciendo que x se quede como la ultima cifra registrada.
        //12345/10 en enteros es 1234, asi que x=1234
        //x=1234/10=123
        //x=123/10=12
        //x=12/10=1
        //Ahora, como de primeras x/10 va a ser 0, nos salimos del bucle, haciendo así que x se quede como 1, la última cifra
        if(x<0){
            x=-x;
        }//Esto es solo un ajuste para que no quede que la ultima cifra de, por ejemplo, -153 sea -1
        System.out.print("El valor de la última cifra del número " + num + " es " + x);
    }
}