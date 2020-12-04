import java.util.Scanner;
public class URI1144{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int x,quadrado,qsoma,cubo,csoma;

        x = teclado.nextInt();

        for (int cont = 1 ; cont <= x ; cont++){
            quadrado = cont * cont;
            cubo = cont * cont * cont;
            qsoma = quadrado + 1;
            csoma = cubo + 1;

            System.out.print(cont+ " ");
            System.out.print(quadrado+ " ");
            System.out.println(cubo);
            System.out.print(cont+ " ");
            System.out.print(qsoma+ " ");
            System.out.println(csoma);
        }
    }
}