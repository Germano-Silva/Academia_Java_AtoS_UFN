package aula_09;

import java.io.IOException;

public class Aula_09_09 {
    public static void clearScreen() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();}
    public static void main(String[] args) throws Exception {
        double x1A=10;
        double y1A=5;
        double x2A=12;
        double y2A=9;

        double x1B=10;
        double y1B=5;
        double x2B=12;
        double y2B=9;

        if((x2B<x1A && y2B<y1A) && (x1B>x2A && y1B>y2A)){
            System.out.println("Estão colidindo.");
        }else{
            System.out.println("Não estão colidindo.");
        }

    }
}
