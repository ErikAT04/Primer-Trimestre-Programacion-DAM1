package Estructuras_De_Control;

import java.util.Scanner;

public class EjWhileDoWhile4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, suma=0, mayor=0, i=0,cuenta=0; //Inicializo las variables para no tener errores
        double mediaimp;
        boolean par=false;
        System.out.println("Comience a introducir los números que quiera para utilizar en el programa.\nUna vez quiera acabar, introduzca un número negativo.");
        num=scan.nextInt();
        while(num>=0){
            if((num%2==0)&&(mayor<num)){//Si es par y el numero es mayor al previamente llamado "mayor", entonces pasa a ser el nuevo mayor
                par=true; //Para que aparezca algún par
                mayor=num;
            } else if (num%2==1){//Si el número es impar, se añade a una variable de suma
                //Hay que poner la condición en el else porque si no añadiría números pares menores que el mayor
                suma=suma+num;
                cuenta++;//Esta cuenta lleva la cantidad de impares introducidos para la media
            }
            i++; //Añade un número más a la cuenta de cuántos números se han escrito por el momento
            System.out.println("Introduzca su siguiente número:");
            num=scan.nextInt();
        }
        scan.close();
        System.out.println("Introducción finalizada.\nSe han introducido " + i + " números");
        if(par){//Si no se meten pares, sería una estupidez que te diga cual es el mayor de los pares
            System.out.println("De los pares introducidos, el mayor ha sido " + mayor);
        }
        if(cuenta!=0){ //Para evitar que, si no meten impares, nos diga que la media de los impares es un número inexistente (NaN)
            mediaimp=(double)suma/cuenta;//La suma de impares entre la cantidad de impares introducidos
            System.out.println("La media de los impares es " + mediaimp);
        }
    }
}