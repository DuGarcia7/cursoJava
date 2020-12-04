import java.util.Scanner;
public class URI1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int N,elevado;

        N = teclado.nextInt();

        for (int cont = 2 ; cont <= N ; cont+=2){
            elevado = cont * cont;
            System.out.println(cont+"^2 = "+elevado);
            
        }
    }
}