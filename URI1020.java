import java.util.Scanner;

    public class URI1020{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);
            int A,B,C,D;

            A = teclado.nextInt();
            B = A / 365;
            System.out.println(B + " ano(s)");
            C = (A % 365) / 30;
            System.out.println(C + " mes(es)");
            D = (A % 365 % 30);
            System.out.println(D + " dia(s)");
           
            
        }
    }