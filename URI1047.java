import java.util.Scanner;

public class URI1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int hI, hF, mI, mF, dH, dM, tempoI, tempoF, dur;
        hI = teclado.nextInt();
        mI = teclado.nextInt();
        hF = teclado.nextInt();
        mF = teclado.nextInt();

        tempoI = hI * 60 + mI; // converti a hora/minuto inicial para minuto
        tempoF = hF * 60 + mF; // converti a hora/minuto final para minutos

        dur = tempoF - tempoI;

        if (dur <= 0){
            dur = dur + 24*60; // 1 dia em minutos
        }

        dH = dur / 60;
        dM = dur % 60;

        System.out.println("O JOGO DUROU "+dH+" HORA(S) E "+dM + " MINUTO(S)");
    }
}