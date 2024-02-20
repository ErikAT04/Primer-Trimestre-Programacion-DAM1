package Estructuras_De_Control;

public class EjsFor5 {
    public static void main(String[] args) {
        int suma=0, cuenta=0;
        System.out.println("Iniciando suma y promedio de los 10 primeros números");
        for(int i=1; i<=10; i++){
            suma=suma+i;
            cuenta++;
        }
        double promedio = (double)suma/cuenta;
        System.out.println("La suma de los 10 primeros números es " + suma + ", y su promedio es " + promedio);
    }
}