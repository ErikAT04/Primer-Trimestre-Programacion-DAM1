package Estructuras_De_Control;

import java.util.Scanner;
public class EjsIfElse5 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int bocjam=-1, bocque=-1, patt=-1, ref=-1, cvz=-1;
        double total;
       while(bocjam<0||bocque<0||patt<0||ref<0||cvz<0){
           System.out.print("Elija cuántos bocadillos de jamón quiere");
           bocjam=scan.nextInt();
           System.out.print("Elija cuántos bocadillos de queso quiere");
           bocque=scan.nextInt();
           System.out.print("Indique cuántas raciones de patatas le gustaría pedir");
           patt=scan.nextInt();
           System.out.print("Indique cuántos refrescos van a tomar");
           ref=scan.nextInt();
           System.out.print("Si alguno quiere cerveza, indique cuántas van a ser");
           cvz=scan.nextInt();
           if(bocjam<0||bocque<0||patt<0||ref<0||cvz<0){
               System.out.print("Alguno de los valores introducidos son inválidos, repita de nuevo su pedido.");
           }
       }
        scan.close();
        if(bocjam==0){
            System.out.print("No se ha elegido ningún bocadillo de jamón\n");
        } else{
            System.out.print("Se quieren " + bocjam + "bocadillo de jamón, a 3 euros cada uno\n");
        }
        if(bocque==0){
            System.out.print("No se quiere ningún bocadillo de queso\n");
        } else{
            System.out.print("Se quieren " + bocque + " bocadillos de queso, a 2 euros cada uno\n");
        }
        if(patt==0){
            System.out.print("No se quiere ninguna ración de patatas\n");
        } else{
            System.out.print("Se quieren " + patt + " raciones de patatas, a 1 euro por ración\n");
        }
        if(ref==0){
            System.out.print("No se quieren refrescos\n");
        } else{
            System.out.print("Se quieren " + ref + " refrescos, a 1'75 euros cada bebida\n");
        }
        if(cvz!=0){
            System.out.print("Se ha pedido un total de " + cvz + " cervezas, con un precio de 1'25 la unidad\n");
        }
        total=(3*bocjam)+(2*bocque)+patt+(1.75*ref)+(1.25*cvz);
        System.out.print("El precio total a pagar sería: " + total);
    }
}