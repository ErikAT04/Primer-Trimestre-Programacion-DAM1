package Estructuras_De_Control;

import java.util.Scanner;
public class EjTotal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Elige el ejercicio que quieres hacer:\n");
        int x = scan.nextInt();
        while(x<1||x>4){
            System.out.print("Número inválido, ponga otro\n");
            x  = scan.nextInt();
        }
        scan.close();
        switch (x){
            case 1:
                Ej1();
                break;
            case 2:
                Ej2();
                break;
            case 3:
                Ej3();
                break;
            case 4:
                Ej4();
                break;

        }
    }
    public static void Ej1() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Escribe un número entero\n");
        int x = reader.nextInt();
        System.out.println("¿Es positivo?\n" + (x >= 0));
        reader.close();
    }
    public static void Ej2(){
        Scanner scan = new Scanner(System.in);
        int x,y;
        System.out.print("Escribe dos números\n");
        x=scan.nextInt();
        y=scan.nextInt();
        System.out.print("¿Alguno de los números es 0 o son números diferentes entre ellos?\n" + (x==0 || x!=y));
        scan.close();
    }
    public static void Ej3(){
        Scanner muls = new Scanner(System.in);
        int x;
        System.out.print("Escribe un número que quieras saber si es múltiplo de 2");
        x=muls.nextInt();
        muls.close();
        System.out.print("¿Es un múltiplo de 2?\n" + (x%2==0));
    }
    public static void Ej4(){
        Scanner pide = new Scanner(System.in);
        int x, y;
        System.out.print("Escribe el primer número");
        x=pide.nextInt();
        System.out.print("¿De qué número quieres saber si es múltiplo?");
        y=pide.nextInt();
        System.out.print("¿Es " + x + " múltiplo de " + y + "?\n" + (x%y==0));
        pide.close();
    }
}