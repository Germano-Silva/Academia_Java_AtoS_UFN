package aula_11;

import java.io.IOException;

public class Aula_11_04 {
    public static void main(String[]args)throws Exception{
        clearScreen();
        int[] primos = computarVetorDePrimos(1000);
        mostrarVetor(primos);
    }

    public static void mostrarVetor(int[]vetor){
        for(int valor:vetor){
            System.out.print(valor + ",");
        }
    }

    public static void clearScreen()throws IOException,InterruptedException{
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
    }

    public static int[] computarVetorDePrimos(int tamanho){
        int[] primos = new int[tamanho];
        int qtdePrimos = 0;
        int valorAtual = 1;
        while(qtdePrimos < primos.length){
            boolean ehPrimo = true;
            for(int i = 2 ; i < valorAtual; i++){
                if(valorAtual % i == 0){
                    ehPrimo = false;
                    break;
                }
            }
            if(ehPrimo){
                qtdePrimos ++;
                primos[qtdePrimos - 1] = valorAtual;
            }
            valorAtual ++;
        }
        return primos;

    }
}
