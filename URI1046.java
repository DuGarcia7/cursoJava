import java.util.Scanner;

public class URI1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int inicio,fim,duracao;

        inicio = teclado.nextInt();
        fim = teclado.nextInt();

        if (inicio > fim){
            duracao = (24 - inicio) + fim;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
        else if (fim > inicio){
            duracao = fim - inicio;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");            
        }
        else if (fim == inicio){
            duracao = 24;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");            
        }
    }
}