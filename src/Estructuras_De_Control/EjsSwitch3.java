package Estructuras_De_Control;

import java.util.Scanner;
public class EjsSwitch3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("*CONOCE TU HORÓSCOPO*");
        System.out.println("Se va a preguntar su fecha de nacimiento, primero el día y después el número del mes");
        System.out.println("Escriba el día que nació:");
        int dia=scan.nextInt();
        System.out.println("Escribe el número del mes en el que nació");
        int mes=scan.nextInt();
        switch(mes){
            case 1:
                if(1<=dia&&dia<=19){
                    System.out.println("Al haber nacido el " + dia + " de enero, eres Capricornio");
                } else if (20<=dia&&dia<=31){
                    System.out.println("Al haber nacido el " + dia + " de enero, eres Acuario");
                } else{
                    System.out.println("El día introducido no es válido");
                }
                break;
            case 2:
                if(1<=dia&&dia<=18){
                    System.out.println("Al haber nacido el " + dia + " de febrero, eres Acuario");
                } else if (19<=dia&&dia<=29){
                    System.out.println("Al haber nacido el " + dia + " de febrero, eres Piscis");
                } else{
                    System.out.println("El día introducido no es válido");
                }
                break;
            case 3:
                if(1<=dia&&dia<=20){
                    System.out.println("Al haber nacido el " + dia + " de marzo, eres Piscis");
                } else if (21<=dia&&dia<=31){
                    System.out.println("Al haber nacido el " + dia + " de marzo, eres Aries");
                } else{
                    System.out.println("El día introducido no es válido");
                }
                break;
            case 4:
                if(1<=dia&&dia<=19){
                    System.out.println("Al haber nacido el " + dia + " de abril, eres Aries");
                } else if (20<=dia&&dia<=30){
                    System.out.println("Al haber nacido el " + dia + " de abril, eres Tauro");
                } else{
                    System.out.println("El día introducido no es válido");
                }
                break;
            case 5:
                if(1<=dia&&dia<=20){
                    System.out.println("Al haber nacido el " + dia + " de mayo, eres Tauro");
                } else if (21<=dia&&dia<=31){
                    System.out.println("Al haber nacido el " + dia + " de mayo, eres Géminis");
                } else{
                    System.out.println("El día introducido no es válido");
                }
                break;
            case 6:
                if(1<=dia&&dia<=10){
                    System.out.println("Al haber nacido el " + dia + " de junio, eres Géminis");
                } else if (21<=dia&&dia<=30){
                    System.out.println("Al haber nacido el " + dia + " de junio, eres Cáncer");
                } else{
                    System.out.println("El día introducido no es válido");
                }
                break;
            case 7:
                if(1<=dia&&dia<=22){
                    System.out.println("Al haber nacido el " + dia + " de julio, eres Cáncer");
                } else if (23<=dia&&dia<=31){
                    System.out.println("Al haber nacido el " + dia + " de julio, eres Leo");
                } else{
                    System.out.println("El día introducido no es válido");
                }
                break;
            case 8:
                if(1<=dia&&dia<=22){
                    System.out.println("Al haber nacido el " + dia + " de agosto, eres Leo");
                } else if (23<=dia&&dia<=31){
                    System.out.println("Al haber nacido el " + dia + " de agosto, eres Virgo");
                } else{
                    System.out.println("El día introducido no es válido");
                }
                break;
            case 9:
                if(1<=dia&&dia<=22){
                    System.out.println("Al haber nacido el " + dia + " de septiembre, eres Virgo");
                } else if (20<=dia&&dia<=30){
                    System.out.println("Al haber nacido el " + dia + " de septiembre, eres Libra");
                } else{
                    System.out.println("El día introducido no es válido");
                }
                break;
            case 10:
                if(1<=dia&&dia<=22){
                    System.out.println("Al haber nacido el " + dia + " de octubre, eres Libra");
                } else if (23<=dia&&dia<=31){
                    System.out.println("Al haber nacido el " + dia + " de octubre, eres Escorpio");
                } else{
                    System.out.println("El día introducido no es válido");
                }
                break;
            case 11:
                if(1<=dia&&dia<=11){
                    System.out.println("Al haber nacido el " + dia + " de noviembre, eres Escorpio");
                } else if (22<=dia&&dia<=30){
                    System.out.println("Al haber nacido el " + dia + " de noviembre, eres Sagitario");
                } else{
                    System.out.println("El día introducido no es válido");
                }
                break;
            case 12:
                if(1<=dia&&dia<=21){
                    System.out.println("Al haber nacido el " + dia + " de diciembre, eres Sagitario");
                } else if (22<=dia&&dia<=31){
                    System.out.println("Al haber nacido el " + dia + " de diciembre, eres Capricornio");
                } else{
                    System.out.println("El día introducido no es válido");
                }
                break;
            default:
                System.out.println("El mes escrito no es válido");
        }
    }
}
