package Estructuras_De_Control;

import java.util.Scanner;

public class EjsEstrucControlUno2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dia, año;
        String mes;
        System.out.println("Escribe un día del mes");
        dia=scan.nextInt();
        System.out.println("Escribe un mes del año");
        mes=scan.next();
        System.out.println("Escribe un año");
        año=scan.nextInt();
        if(dia<=0||dia>31){
            System.out.println("De primeras ese día no puede existir nunca");
            System.exit(0);
        }
        switch (mes.toLowerCase()){
            case "enero","marzo","mayo","julio","agosto","octubre","diciembre":
                System.out.println("Fecha correcta\n" + dia + " de " + mes + " de " + año);
                break;
            case "febrero":
                /*if(dia>29){
                    System.out.println("Día inválido, febrero llega a 28 días (29 si es bisiesto)");
                } else if (dia==29&&año%4!=0) {
                    System.out.println("Día inválido, febrero solo tiene 29 dias en año bisiesto");
                } else {
                    System.out.print("Fecha correcta\n" + dia + " de " + mes + " de " + año);
                }//Caso en el que los años bisiestos existen*/
                if(dia>28){
                    System.out.println("La fecha no es válida, recuerda que febrero llega a 28 días.");
                } else{
                    System.out.println("Fecha correcta\n" + dia + " de " + mes + " de " + año);
                } //Caso en el que los años bisiestos no existen
                break;
            case "abril", "junio", "septiembre", "noviembre":
                if(dia>30){
                    System.out.printf("Fecha incorrecta, " + mes + " llega a 30 días.");
                } else {
                    System.out.print("Fecha correcta\n" + dia + " de " + mes + " de " + año);
                }
                break;
            default:
                System.out.println("Ese mes no es válido (si lo has escrito con números recuerda escribir el nombre del mes)");
        }
    }
}