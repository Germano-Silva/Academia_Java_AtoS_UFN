package aula_08;

public class Aula_08_01 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // cálculo da média do vetor1
        int[] vetor1 = {13, 25, 43, 78, 33};
        int somaVetor1 = 0;
        for (int j : vetor1) {
            somaVetor1 += j;
        }
        System.out.println("Amédia do vetor1 é " + (float) somaVetor1 / vetor1.length);
    }
}
