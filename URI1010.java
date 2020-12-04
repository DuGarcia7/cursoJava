import java.util.Scanner;

    public class URI1010{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);
            int p1,n1,p2,n2;
            double v1,v2,vt;

            p1 = teclado.nextInt(); n1 = teclado.nextInt(); v1 = teclado.nextDouble();
            p2 = teclado.nextInt(); n2 = teclado.nextInt(); v2 = teclado.nextDouble();

            vt = (n1*v1)+(n2*v2);
            System.out.printf("VALOR A PAGAR: R$ %.2f%n", vt);
        }
    }