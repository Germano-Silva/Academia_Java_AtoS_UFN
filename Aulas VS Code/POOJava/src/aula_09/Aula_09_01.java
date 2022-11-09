package aula_09;

import java.io.IOException;
import java.util.Scanner;

public class Aula_09_01 {
    public static void clearScreen() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
    }
    public static void main(String[] args) throws Exception{
        clearScreen();
        Scanner scan = new Scanner(System.in);
        System.out.print("Digiteovalor do primeiro lado:");
        double lado1=scan.nextDouble();
        System.out.print("Digiteovalor do segundo lado:");
        double lado2=scan.nextDouble();
        double area=lado1*lado2;
        System.out.format("A área do retângulo de lados %f e %f é %f%n", lado1,lado2,area);
        scan.close();


    }
}
