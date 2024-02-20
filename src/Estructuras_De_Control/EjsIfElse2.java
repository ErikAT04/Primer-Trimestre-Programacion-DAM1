package Estructuras_De_Control;

import java.util.Scanner;
public class EjsIfElse2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escribe la hora");
        int hora = scan.nextInt();
        while(0>hora||hora>24){
            System.out.print("Hora inválida, escriba otra");
            hora=scan.nextInt();
        }
        if(6<hora&&12>hora){
            System.out.print("Buenos días");
        } else if(hora>12&&hora<=20){
                System.out.print("Buenas tardes");
            }
        else{
                System.out.print("Buenas noches");
            }
        }
    }