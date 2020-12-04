import java.util.Scanner;
public class URI1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        float valor,somaPositivos,media;
        int qtdePositivos;
        
        somaPositivos = 0;        
        qtdePositivos = 0;

        for (int cont=1 ; cont <=6 ; cont++){
            valor = teclado.nextFloat();
            if (valor > 0){
                somaPositivos = somaPositivos + valor;
                qtdePositivos++;
            }
        }
        media = somaPositivos / qtdePositivos;
        System.out.println(qtdePositivos + " valores positivos");
        System.out.printf("%.1f%n", media);
    }
}