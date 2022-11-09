package aula_09;

import java.io.IOException;
import java.util.Scanner;

public class Aula_09_02 {
    public static void clearScreen() throws IOException, InterruptedException{
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
    }


    public static void main(String[] args) throws Exception{
        clearScreen();
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro valor:");
        double valor1=scan.nextDouble();
        System.out.print("Digite o segundo valor:");
        double valor2 = scan.nextDouble();
        double soma=valor1+valor2;
        double subtracao=valor1-valor2;
        double multiplicacao=valor1*valor2;
        double divisao=valor1/valor2;
        System.out.format("Soma: %f%nSubtração: %f%nMultiplicação: %f%nDivisão: %f%n",
                soma,subtracao,multiplicacao,divisao);
        scan.close();
    }
}
