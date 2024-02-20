package Funciones;

import java.util.Scanner;

public class EjEjemploFuncion4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe un carácter y te diré si es una vocal (importante meter solo un caracter, si no no funcionará)");
        String letra=scan.nextLine();
        letra = letra.toLowerCase();
        boolean esvocal = comprobarVocal(letra);
        if(esvocal){
            System.out.println("Es una vocal");
        } else{
            System.out.println("No es una vocal");
        }
    }
    static boolean comprobarVocal(String letraacomprobar){
        boolean esvocal;
        if(letraacomprobar.equals("a")|| letraacomprobar.equals("e") || letraacomprobar.equals("i") || letraacomprobar.equals("o") || letraacomprobar.equals("u")){
            esvocal=true;
        } else {
            esvocal=false;
        }
        return esvocal;
    }
}
