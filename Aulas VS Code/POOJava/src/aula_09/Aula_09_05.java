package aula_09;

import java.io.IOException;
import java.util.Scanner;

public class Aula_09_05 {
    public static void clearScreen() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();}
    public static void main(String[] args) throws Exception {

        clearScreen();
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[5];
        for(int i=0; i < vetor.length; i++){
            System.out.format("Digiteovalor do elemento %d do vetor: ", i);
            int valor = scan.nextInt();
            vetor[i] = valor;
        }
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;
        for(int elemento : vetor){
            soma += elemento;
            if(elemento > maior) maior = elemento;
            if(elemento < menor) menor = elemento;
        }
        double media = soma / vetor.length;
        System.out.format(" Maior: %d%n Menor: %d%n Média: %f%n", maior, menor, media);
        System.out.print(" Valores pares: ");
        for(int elemento : vetor){
            if(elemento % 2 == 0) System.out.format("%d, ",   elemento);
        }
        System.out.println();
        System.out.print(" Valores impares: ");
        for(int elemento : vetor){
            if(elemento % 2 != 0)System.out.format("%d, ", elemento);
        }
        System.out.println();
        scan.close();
    }
}
