import java.util.Scanner;

public class URI1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double salario,novo,reajuste;

        salario = teclado.nextDouble();

        if (salario >= 0 && salario <= 400.00){
            reajuste = salario * 0.15;
            novo = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", novo);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.printf("Em percentual: 15 %%%n");
        }
        else if (salario > 400.00 && salario <= 800.00){
            reajuste = salario * 0.12;
            novo = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", novo);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.printf("Em percentual: 12 %%%n");
        }
        else if (salario > 800.00 && salario <= 1200.00){
            reajuste = salario * 0.10;
            novo = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", novo);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.printf("Em percentual: 10 %%%n");
        }
        else if (salario > 1200.00 && salario <= 2000.00){
            reajuste = salario * 0.07;
            novo = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", novo);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.printf("Em percentual: 7 %%%n");
        }
        else if (salario > 2000.00){
            reajuste = salario * 0.04;
            novo = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", novo);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.printf("Em percentual: 4 %%%n");
        }
    }

}