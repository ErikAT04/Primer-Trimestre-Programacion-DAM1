package Estructuras_De_Control;

public class EjsEstrucControlUno4 {
    public static void main(String[] args) {
        System.out.println("Escribiendo los múltiplos de 3 de los primeros 40 números:");
        for(int i=1; i<=40; i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
}