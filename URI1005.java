import java.util.Scanner;

    public class URI1005{
        public static void main (String args[]){
            Scanner teclado = new Scanner(System.in);
            double A,B,MEDIA;

            A = teclado.nextDouble();
            B = teclado.nextDouble();

            MEDIA = (double) (A*3.50+B*7.50)/11;
            System.out.printf("MEDIA = %.5f%n", MEDIA);

           
        }
    }