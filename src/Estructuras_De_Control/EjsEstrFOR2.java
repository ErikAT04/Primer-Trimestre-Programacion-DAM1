package Estructuras_De_Control;

public class EjsEstrFOR2 {
    public static void main(String[] args) {
        int i, suma=0;
        System.out.println("Iniciando suma de los 10 primeros impares:");
        for(i=1; i<=19; i+=2){//Los 10 primeros impares son los que se hallan entre el 1 y el 19
            suma=suma+i;
        }
        System.out.println("El resultado de la suma es " + suma);
    }
}
