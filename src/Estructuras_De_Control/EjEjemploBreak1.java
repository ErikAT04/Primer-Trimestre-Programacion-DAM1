package Estructuras_De_Control;

public class EjEjemploBreak1 {
    public static void main(String[] args) {
        for(int i = 30; true; i++){
            System.out.println(i);
            if(i%7==0){
                break;
            }
        }
    }
}
