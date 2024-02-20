package Estructuras_De_Control;

import java.util.Scanner;
public class EjsSwitch2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Escribe un día de la semana");
        String dia = scan.next();
        switch(dia){
            case ("Lunes"),("lunes"),("LUNES"):
                System.out.println("Los lunes a primera hora hay Programación.");
                break;
            case "Martes","martes","MARTES":
                System.out.println("Los martes a primera hora hay Entornos de Desarrollo.");
                break;
            case "Miercoles","miercoles","MIERCOLES","Miércoles","miércoles","MIÉRCOLES":
                System.out.println("Los miércoles a primera hora hay Sistemas Informáticos.");
                break;
            case "Jueves","jueves","JUEVES":
                System.out.println("Los jueves a primera hora hay Programación.");
                break;
            case "Viernes","viernes","VIERNES":
                System.out.println("Los viernes a primera hora hay Bases de Datos.");
                break;
            case "Sábado","sábado","SÁBADO","Sabado","sabado","SABADO":
                System.out.println("Los sábados no hay clase (como norma general)");
            case "Domingo","domingo","DOMINGO":
                System.out.println("Los domingos no suele haber clase");
            default:
                System.out.println(dia + " no es una palabra válida para esto");
        }
    }
}
