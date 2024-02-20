package Estructuras_De_Control;

import java.util.Scanner;

public class EjsEstrucControlTres4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, cifra=0;
        String numeroatexto;
        do {
            System.out.println("Introduce un número POSITIVO de, como mucho, 5 cifras");
            num=scan.nextInt();
        }while(num>99999||num<0);
        numeroatexto = Integer.toString(num);
        do {
            cifra++;
            num=num/10;
        }while(num!=0);
        switch (cifra){
            case 1:
                System.out.println("Los números de 1 cifra siempre son capicúa (o nunca, depende del criterio de cada uno)");
                break;
            case 2:
                if(numeroatexto.charAt(0)==numeroatexto.charAt(1)){
                    System.out.println("El número es capicúa");
                } else{
                    System.out.println("El número no es capicúa");
                }
                break;
            case 3:
                if(numeroatexto.charAt(0)==numeroatexto.charAt(2)){
                    System.out.println("El número es capicúa");
                } else {
                    System.out.println("El número no es capicúa");
                }
                break;
            case 4:
                if(numeroatexto.charAt(0)==numeroatexto.charAt(3)&&numeroatexto.charAt(1)==numeroatexto.charAt(2)){
                    System.out.println("El número es capicúa");
                } else{
                    System.out.println("El número no es capicúa");
                }
                break;
            case 5:
                if(numeroatexto.charAt(0)==numeroatexto.charAt(4)&&numeroatexto.charAt(1)==numeroatexto.charAt(3)){
                    System.out.println("El número es capicúa");
                } else{
                    System.out.println("El número no es capicúa");
                }
                break;
        }
    }
}