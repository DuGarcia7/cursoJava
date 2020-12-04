import java.util.Scanner;

    public class URI1018{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);
            int A,N,M,O,P,Q,R,S;

            A = teclado.nextInt();
            
            System.out.println(A);

            N = A / 100;
            System.out.println(N + " nota(s) de R$ 100,00");
            M = (A % 100) / 50;
            System.out.println(M + " nota(s) de R$ 50,00");
            O = (A % 100 % 50)/20;
            System.out.println(O + " nota(s) de R$ 20,00");
            P = (A % 100 % 50 % 20)/10;
            System.out.println(P + " nota(s) de R$ 10,00");
            Q = (A % 100 % 50 % 20 % 10)/5;
            System.out.println(Q + " nota(s) de R$ 5,00");
            R = (A % 100 % 50 % 20 % 10 % 5)/2;
            System.out.println(R + " nota(s) de R$ 2,00");
            S = (A % 100 % 50 % 20 % 10 % 5 % 2)/1;
            System.out.println(S + " nota(s) de R$ 1,00");

        }
    }