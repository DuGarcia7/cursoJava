import java.util.Scanner;

    public class URI1017{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);
            int A,B;
            double C,D;

            A = teclado.nextInt();
            B = teclado.nextInt();

            C = A * B;
            D = (double) C / 12;
            System.out.printf("%.3f%n", D);
        }
    }