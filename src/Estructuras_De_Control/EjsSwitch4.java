package Estructuras_De_Control;

import java.util.Scanner;
public class EjsSwitch4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("A partir del viernes a las 15:00 se dice que es oficialmente fin de semana");
        System.out.println("Introduce el número de día en el que te encuentras para saber cuánto queda para el viernes a las 15:00");
        int dia = scan.nextInt();
        System.out.println("Introduce la hora actual (Primero hora y luego minutos)");
        int hora = scan.nextInt();
        int minus = scan.nextInt();
        switch(dia){ //Hago un switch para diferenciar los días, por no llenarlo de ifs
            case 1: //Lunes
                if(0<=hora&&hora<=23&&0<=minus&&minus<=59){ //Es decir, si la hora está entre 0 y 23 y los minutos entre 0 y 59
                    System.out.println("Son las " + hora + ":" + minus + " del lunes");
                } else { //Si no se cumple alguna de las dos, te dice que es inválido y se cierra el código para que no siga y diga cosas raras
                    System.out.println("Formato de hora inválido");
                    System.exit(0);
                }
                break; //Salir del switch
            case 2://Martes
                if(0<=hora&&hora<=23&&0<=minus&&minus<=59){
                    System.out.println("Son las " + hora + ":" + minus + " del martes");
                } else {
                    System.out.println("Formato de hora inválido");
                    System.exit(0);
                }
                break;
            case 3://Miércoles
                if(0<=hora&&hora<=23&&0<=minus&&minus<=59){
                    System.out.println("Son las " + hora + ":" + minus + " del miércoles");
                } else {
                    System.out.println("Formato de hora inválido");
                    System.exit(0);
                }
                break;
            case 4://Jueves
                if(0<=hora&&hora<=23&&0<=minus&&minus<=59){
                    System.out.println("Son las " + hora + ":" + minus + " del jueves");
                } else {
                    System.out.println("Formato de hora inválido");
                    System.exit(0);
                }
                break;
            case 5://Viernes
                if(0<=hora&&hora<=14&&0<=minus&&minus<=59){//Aquí lo que he hecho ha sido hacer que la hora llegue a las 14:59 en vez de las 23:59, porque el finde acaba a las 15:00
                    System.out.println("Son las " + hora + ":" + minus + " del viernes");
                } else {
                    System.out.println("Formato de hora inválido (Recuerda que el viernes a partir de las 15:00 ya es fin de semana)");
                    System.exit(0);
                }
                break;
            default://Esto es por si alguien mete sábado, domingo o algún otro número
                System.out.println("Día inválido");
                System.exit(0);
        }
        int minsrestantes = 8100 - (60*hora) - (minus) - (dia*1440); //8100 porque esos son los minutos desde el lunes a las 00:00 hasta el viernes a las 15:00
        //Ahora cálculo matemático:
        //Una hora son 60 minutos
        //Un día son 24 horas * 60 minutos = 1440 minutos
        //Pues lo que hay que hacer ahora es restar el viernes a las 15:00 menos el día que hayamos metido
        //Ejemplo: Martes a las 12:30
        //Martes = 2*1440=2880 minutos
        //12 horas son 720 minutos
        //Ahora hacemos la suma: 720+2880+30=3630
        //Para saber el resultado de cuanto queda: 8100-3630=4470 minutos
        System.out.println("Quedan " + minsrestantes + " minutos para el fin de semana");
    }
}