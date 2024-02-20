package Tareas;

import java.util.Scanner;

public class ErikAmo_tarea3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, mcd=0; //Inicio las variables que voy a necesitar, más adelante se explicará para qué es cada una.
        do {
            System.out.println("Escribe el primer número para el máximo común divisor");
            num1 = scan.nextInt();
            System.out.println("Escribe el segundo número");
            num2 = scan.nextInt();
            if(num1<=0||num2<=0){
                System.out.println("Alguno de los números puede ser negativo o 0. Trate de poner positivos.");
            }
        }while(num1<=0||num2<=0); //Excluyo todos los casos que podrían traer problemas, como son el 0 (no tiene divisores) y los negativos.
        if (num1==num2){//Aquí hacemos el caso de que los números introducidos sean iguales.
            System.out.println("El máximo común divisor de dos números iguales es el propio número, en este caso " + num1);
        } else { //Ya el único caso que queda es que los números sean diferentes y positivos.
            for(int i=1; i<=num1; i++){
                if(num1%i==0&&num2%i==0){
                    mcd=i;
                }

            }
/*
Aquí abro una explicación matemática de este for:
Los divisores o múltiplos de un número son aquellos que, si se divide el número entre su divisor, el resto de estos va a ser 0;
Es decir: numero%divisor=0
Para sacar el máximo divisor de un número, hace falta un bucle for que vaya desde el 1 (minimo divisor de todos los números) al propio número (el máximo divisor)
Para meter un número en el bucle for aclaro que no es necesario meter el más alto o el más pequeño, ya que una vez pase el pequeño la próxima condición nunca se va a cumplir (no hay divisor de 20 mas grande que 20)
Si para sacar el divisor tenemos que hacer [if(num1%i==0){mcd=i}, para hacer el común de dos números es haciendo que se cumpla eso mismo a la vez.
¿Cómo se cumple eso? Con un if en el que si los dos números a la vez entre, en este caso, i, tenga como resto 0, ese sea declarado como divisor común.
Ahora solo hay que hacer que el programa haga eso hasta el máximo divisor común entre los 2.
Un ejemplo: 10 y 30.
10 tiene como divisores 1, 2, 5 y 10
30 tiene como divisores 1, 2, 3, 5, 6, 10, 15 y 30.
En común tienen el 1, 2, 5 y 10, pero el mayor de todos es el 10.
*/
            System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es " + mcd);
        }
    }
}