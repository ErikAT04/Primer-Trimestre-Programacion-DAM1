package Estructuras_De_Control;

import java.util.Scanner;
import java.lang.Math;

public class EjsEstrucControlUno3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, respuesta, cuenta=0;
        System.out.println("¡Vamos a jugar a un juego!\nEste juego trata de hacer cáclulo mental.");
        System.out.println("El programa te dará dos números entre 1 y 100 para sumar.\nUna vez falles, el juego terminará y diremos tu puntuación.\nCOMENZAMOS:");
        while(true){
            num1= (int) (Math.random()*100+1);
            num2= (int) (Math.random()*100+1);
            System.out.print(num1 + " + " + num2 + " = ");
            respuesta=scan.nextInt();
            if(respuesta!=(num1+num2)){
                break;
            }
            cuenta++;
        }
        System.out.println("Al fallar, el juego ha finalizado.\nHas acertado " + cuenta + " veces.");
    }
}
