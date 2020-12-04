import java.util.Scanner;
public class URI1143{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int x,quadrado,cubo;

        x = teclado.nextInt();

        for (int cont = 1 ; cont <= x ; cont++){
            quadrado = cont * cont;
            cubo = cont * cont * cont;

            System.out.print(cont+ " ");
            System.out.print(quadrado+ " ");
            System.out.println(cubo);
        }
    }
}