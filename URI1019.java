import java.util.Scanner;

    public class URI1019{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);
            int N,O,P,Q;

            N = teclado.nextInt();
            Q = N % 60;            
            P = (N % 3600)/60;
            O = N / 3600;
            System.out.println(O + ":" + P + ":" + Q);
        }
    }