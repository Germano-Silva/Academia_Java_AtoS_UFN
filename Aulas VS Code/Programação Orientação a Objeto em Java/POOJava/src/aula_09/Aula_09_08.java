package aula_09;

import java.io.IOException;
import java.util.Scanner;

public class Aula_09_08 {
    public static void clearScreen() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();}
    public static void main(String[] args) throws Exception {

        clearScreen();
        Scanner scan = new Scanner(System.in);
        System.out.print("X do ponto: ");
        double x = scan.nextDouble();
        System.out.print("Y do ponto: ");
        double y = scan.nextDouble();

        double angRad =  Math.atan2(y, x);
        double angDeg = angRad*180/Math.PI;


        System.out.format("O angulo é de %f graus.%n", angDeg);


        scan.close();
    }
}
