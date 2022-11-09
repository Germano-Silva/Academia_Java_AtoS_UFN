package aula_10;

import java.io.IOException;

public class Aula_10_01 {
    public static void main(String[] args) throws Exception {
        clearScreen();
        double res = obterMediaVetor();
        System.out.println(res);
    }

    public static void clearScreen() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();}

    public static double obterMediaVetor(){
        int [] vetor1 = {13, 25, 43, 78, 33};
        int somaVetor1 = 0;
        for(int i=0; i< vetor1.length; i++){
            somaVetor1 += vetor1[i];
        }
        double resultado = (float)somaVetor1/vetor1.length;
        return resultado;
    }
}
