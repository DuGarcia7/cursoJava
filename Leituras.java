import java.util.Scanner;

    public class Leituras{
        public static void main (String args[]){
            Scanner teclado;            // declaro um componente tipo Scanner e chamo de teclado
            teclado = new Scanner(System.in);   // este componenten irá ler dados do dispositivo de entrada para

            int a;
            float b;
            double c;

            System.out.println ("Por favor, digite um numero inteiro");
            a = teclado.nextInt();
            System.out.println("Voce digitou " + a);

            System.out.println ("Por favor, digite um numero float");
            b = teclado.nextFloat();
            System.out.println("Voce digitou " + b);

            System.out.println ("Por favor, digite um numero double");
            c = teclado.nextDouble();
            System.out.println("Voce digitou " + c);

            System.out.printf ("%.1f%n", c);
            System.out.printf ("%.2f%n", c);
            System.out.printf ("%.3f%n", c);
        }

    }
