import java.util.Scanner;

    public class URI1012{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);
            double A,B,C,TRIANGULO,CIRCULO,TRAPEZIO,QUADRADO,RETANGULO;

            A = teclado.nextDouble();
            B = teclado.nextDouble();
            C = teclado.nextDouble();

            TRIANGULO = (A * C)/2;
            System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
            CIRCULO = (C * C) * 3.14159;
            System.out.printf("CIRCULO: %.3f%n", CIRCULO);
            TRAPEZIO = ((A+B)*C)/2;
            System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
            QUADRADO = B * B;
            System.out.printf("QUADRADO: %.3f%n", QUADRADO);
            RETANGULO = A * B;
            System.out.printf("RETANGULO: %.3f%n", RETANGULO);



        }
    }