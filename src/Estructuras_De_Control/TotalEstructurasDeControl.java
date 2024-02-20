package Estructuras_De_Control;

import java.util.Scanner;

public class TotalEstructurasDeControl {
    public static void main(String[] args) {
        int bloque, ej;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe el número del bloque de ejercicios de estructuras de control:");
        bloque = scan.nextInt();
        switch (bloque) {
            case 1:
                System.out.println("Bloque de estructuras de control 1 seleccionado.\nElige el número del ejercicio.");
                ej = scan.nextInt();
                switch (ej) {
                    case 1:
                        System.out.println("Ejercicio 1 del bloque 1:");
                        System.out.println("Escribir una aplicación que indique cuantas cifras tiene un número entero positivo introducido por teclado, que estará comprendido entre 0 y 99999.");
                        bloque1ej1();
                        break;
                    case 2:
                        System.out.println("Ejercicio 2 del bloque 1:");
                        System.out.println("Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Hay que tener en cuenta que existen meses con 28,30 y 31 días (suponemos que no existen los años bisiestos)");
                        bloque1ej2();
                        break;
                    case 3:
                        System.out.println("Ejercicio 3 del bloque 1:");
                        System.out.println();
                        bloque1ej3();
                        break;
                    case 4:
                        System.out.println("Ejercicio 4 del bloque 1:");
                        System.out.println();
                        bloque1ej4();
                        break;
                    case 5:
                        System.out.println("Ejercicio 5 del bloque 1:");
                        System.out.println();
                        bloque1ej5();
                        break;
                    case 6:
                        System.out.println("Ejercicio 6 del bloque 1:");
                        System.out.println();
                        bloque1ej6();
                        break;
                    default:
                        System.out.println("Este ejercicio no existe.");
                }
            case 2:
                System.out.println("Bloque de estructuras de control 2 seleccionado.\nElige el número del ejercicio.");
                ej = scan.nextInt();
                switch (ej) {
                    case 1:
                        System.out.println("Ejercicio 1 del bloque 2:");
                        System.out.println();
                        bloque2ej1();
                        break;
                    case 2:
                        System.out.println("Ejercicio 2 del bloque 2:");
                        System.out.println();
                        bloque2ej2();
                        break;
                    case 3:
                        System.out.println("Ejercicio 3 del bloque 2:");
                        System.out.println();
                        bloque2ej3();
                        break;
                    case 4:
                        System.out.println("Ejercicio 4 del bloque 2:");
                        System.out.println();
                        bloque2ej4();
                        break;
                    case 5:
                        System.out.println("Ejercicio 5 del bloque 2:");
                        System.out.println();
                        bloque2ej5();
                        break;
                    case 6:
                        System.out.println("Ejercicio 6 del bloque 2:");
                        System.out.println();
                        bloque2ej6();
                        break;
                    case 7:
                        System.out.println("Ejercicio 7 del bloque 2:");
                        System.out.println();
                        bloque2ej7();
                        break;
                    default:
                        System.out.println("Este ejercicio no existe.");
                }
            case 3:
                System.out.println("Bloque de estructuras de control 3 seleccionado.\nElige el número del ejercicio.");
                ej = scan.nextInt();
                switch (ej) {
                    case 1:
                        System.out.println("Ejercicio 1 del bloque 3:");
                        System.out.println();
                        bloque3ej1();
                        break;
                    case 2:
                        System.out.println("Ejercicio 2 del bloque 3:");
                        System.out.println();
                        bloque3ej2();
                        break;
                    case 3:
                        System.out.println("Ejercicio 3 del bloque 3:");
                        System.out.println();
                        bloque3ej3();
                        break;
                    case 4:
                        System.out.println("Ejercicio 4 del bloque 3:");
                        System.out.println();
                        bloque3ej4();
                        break;
                    case 5:
                        System.out.println("Ejercicio 5 del bloque 3:");
                        System.out.println();
                        bloque3ej5();
                        break;
                    case 6:
                        System.out.println("Ejercicio 6 del bloque 3:");
                        System.out.println();
                        bloque3ej6();
                        break;
                    default:
                        System.out.println("Este ejercicio no existe.");
                }
            case 4:
                System.out.println("Bloque de estructuras de control 4 seleccionado.\nElige el número del ejercicio.");
                ej = scan.nextInt();
                switch (ej) {
                    case 1:
                        System.out.println("Ejercicio 1 del bloque 4:");
                        System.out.println();
                        bloque4ej1();
                        break;
                    case 2:
                        System.out.println("Ejercicio 2 del bloque 4:");
                        System.out.println();
                        bloque4ej2();
                        break;
                    case 3:
                        System.out.println("Ejercicio 3 del bloque 4:");
                        System.out.println();
                        bloque4ej3();
                        break;
                    case 4:
                        System.out.println("Ejercicio 4 del bloque 4:");
                        System.out.println();
                        bloque4ej4();
                        break;
                    case 5:
                        System.out.println("Ejercicio 5 del bloque 4:");
                        System.out.println();
                        bloque4ej5();
                        break;
                    case 6:
                        System.out.println("Ejercicio 6 del bloque 4:");
                        System.out.println();
                        bloque4ej6();
                        break;
                    case 7:
                        System.out.println("Ejercicio 7 del bloque 4:");
                        System.out.println();
                        bloque4ej7();
                        break;
                    default:
                        System.out.println("Este ejercicio no existe.");
                }
            default:
                System.out.println("Este bloque no existe");
        }
    }
    static void bloque1ej1(){
        Scanner scan = new Scanner(System.in);
        int num, cifra=0;
        while(true){
            System.out.println("Escribe el número que quieres saber cuántas cifras tiene (Tiene que estar entre (0 y 99999)");
            num=scan.nextInt();
            if(num>=0&&num<=99999){//Sale del bucle infinito siempre y cuando sea ese número
                break;
            }
            System.out.println("Número inválido.");//Si no, te escribe esto. Es como hacer un if infinito
        }
        do{
            cifra++;
            num=num/10;
        }while(num!=0);//Mientras el numero sea diferente de 0, seguirá haciendo esto
        //Ejemplo rápido, 47652
        //47652/10=4765, cifra=1
        //4765/10=476, cifra=2
        //476/10=47, cifra=3
        //47/10=4, cifra=4
        //4/10=0, cifra=5
        //Como 0 no es diferente de 0, se sale del bucle
        System.out.println("El número tiene " + cifra + " cifras");

    }
    static void bloque1ej2(){
        Scanner scan = new Scanner(System.in);
        int dia, ano;
        String mes;
        System.out.println("Escribe un día del mes");
        dia=scan.nextInt();
        System.out.println("Escribe un mes del año");
        mes=scan.next();
        System.out.println("Escribe un año");
        ano=scan.nextInt();
        if(dia<=0||dia>31){
            System.out.println("De primeras ese día no puede existir nunca");
            System.exit(0);
        }
        switch (mes.toLowerCase()){
            case "enero","marzo","mayo","julio","agosto","octubre","diciembre":
                System.out.println("Fecha correcta\n" + dia + " de " + mes + " de " + ano);
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
                    System.out.println("Fecha correcta\n" + dia + " de " + mes + " de " + ano);
                } //Caso en el que los años bisiestos no existen
                break;
            case "abril", "junio", "septiembre", "noviembre":
                if(dia>30){
                    System.out.printf("Fecha incorrecta, " + mes + " llega a 30 días.");
                } else {
                    System.out.print("Fecha correcta\n" + dia + " de " + mes + " de " + ano);
                }
                break;
            default:
                System.out.println("Ese mes no es válido (si lo has escrito con números recuerda escribir el nombre del mes)");
        }
    }
    static void bloque1ej3(){
        Scanner scan = new Scanner(System.in);
        int num1, num2, respuesta, cuenta=0;
        System.out.println("¡Vamos a jugar a un juego!\nEste juego trata de hacer cáclulo mental.");
        System.out.println("El programa te dará dos números entre 1 y 100 para sumar.\nUna vez falles, el juego terminará y diremos tu puntuación.\nCOMENZAMOS:");
        while(true){
            num1= (int) (Math.random()*100+1);
            num2= (int) (Math.random()*100+1);
            System.out.print(num1 + " + " + num2 + " = ");
            respuesta=scan.nextInt();
            if(respuesta!=(num1+num2)){
                break;
            }
            cuenta++;
        }
        System.out.println("Al fallar, el juego ha finalizado.\nHas acertado " + cuenta + " veces.");
    }
    static void bloque1ej4(){
        System.out.println("Escribiendo los múltiplos de 3 de los primeros 40 números:");
        for(int i=1; i<=40; i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
    static void bloque1ej5(){
        Scanner scan = new Scanner(System.in);
        int cuenta=0;
        double nota;
        System.out.println("Escribe las notas de los 5 alumnos para saber si hay alguno suspenso:");
        for(int i=1; i<=5; i++){
            nota=scan.nextDouble();
            if(nota<5){
                cuenta++;
            }
        }
        if (cuenta==0){
            System.out.println("No ha suspendido ningún alumno");
        } else {
            System.out.println("Han suspendido " + cuenta + " alumnos");
        }
    }
    static void bloque1ej6(){
        Scanner scan = new Scanner(System.in);
        int x, num;
        do {
            System.out.println("Escribe un número de hasta 5 cifras del que quieres que te diga su primera cifra");
            num =scan.nextInt();
            if(num>=(-99999)&&num<=99999){
                break;
            }
            System.out.println("El número no es válido, recuerda que ha de tener como mucho 5 cifras.");
        } while(true);
        scan.close();
        x=num;//Para poner el resultado final más bonito, se podría utilizar num en vez de x en las siguientes operaciones
        while(x/10!=0) {
            x = x / 10;
        }
        if (num<0)//Se puede usar o num o x en este if, a gusto de consumidor, porque no dejan de venir de la misma raiz
            x=-x; //Por si es negativo que no aparezca por ejemplo que la primera cifra es -4
        System.out.print("El valor de la primera cifra del número " + num + " es " + x);
    }
    static void bloque2ej1(){
        Scanner scan = new Scanner(System.in);
        int num, suma=0;
        do {
            System.out.println("Escribe un número POSITIVO para sumar los múlitplos de 3 entre el número 1 y ese");
            num=scan.nextInt();
            scan.close();
        }while(num<0);
        System.out.println("Los múltiplos de 3 desde 1 hasta " + num + " son:");
        for(int i=1; i<=num; i++){
            if(i%3==0){
                System.out.println(i);
                suma=suma+i;
            }
        }
        System.out.println("La suma de los múltiplos de 3 desde 1 hasta " + num + " es " + suma);
    }
    static void bloque2ej2(){
        Scanner scan = new Scanner(System.in);
        int num1, num2, mayor, menor;
        do {
            System.out.println("Escribe dos números positivos mayores a 0");
            num1=scan.nextInt();
            num2=scan.nextInt();
            if(num1>0||num2>0){
                break;
            }
            System.out.println("Alguno de los números introducidos es negativo, deberían ser ambos positivos para que funcione.");
        }while(true);
        if(num1>num2){
            mayor=num1;
            menor=num2;
        } else{
            mayor=num2;
            menor=num1;
        }
        System.out.println("Los números del 1 al " + mayor + " divisibles entre " + menor + " son:");
        for(int i=mayor; i!=0; i--){
            if(i%menor==0){
                System.out.println(i);
            }
        }
    }
    static void bloque2ej3(){
        Scanner scan = new Scanner(System.in);
        int numdni;
        String letraDNI="";
        System.out.println("Escribe el número del DNI y diré su letra");
        do{
            numdni=scan.nextInt();
            if(numdni>=0&&numdni<=99999999){
                break;
            }
            System.out.println("Este número no sirve, tiene que tener como mucho 8 cifras y no puede ser negativo\nEscribe otro.");
        }while(true);
        scan.close();
        letraDNI = switch (numdni % 23) {
            case 0 -> "T";
            case 1 -> "R";
            case 2 -> "W";
            case 3 -> "A";
            case 4 -> "G";
            case 5 -> "M";
            case 6 -> "Y";
            case 7 -> "F";
            case 8 -> "P";
            case 9 -> "D";
            case 10 -> "X";
            case 11 -> "B";
            case 12 -> "N";
            case 13 -> "J";
            case 14 -> "Z";
            case 15 -> "S";
            case 16 -> "Q";
            case 17 -> "V";
            case 18 -> "H";
            case 19 -> "L";
            case 20 -> "C";
            case 21 -> "K";
            case 22 -> "E";
            default -> letraDNI;
        };
        System.out.printf("La letra el DNI %08d", numdni);
        System.out.print(" es " + letraDNI);
    }
    static void bloque2ej4(){
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("¿Quieres saber los múltiplos hasta 100 del 2 o del 3?");
        num=scan.nextInt();
        if(num==2||num==3){
            System.out.println("Entendido, mostrando múltiplos de " + num + " hasta el 100");
            for(int i=1; i<=100; i++){
                if(i%num==0){
                    System.out.println(i);
                }
            }
        }else {
            System.out.println("Este número no es ni 3 ni 2, lo siento");
        }
    }
    static void bloque2ej5(){
        Scanner scan = new Scanner(System.in);
        double num;
        int suspenso=0,aprobado=0,notable=0,sobresaliente=0,matrHonor=0,total=0;
        String respuesta;
        System.out.println("Bienvenid@ al acumulador y calificador de notas.\nEste programa está hecho con el fin de agrupar las calificaciones de los alumnos en función de si han suspendido");
        System.out.println("Comienza el programa:");
        do {
            System.out.println("Introduzca la nota del alumno");
            num = scan.nextDouble();
            while (num < 0 || num > 10){
                System.out.println("Número inválido, escribe uno entre 0 y 10");
                num = scan.nextDouble();
            }
            if(num<5){
                System.out.println("Este ha suspendido");
                suspenso++;
            }else if(num<=6.5){
                System.out.println("Este ha aprobado");
                aprobado++;
            }else if(num<8.5){
                System.out.println("Este ha sacado un notable");
                notable++;
            }else if(num==10){
                System.out.println("Este ha obtenido una matrícula de honor");
                matrHonor++;
            }else{
                System.out.println("Este ha sacado un sobresaliente");
                sobresaliente++;
            }
            total++;
            System.out.println("¿Quieres continuar metiendo notas?s/n");
            respuesta=scan.next();
        }while(!respuesta.equalsIgnoreCase("n"));
        System.out.println("Programa finalizado. Sacando resultados...");
        System.out.println("Se han introducido un total de " + total + " notas.");
        System.out.print("Han suspendido " + suspenso + " alumnos, ");
        System.out.printf("un %.2f", ((double)suspenso/total*100));
        System.out.println("%");
        System.out.print("Han aprobado " + aprobado + " alumnos, ");
        System.out.printf("un %.2f", ((double)aprobado/total*100));
        System.out.println("%");
        System.out.print("Han aprobado " + notable + " alumnos con notable, ");
        System.out.printf("un %.2f", ((double)notable/total*100));
        System.out.println("%");
        System.out.print("Han aprobado " + sobresaliente + " alumnos con sobresaliente, ");
        System.out.printf("un %.2f", ((double)sobresaliente/total*100));
        System.out.println("%");
        System.out.print(matrHonor + " alumnos han sacado matrícula de honor, ");
        System.out.printf("un %.2f", ((double)matrHonor/total*100));
        System.out.println("%");
    }
    static void bloque2ej6(){
        Scanner scan = new Scanner(System.in);
        int altura;
        System.out.println("Vamos a hacer un cuadrado.\nIngrese la altura del cuadrado:");
        altura=scan.nextInt();
        if(altura<=0){
            System.out.println("Lo siento, no puedo hacer cuadrados ni con 0 ni con números negativos.");//Lógico
        } else{
            for(int y=1;y<=altura;y++){//Y es la altura del cuadrado, como en los ejes de coordenadas
                for(int x=1;x<=altura;x++){//X es la longitud del cuadrado, como si estuviera en unas coordenadas
                    System.out.print("*");//Uso el print normal para que escriba sin saltar linea
                }
                System.out.println();//Una vez puestos todos los asteriscos que nos interesan, salto de línea
            }
        }
    }
    static void bloque2ej7(){
        Scanner scan = new Scanner(System.in);
        int num,cifras=0;
        System.out.println("Escribe un número de hasta 5 cifras y te diré cuántas cifras tiene");
        do {
            num=scan.nextInt();
            if(num>=-99999&&num<=99999)
                break;
            System.out.println("Este número no es válido, tiene más de 5 cifras.\nEscribe otro.");
        }while(true);
        do{
            num=num/10;
            cifras++;
        }while(num!=0);
        System.out.println("El número tiene " + cifras + " cifras");
    }
    static void bloque3ej1(){
        int num1, num2, mayor, menor;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe dos números para ordenarlos");
        num1=scan.nextInt();
        num2=scan.nextInt();
        if (num1==num2){
            System.out.println("Los números son iguales, da igual cómo los ordenes");
        } else {
            mayor = (num1 > num2) ? num1 : num2;
            menor = (num1 < num2) ? num1 : num2;
            System.out.println("Los numeros ordenados son: " + mayor + ", " + menor);
        }
    }
    static void bloque3ej2(){

    }
    static void bloque3ej3(){

    }
    static void bloque3ej4(){

    }
    static void bloque3ej5(){

    }
    static void bloque3ej6(){

    }
    static void bloque4ej1(){

    }
    static void bloque4ej2(){

    }
    static void bloque4ej3(){

    }
    static void bloque4ej4(){

    }
    static void bloque4ej5(){

    }
    static void bloque4ej6(){

    }
    static void bloque4ej7(){

    }
}