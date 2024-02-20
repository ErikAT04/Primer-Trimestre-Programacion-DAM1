package Estructuras_De_Control;

import java.util.Scanner;

public class EjsSwitch7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dia=0, mes;
        System.out.println("Introduce el número de un mes");
        mes=scan.nextInt();
        switch(mes){
            case 1,3,5,7,8,10,12:
                dia=31;
                break;
            case 4, 6, 9, 11:
                dia=30;
                break;
            case 2:
                dia=28;
                break;
            default:
                System.out.println("El mes introducido no es válido");
        }
        if(dia!=0){
            System.out.println("Este mes tiene " + dia + " dias");
        }
    }
}
