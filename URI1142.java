import java.util.Scanner;
public class URI1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int x;

        x = teclado.nextInt();

        for (int cont = 1; cont <= x * 4 ; cont++){
            if (cont % 4 != 0){
                System.out.print(cont+" ");
            }
            else{
                System.out.println("PUM");
            }
        }
    }
}