package Estructuras_De_Control;

import java.util.Scanner;

public class EjsEstrucControlDos6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int altura;
        System.out.println("Vamos a hacer un cuadrado.\nIngrese la altura del cuadrado:");
        altura=scan.nextInt();
        if(altura<=0){
            System.out.println("Lo siento, no puedo hacer cuadrados ni con 0 ni con números negativos.");//Lógico
        } else{
            for(int y=1;y<=altura;y++){//Y es la altura del cuadrado, como en los ejes de coordenadas
                for(int x=1;x<=altura;x++){//X es la longitud del cuadrado, como si estuviera en unas coordenadas
                    System.out.print("*");//Uso el print normal para que escriba sin saltar linea
                }
                System.out.println();//Una vez puestos todos los asteriscos que nos interesan, salto de línea
            }
        }
    }
}