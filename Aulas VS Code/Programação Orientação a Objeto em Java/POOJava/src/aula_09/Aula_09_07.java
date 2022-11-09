package aula_09;

import java.io.IOException;
import java.util.Scanner;

public class Aula_09_07 {
    public static void clearScreen() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();}
    public static void main(String[] args) throws Exception {

        clearScreen();
        Scanner scan = new Scanner(System.in);
        System.out.print("X do ponto 1: ");
        double x1 = scan.nextDouble();
        System.out.print("Y do ponto 1: ");
        double y1 = scan.nextDouble();

        System.out.print("X do ponto 2: ");
        double x2 = scan.nextDouble();
        System.out.print("Y do ponto 2: ");
        double y2 = scan.nextDouble();

        double distancia = Math.sqrt(
                Math.pow(x2-x1, 2)+
                        Math.pow(y2-y1, 2)
        );
        System.out.println("A distancia ente os postos é:" + distancia);


        scan.close();
    }
}
