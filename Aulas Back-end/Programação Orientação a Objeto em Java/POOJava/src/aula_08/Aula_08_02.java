package aula_08;

public class Aula_08_02 {
    public static void main(String[] args) throws Exception {

        // cálculo da média do vetor2
        int[] vetor2 = {54,82,26,51,26};
        int somaVetor2 = 0;
        for(int valor:vetor2){
            somaVetor2 += valor;
        }
        System.out.println("Amédia do vetor2 é " + (float) somaVetor2 / vetor2.length);

    }
}
