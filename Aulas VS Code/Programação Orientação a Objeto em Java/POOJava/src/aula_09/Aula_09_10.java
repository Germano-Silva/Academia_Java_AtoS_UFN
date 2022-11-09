package aula_09;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Aula_09_10 {
    public static void clearScreen() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();}
    public static void main(String[] args) throws Exception {

        clearScreen();
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();
        int valorSorteado = gerador.nextInt(11);
        int tentativas = 0;
        int valorDigitado = -1;
        do{
            System.out.print("Digite o seu palpite: ");
            valorDigitado = scan.nextInt();
            if(valorDigitado!=valorSorteado){
                System.out.println("Você errou ... tente novamente.");
                Thread.sleep(1000);
                clearScreen();
            }
            tentativas++;

        }while(valorDigitado!=valorSorteado);
        System.out.format("Você acertou em %d tentativas.%n", tentativas);
        scan.close();
    }
}
