import java.util.Scanner;

    public class URI1014{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);
            int X;
            float Y;
            double CONSUMO;

            X = teclado.nextInt();
            Y = teclado.nextFloat();

            CONSUMO = X / (float) Y;
            System.out.printf("%.3f km/l%n", CONSUMO);


        }
    }