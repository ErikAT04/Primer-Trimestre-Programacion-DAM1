package Estructuras_De_Control;

import java.util.Scanner;
public class NotaAlumno {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double x;
        System.out.print("Escribe la nota del alumno:\n");
        x = reader.nextDouble();
        while (x<0 || x>10){
            System.out.print("La nota no es válida, escriba una que sí \n");
            x = reader.nextDouble();
        }
        reader.close();
        if(x>=5){
            System.out.print("El alumno ha aprobado con un " + x + "\n");
            if(x>=7&&x<9){
                System.out.print("Ha sacado un notable");
            }
            if(x>=9){
                System.out.print("Ha sacado un sobresaliente");
            }
        }
        else{
            System.out.print("El alumno ha suspendido con un " + x);
        }
    }
}
