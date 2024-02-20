package Estructuras_De_Control;

public class EjEjemploFor3 {
    public static void main(String[] args) {
        int suma=0;
        System.out.println("Iniciando suma de los 10 primeros números positivos:");
        for(int i=1; i<=10; i++){
            System.out.print(suma + " + " + i + " es ");
            suma=suma+i;
            System.out.println(suma);
        }
        System.out.println("El resultado final es " + suma);
    }
}
