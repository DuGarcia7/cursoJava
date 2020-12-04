import java.util.Scanner;

    public class URI1021{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);
            int n100,n50,n20,n10,n5,n2,m1,m50,m25,m10,m5,m01;
            double resto,valor;

            valor = teclado.nextDouble();

            System.out.println("NOTAS:");
            n100 = (int) valor / 100;
            System.out.println(n100 + " nota(s) de R$ 100.00");
            n50 = (int) (valor % 100) / 50;
            System.out.println(n50 + " nota(s) de R$ 50.00");
            n20 = (int) (valor % 100 % 50)/20;
            System.out.println(n20 + " nota(s) de R$ 20.00");
            n10 = (int) (valor % 100 % 50 % 20)/10;
            System.out.println(n10 + " nota(s) de R$ 10.00");
            n5 = (int) (valor % 100 % 50 % 20 % 10)/5;
            System.out.println(n5 + " nota(s) de R$ 5.00");
            n2 = (int) (valor % 100 % 50 % 20 % 10 % 5)/2;
            System.out.println(n2 + " nota(s) de R$ 2.00");
            resto = (valor % 100 % 50 % 20 % 10 % 5 % 2) * 100;
            System.out.println("MOEDAS:");
            m1 = (int) resto / 100;
            System.out.println(m1 + " moeda(s) de R$ 1.00");
            m50 = (int) (resto % 100) / 50;
            System.out.println(m50 + " moeda(s) de R$ 0.50");
            m25 = (int) (resto % 100 % 50) / 25;
            System.out.println(m25 + " moeda(s) de R$ 0.25");
            m10 = (int) (resto % 100 % 50 % 25) / 10;
            System.out.println(m10 + " moeda(s) de R$ 0.10");
            m5 = (int) (resto % 100 % 50 % 25 % 10) / 5;
            System.out.println(m5 + " moeda(s) de R$ 0.05");
            m01 = (int) (resto % 100 % 50 % 25 % 10 % 5) / 1;
            System.out.println(m01 + " moeda(s) de R$ 0.01");
        }
    }