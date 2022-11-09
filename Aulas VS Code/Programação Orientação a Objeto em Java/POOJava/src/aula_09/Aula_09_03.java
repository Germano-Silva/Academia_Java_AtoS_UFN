package aula_09;

import java.io.IOException;
import java.util.Scanner;

public class Aula_09_03 {
    public static void clearScreen() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
    }

    public static void main(String[]args)throws Exception{
        clearScreen();
        Scanner scan=new Scanner(System.in);
        System.out.print("Digite o valor limite:");
        int valorLimite=scan.nextInt();
        int gtdePrimos = 0;
        int valorAtual = 2;
        while(valorAtual<valorLimite){
            boolean ehPrimo=true;
            for(int i = 2; i < valorAtual;i++){
                if(valorAtual % i == 0){
                    ehPrimo=false;
                    break;
                }
            }
            if(ehPrimo){
                gtdePrimos ++;
            }
            valorAtual ++;
        }
        System.out.format("Aquantidade de números primos até %d é de %d.%n",
                valorLimite, gtdePrimos );
        scan.close();
    }
}
