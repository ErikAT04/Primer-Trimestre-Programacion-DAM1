package Estructuras_De_Control;

public class EjsEstrucControlCuatro6 {
    public static void main(String[] args) {
        int hora=0,min=0,seg=0;
        while(true){
            System.out.printf("%02d:%02d:%02d\n", hora,min,seg);
            seg++;
            if(seg==60){
                seg=0;
                min++;
            }
            if(min==60){
                min=0;
                hora++;
            }
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
