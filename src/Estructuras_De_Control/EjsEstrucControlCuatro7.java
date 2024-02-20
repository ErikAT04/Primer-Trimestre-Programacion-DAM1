package Estructuras_De_Control;

public class EjsEstrucControlCuatro7 {
    public static void main(String[] args) {
        int i;
        for(i=100;(i%3==0||i%2==0||i%5==0||i%7==0);i++);
        System.out.println(i);
    }
}
