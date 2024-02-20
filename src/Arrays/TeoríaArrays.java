package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TeoríaArrays {
    public static void main(String[] args) {
        /*
        Son variables que representan a un contenedor de datos del mismo tipo, tiene un tamaño fijo y puede almacenar todo tipo de datos
        Si su tamaño es 4, recorrerá de 0 a 3 por ejemplo, es decir, empieza en 3
        Los arrays son objetos, por lo que hay que declararlos e inicializar sus elementos
        Declaración en java: tipo []nombre; oo en su defecto tipo nombre[];
        Ejemplo: nombre = new tipo[longitud];
         */
        int []MyArray;
        MyArray = new int[3];
        /*
        Formas de hacer arrays alternativas:
         */
        int []MyArray2 = new int[3];
        int []MyArray3 = {2,3,4};
        /*
        Asignación y acceso:
        Tenemos que llamar al array para introducir un valor.
         */
        MyArray[0]=2;
        /*
        También puedes usar el Scanner
         */
        Scanner scan = new Scanner(System.in);
        MyArray[0]=scan.nextInt();
        scan.close();
        /*
        Acceso: Se hace con su nombre y su índice
         */
        System.out.println("El valor 0 del array es " + MyArray[0]);
        /*
        El comportamiento de los arrays no es igual que el de otras variables. Si igualas dos arrays y cambias el valor de un array, se cambia en el otro.
         */
                //Caso de variables
                int a=7;
                int b=a;
                b=9;
                System.out.println(a);

                //Caso de arrays
                MyArray2=MyArray3;
                MyArray2[1]=2;
                System.out.println(MyArray3[1]);

        /*
        En el caso de variables, te imprimiría un 7
        En el caso de arrays, te imprimiría un 2 independientemente de cuánto valiera el antiguo valor del array2
         */

        /*
        Paso de Argumentos:
            - Paso de valor
            Cuando los parámetros que se pasan son primitivos se hace una copia de la variable
         */

        //Ejemplo de paso de valor:
            int aa=7;
            System.out.println("Variable original antes: " + aa);
            modificar(aa);
            System.out.println("Variable original después: " + aa);
            //Aquí no cambia el valor.
            int []MyArray4 = new int[4];
            System.out.println("Array en 0 original: " + MyArray4[0]);
            modificarArray(MyArray4);
            System.out.println("Array en 0 modificada: " + MyArray4[0]);
            //Aquí sí que cambia el array. Modifica la memoria directamente
        /*
        Referencia null:
        Al crear un array, se asigna una dirección de memoria. Si se necesita un array que no esté ligada a ninguna ubicación de memoria, existe "null".
        Para operar con arrays tenemos que utilizar el paquete java.util.Arrays;
        */

        //Obtener tamaño de array:
        int[] números = {1,2,3,4,5,6};
        int tamaño=números.length;
        //Aplicación de length:
        Scanner reader = new Scanner(System.in);
        int num=scan.nextInt();
        int []ArrayPrueba = new int[num];
        for(int i=0; i<ArrayPrueba.length;i++){
            ArrayPrueba[i]= scan.nextInt();
        }
        scan.close();

        /*
        Iniciación rápida de array:
        En vez de hacer un bucle for, se puede hacer un Arrays.fill para rellenar todos los huecos (o los que queramos) con un mismo número.
         */
        int []MyArray5= new int[5];
        Arrays.fill(MyArray5, 5);

        //Foreach, para recorrer todos los valores de un array
        for(int aux : MyArray5){
            System.out.println(aux);
        }

        /*
        Para mostrar todo el contenido del array, no se puede utilizar simplemente System.out.println(Array)
        Hay que usar la librería Arrays para convertir en una cadena de caracteres
         */
        System.out.println(Arrays.toString(MyArray));

        //También se puede con for s, pero queda más feo
        for(int i=0; i<MyArray.length; i++) {
            System.out.print(i);
            if (i != (MyArray.length - 1)) {
                System.out.println(", ");
            } else {
                System.out.println();
            }
        }

        /*
        Comparación de arrays:
        Hace falta la librería de Arrays, concretamente la función Array.equals(array1,array2). Es booleano, es decir, true o false.
         */
        int []arrayy = {1,2,3,4};
        int []arrayy2 = new int[4];
        int []arrayy3 = {1,2,3,5};

        System.arraycopy(arrayy, 0, arrayy2, 0, 4);//Copia el array entero

        System.out.println("¿Arrays 1 y 2 son iguales?" + Arrays.equals(arrayy,arrayy2)); //Al apuntar a la misma dirección de memoria, son iguales, true.
        System.out.println("¿Arrays 1 y 3 son iguales?" + Arrays.equals(arrayy,arrayy3)); //Al tener un valor diferente, es falso

        /*
        Ordenar arrays: Arrays.sort
         */
        int []arrayaordenar= {1,4,7,12,-3,6};
        System.out.println(Arrays.toString(arrayaordenar));
        Arrays.sort(arrayaordenar);
        System.out.println(Arrays.toString(arrayaordenar));

        /*
        Copiar arrays:
            Copiar entera:
            Copiar array con distinta longitud: copyOf
            Copiar array desde x punto: copyOfRange
         */
        int[] numeros = {1,2,5,3,5};
        int[] numeros2;
        int[] numeros3;
        int[] numeros4;

        numeros2=numeros; //Redirige a la misma dirección de memoria
        numeros3=numeros.clone(); //Clona el array

        numeros3[0]=2; //Al hacer esto, solo cambia el valor en el array;
        numeros4=Arrays.copyOf(numeros3, numeros3.length);

        /*
        Añadir espacios en el array:
            Si es al final: Hacer una copia y meter 1 espacio más
            Si es desde un punto cualquiera
         */

        int []numeros5 = {1, 2, 3, 4, 5};
        numeros5 = Arrays.copyOf(numeros5, numeros5.length+1);
        numeros5[(numeros5.length-1)]=10;

        int[] numeros6 = new int[0];
        System.arraycopy(numeros5, 0, numeros6, 0, numeros5.length+1);
        numeros6[4]=12;
        System.arraycopy(numeros5, 4, numeros6, 5, numeros6.length);

        /*
        Eliminar espacios en el array:
         */
        int[] numeros8 = {1,2,3,4,5,6,7};
        System.arraycopy(numeros8, 3, numeros8, 4, numeros8.length-1);


    }
    public static void modificar(int var){
        var = 8;
    }
    public static void modificarArray(int[]array){
        array[0]=10;
    }
}
