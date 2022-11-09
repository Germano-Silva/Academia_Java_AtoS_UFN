package aula_08;

public class Aula_08_03 {
    public static void main(String[] args) throws Exception {

        // vetor1 na ordem inversa
        int[] vetor1 = {13, 25, 43, 78, 33};
        System.out.println ("Vetor1 na ordem inversa: ");
        for(int i = vetor1.length - 1; i >= 0; i--){
            System.out.format("%d,", vetor1[i]);
        }
        System.out.println();

    }
}
