import java.util.Scanner;

public class URI1037{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float N;

        N = teclado.nextFloat();

        if (N >= 0 && N <= 25.000){
            System.out.println("Intervalo [0,25]");
        }
        else if (N > 25.000 && N <= 50.000){
            System.out.println("Intervalo (25,50]");
        }
        else if (N > 50.000 && N <= 75.000){
            System.out.println("Intervalo (50,75]");
        }
        else if (N > 75.000 && N <= 100.000){
            System.out.println("Intervalo (75,100]");
        }
        else{
            System.out.println("Fora de intervalo");
        }
    }

}