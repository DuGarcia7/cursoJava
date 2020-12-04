import java.util.Scanner;

public class URI1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double a,b,c,area,perimetro;

        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        if (a + b > c && a + c > b && b + c > a){
            perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        }
        else{
            area = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f%n", area);
        }
    }
}