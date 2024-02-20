package Estructuras_De_Control;

import java.util.Scanner;
public class EjsEstrFOR3Caso2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, i, calculo;
        String op, operacion = "";
        do {
            System.out.println("Escribe el número del 0 al 9 que desea introducir en la tabla de operación");
            num = scan.nextInt();
            if (num<0||num>9){
                System.out.println("Este número no es válido");
            }
        }while(num<0||num>9);
        System.out.println("Escribe la operación que desea realizar(s,r,m,S,R,M,+,-,x)");
        op = scan.next();
        switch(op){
            case "s","S","+":
                operacion=" + ";
                break;
            case "r","R","-":
                operacion= " - ";
                break;
            case "m","M","x":
                operacion= " * ";
                break;
            default:
                System.out.println("El valor que has introducido para la operación no es válido.");
                System.exit(0);
        }
        for (i=0;i<=10; i++){
            if(operacion.contains("+")){
                calculo=num+i;
            } else if (operacion.contains ("-")){
                calculo=num-i;
            } else{
                calculo=num*i;
            }
            System.out.println(num + operacion + i + " es " + calculo);
        }
    }
}