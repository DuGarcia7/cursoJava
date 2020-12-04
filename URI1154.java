import java.util.Scanner;
public class URI1154{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int idade,cont;
        double soma,media;

        soma = 0;
        cont = 0;

        do{            
            idade = teclado.nextInt();
            if (idade >= 0){
            soma = soma + idade;
            cont++;
            }                        
        } while (idade >= 0);

        media = soma / cont;
        System.out.printf("%.2f%n", media);
    }
}