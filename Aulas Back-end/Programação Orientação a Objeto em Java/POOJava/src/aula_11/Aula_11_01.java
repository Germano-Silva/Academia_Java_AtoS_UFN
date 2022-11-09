package aula_11;

import java.io.IOException;

public class Aula_11_01 {
    public static void clearScreen() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
    }

    public static void main(String[] args) throws Exception {
        clearScreen();
        int[]vetorOriginal = {13,25,43,78,33};
        int[]vetorInvertido = obterVetorInvertido(vetorOriginal);
        mostrarVetor(vetorInvertido);
    }
    public static int[] obterVetorInvertido (int[]vetor){
        int[] vetorInvertido = new int [vetor.length];
        int iVetorInvertido = 0;
        for(int i = vetor.length-1; i>=0; i--){
            vetorInvertido[iVetorInvertido] = vetor [i];
            iVetorInvertido ++;
        }
        return vetorInvertido;
    }

    public static void mostrarVetor(int[]vetor){
        for(int valor:vetor){
            System.out.print(valor + ",");
        }
    }
}
