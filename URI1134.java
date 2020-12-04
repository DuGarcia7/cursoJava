import java.util.Scanner;
public class URI1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor,qAlcool,qGasolina,qDiesel;

        qAlcool = 0;
        qGasolina = 0;
        qDiesel = 0;

        do{
            valor = teclado.nextInt();
                        
            if (valor == 1){
                qAlcool++;
            }
            else if (valor == 2){
                qGasolina++;
            }
            else if (valor == 3){
                qDiesel++;
            }
        }while (valor !=4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+qAlcool);
        System.out.println("Gasolina: "+qGasolina);
        System.out.println("Diesel: "+qDiesel);
    }
}