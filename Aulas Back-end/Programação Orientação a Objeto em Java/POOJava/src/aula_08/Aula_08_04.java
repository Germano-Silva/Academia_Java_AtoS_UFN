package aula_08;

public class Aula_08_04 {
    public static void main(String[] args) throws Exception {

        // soma de dois vetores
        int[] vetor1 = {13,25,43,78,33};
        int[] vetor2 = {54,82,26,51,26};
        int[] vetorSoma = new int[5];
        for(int i = 0; i < vetor1.length; i++){
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }
        for(int valor:vetorSoma){
            System.out.format("%d,",valor);
        }
        System.out.println();

    }
}
