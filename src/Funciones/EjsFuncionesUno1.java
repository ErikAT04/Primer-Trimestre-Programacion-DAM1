package Funciones;

public class EjsFuncionesUno1 {
    public static void main(String[] args) {
        boolean primo;
        for(int i=1; i<=100; i++){
            primo=esPrimo(i);
            if(primo){
                System.out.println(i);
            }
        }
    }
    static boolean esPrimo(int num) {
        boolean primo=(num != 1);
        for(int i = 2; i<num; i++){
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }
}
