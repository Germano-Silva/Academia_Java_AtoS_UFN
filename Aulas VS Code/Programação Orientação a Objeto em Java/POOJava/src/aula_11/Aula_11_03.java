package aula_11;

import java.io.IOException;
import java.util.Scanner;

public class Aula_11_03 {
    public static void main(String[] args) throws Exception {
        clearScreen();
        processarMenu();

    }

    public static void clearScreen() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
    }

    /**  public static void mostrarMenu()throws InterruptedException, IOException{
     int op;
     Scanner scan = new Scanner(System.in);
     do {
     clearScreen();
     System.out.println("1 - Jogar");
     System.out.println("2 - Sair");
     System.out.println("Opção desejada:");
     op = scan.nextInt();
     switch (op) {
     case 1:
     System.out.println("Jogando ...");
     Thread.sleep(2000);
     System.out.println("Acabouojogo!");
     Thread.sleep(1000);
     break;
     case 2:
     System.out.println("Saindo ...");
     Thread.sleep(2000);
     break;
     default:
     System.out.println("Opção inválida!");
     Thread.sleep(2000);
     break;
     }
     }while(op != 2);
     scan.close();
     System.out.println("Saiu!...");
     }
     */
    public static int obterOpcaoDoMenu(Scanner scan){
        System.out.println("1 - Jogar");
        System.out.println("2 - Sair");
        System.out.println("Opção desejada:");
        return scan.nextInt();
    }

    public static void executarOpcaoDoMenu(int opcao)throws InterruptedException{
        switch (opcao) {
            case 1 -> {
                System.out.println("Iniciando jogo ...");
                executarJogo();
                System.out.println("Acabouojogo!");
                Thread.sleep(1000);
            }
            case 2 -> {
                System.out.println("Saindo ...");
                Thread.sleep(1000);
            }
            default -> {
                System.out.println("Opção inválida!");
                Thread.sleep(2000);
            }
        }
    }

    public static void executarJogo() throws InterruptedException{
        for(int i = 1; i <= 5; i++){
            Thread.sleep(1000);
            System.out.format("Passou da fase %d...%n",i);
        }
        System.out.println("Você venceu!");
        Thread.sleep(1000);
    }

    public static void processarMenu() throws InterruptedException,IOException{
        int opcao;
        Scanner scan = new Scanner(System.in);
        do{
            clearScreen();
            opcao = obterOpcaoDoMenu(scan);
            executarOpcaoDoMenu(opcao);
        } while (opcao != 2);
        scan.close();
        System.out.println("Programa finalizado.");
    }
}
