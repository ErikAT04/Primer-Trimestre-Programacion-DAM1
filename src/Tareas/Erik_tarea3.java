package Tareas;

import java.util.Scanner;
public class Erik_tarea3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, factorial=1;//La variable "factorial" tiene que ser 1 porque si no se declararía como 0, y al multiplicar por 0 sería siempre 0
        do{
            System.out.println(" Elige el número POSITIVO del que quieres sacar su factorial");
            num = scan.nextInt();
        }while(num<=0);//Hay que valorar que los factoriales siempre son positivos, no existen factoriales de números negaivos
        scan.close();//Se cierra el escaner porque ya no se va a utilizar.
        for(int i=1; i<=num; i++){//Por el mismo motivo que "factorial" es 1, es necesario que i empiece en 1, ya que de lo contrario todo sería multiplicado por 0.
            factorial=factorial*i;//Aquí lo que va haciendo es que, del 1 al número que elijamos, vaya haciendo multiplicaciones para conseguir el factorial
        }
        //Ejemplo rápido: El número 5
        //Empieza en i=1: factorial=1*1=1
        //Luego pasa al 2: factorial=1*2=2
        //i=3: factorial=2*3=6
        //i=4: factorial=6*4=24
        //i=5: factorial=24*5=120
        //Al final lo que hemos hecho no deja de ser 1*2*3*4*5, es decir, el factorial de 5
        System.out.println("El factorial de " + num + " es " + factorial);
    }//Hay que tener en cuenta que los números enteros en DOUBLE se ponen en notación cientifica una vez rozan un número muy alto, por lo que puede haber casos como el de 100 que salga un numero muy alto elevado a otro.
}//También, mirando en una calculadora, el factorial de 0 es 1, por lo que está bien planteado sin necesidad de hacer nada más.