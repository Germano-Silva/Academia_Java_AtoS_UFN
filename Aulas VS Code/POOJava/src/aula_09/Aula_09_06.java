package aula_09;

import java.io.IOException;
import java.util.Scanner;

public class Aula_09_06 {
    public static void clearScreen() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();}
    public static void main(String[] args) throws Exception {

        clearScreen();
        Scanner scan = new Scanner(System.in);
        final int qtdeAlunos = 10;
        double[] notasA = new double[qtdeAlunos];
        double[] notasB = new double[qtdeAlunos];
        double[] medias = new double[qtdeAlunos];
        for (int i = 0; i < qtdeAlunos; i++) {
            System.out.format("Digite a nota A do aluno %d: ", i+1);
            double valor= scan.nextDouble();
            notasA[i] = valor;
        }
        for (int i = 0; i < qtdeAlunos; i++) {
            System.out.format("Digite a nota B do aluno %d: ", i+1);
            double valor = scan.nextDouble();
            notasB[i] = valor;
        }
        System.out.println();
        for (int i = 0; i < medias.length; i++) {
            medias[i] = (notasA[i]+notasB[i])/2;

        }
        for (int i = 0; i < medias.length; i++) {
            System.out.format("A media do aluno %d foi: %f.%n", i+1, medias[i]);


        }
        scan.close();
    }
}
