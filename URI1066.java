import java.util.Scanner;
public class URI1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor,qPar,qImpar,qPos,qNeg;

        qPar = 0;
        qImpar = 0;
        qPos = 0;
        qNeg = 0;

        for (int cont=1 ; cont <= 5 ; cont++){
            valor = teclado.nextInt();
            if(valor % 2 == 0){
                qPar++;
            }
            else{
                qImpar++;
            }
            if (valor > 0){
                qPos++;
            }
            else if (valor < 0){
                qNeg++;
            }
            else{
                qNeg = qNeg;
            }
        }
        System.out.println(qPar + " valor(es) par(es)");
        System.out.println(qImpar + " valor(es) impar(es)");
        System.out.println(qPos + " valor(es) positivo(s)");
        System.out.println(qNeg + " valor(es) negativo(s)");
    }
}