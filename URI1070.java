import java.util.Scanner;
public class URI1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int X;

        X = teclado.nextInt();

        for ( int cont = 1 ; cont <= 6 ; cont++){
            if (X % 2 != 0){
                System.out.println(X);
                X += 2;
            }
            else{
                X++;
                cont--;
            }
        }
    }
}