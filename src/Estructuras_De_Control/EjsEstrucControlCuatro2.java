package Estructuras_De_Control;

import java.util.Scanner;

public class EjsEstrucControlCuatro2 {
    public static void main(String[] args) {
        int hora,min,seg;
        boolean diasiguiente=false;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Escribe la hora en la que nos encontramos:");
            hora=scan.nextInt();
            System.out.println("Ahora escriba los minutos:");
            min=scan.nextInt();
            System.out.println("Entendido, ahora dime los segundos:");
            seg=scan.nextInt();
            if((hora<0||hora>=24)||(min<0||min>=60)||(seg<0||seg>=60)){
                System.out.println("Alguno de los datos no está introducido correctamente, vuelva a intentarlo.");
            }
        }while((hora<0||hora>=24)||(min<0||min>=60)||(seg<0||seg>=60));
        System.out.println("Datos introducidos correctamente");
        System.out.printf("Son las %02d:%02d:%02d.\n", hora, min ,seg);
        seg++;
        if(seg==60){
            min++;
            seg=0;
        }
        if(min==60){
            hora++;
            min=0;
        }
        if(hora==24){
            hora=0;
            diasiguiente=true;
        }
        System.out.printf("Un segundo más tarde será las %02d:%02d:%02d", hora, min ,seg);
        if(diasiguiente){
            System.out.println(" del día siguiente.");
        }else System.out.println(".");
    }
}
