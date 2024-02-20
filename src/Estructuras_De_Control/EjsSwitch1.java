package Estructuras_De_Control;

import java.util.Scanner;
public class EjsSwitch1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe el número de un día de la semana");
        int x = scan.nextInt();
        switch (x){
            case(1):
                System.out.print("Lunes");
                break;
            case(2):
                System.out.print("Martes");
                break;
            case(3):
                System.out.print("Miércoles");
                break;
            case(4):
                System.out.print("Jueves");
                break;
            case(5):
                System.out.print("Viernes");
                break;
            case(6):
                System.out.print("Sábado");
                break;
            case(7):
                System.out.print("Domingo");
                break;
            default:
                System.out.print("No es un número válido.\n Recuerda que los días de la semana son del 1 al 7");
            }
        }
    }
