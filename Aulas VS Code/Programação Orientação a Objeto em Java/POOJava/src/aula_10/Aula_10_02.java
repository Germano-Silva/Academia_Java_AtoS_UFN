package aula_10;

import java.io.IOException;

public class Aula_10_02 {
    public static void main(String[] args) throws Exception {
        clearScreen();
        int[] valor1 = {13, 25, 43, 78, 33};
        double res = obterMediaVetor1(valor1);
        System.out.println(res);

        int[] valor2 = {53, 82, 26, 51, 26};
        double res2 = obterMediaVetor1(valor2);
        System.out.println(res2);

    }

    public static void clearScreen() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();}

    public static double obterMediaVetor1( int[] vetor ){
        int somaVetor = 0;
        for (int j : vetor) {
            somaVetor += j;
        }
        return (float)somaVetor/vetor.length;
    }
}
