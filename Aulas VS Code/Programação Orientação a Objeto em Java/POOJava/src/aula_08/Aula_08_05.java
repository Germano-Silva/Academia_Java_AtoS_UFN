package aula_08;

import java.util.Scanner;

public class Aula_08_05 {
    public static void main(String[] args) throws Exception {
        // exibição de menu console
        int op;
        Scanner scan = new Scanner(System.in);

        do{
            clearScreen();
            System.out.println("1-Jogar");
            System.out.println("2-Sair");
            System.out.print("Opção desejada:");
            op = scan.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.println("Jogando ...");
                    Thread.sleep(2000);
                    System.out.println("Acabou o jogo!");
                }
                case 2 -> System.out.println("Saindo ...");
                default -> {
                    System.out.println(" Opção inválida! ");
                    Thread.sleep(2000);
                }
            }
        }while(op!=2);
        scan.close();
        System.out.println("Saiu!");
    }

    private static void clearScreen() {
    }
}
