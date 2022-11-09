package aula_11;

import java.io.IOException;

public class Aula_11_02 {
    public static void main(String[] args) throws Exception {
        clearScreen();
        int[] vetorA = {2,1,4,1,6};
        int[] vetorB = {1,3,1,5,1};
        int[] vetorSoma = obterSomaVetores (vetorA, vetorB);
        mostrarVetor(vetorSoma);
    }

    public static void clearScreen() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
    }

    public static void mostrarVetor(int[]vetor){
        for(int valor:vetor){
            System.out.print(valor + ",");
        }
    }

    public static int[] obterSomaVetores (int[] vetor1, int[] vetor2){
        int[] vetorSoma = new int[vetor1.length];
        for(int i = 0; i < vetorSoma.length; i++){
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }
        return vetorSoma;
    }
}
