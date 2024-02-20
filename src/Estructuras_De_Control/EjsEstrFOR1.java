package Estructuras_De_Control;

import java.util.Scanner;

public class EjsEstrFOR1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, i, suma = 0;
        do{
            System.out.println("Escribe un número positivo y sumaré los 100 siguientes");
            num=scan.nextInt();
            if (num<0){
                System.out.println("Este número es negativo, no es válido.");
            }
        }while(num<0);
        System.out.println("Iniciando suma de los 100 números que siguen a " + num + ":");
        for(i=num+1; i<=num+100; i++){//Ejemplo con 0: i empieza siendo 1 y acaba en 100
            suma=suma+i;//Siguiendo el ejemplo, 'suma' va sumando los números de 1 hasta 100
        }
        System.out.println("El resultado final es: " + suma);
    }
}
