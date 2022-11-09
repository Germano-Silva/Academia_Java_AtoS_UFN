package aula_09;

import java.io.IOException;

public class Aula_09_04 {
    public static void clearScreen() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
    }

    public static void main(String[] args) throws Exception {

        int x=0;
        int y=1;
        int z=2;
        int[]vA={1,3,1};
        int[]vB={2,2,3};
        int[] produto = new int[3];
        produto[x] =vA[y]*vB[z] - vA[z]*vB[y];
        produto[y] =vA[z]*vB[x] - vA[x]*vB[z];
        produto[z] =vA[x]*vB[z] - vA[z]*vB[x];
        System.out.format("Produto vetorial:(%d, %d,%d)",produto[x], produto[y], produto[z]);
    }
}
