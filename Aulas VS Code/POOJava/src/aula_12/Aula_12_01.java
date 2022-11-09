package aula_12;

import java.io.IOException;

public class Aula_12_01 {
    public static void clearScreen()throws IOException, InterruptedException{
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
    }
    public static void main(String[] args) throws Exception {
        clearScreen();
        criarStrings(999999999);
        // compararStrings();
        // compararStrings2();
        // modificarStrings();
        // construirStrings(99999999);
        // formatarStrings();
    }

    public static void criarStrings(int qtde){
        long inicio = System.currentTimeMillis();
        for(int i =0; i < qtde; i++)
        {
            String s1 = "Programação OrientadaaObjetos";
            String s2 = "Utilizando Java no VS Code";
        }
        long fim = System.currentTimeMillis();
        long tempoDecorrido = fim - inicio;
        System.out.println("Tempo para criar " + qtde + " strings literais = " + tempoDecorrido +" ms.");
        inicio = System.currentTimeMillis();
        for(int i = 0; i < qtde; i++){
            String s1 = new String("Programação OrientadaaObjetos");
            String s2 = new String("Utilizando Java no VS Code");
        }
        fim=System.currentTimeMillis();
        tempoDecorrido = fim - inicio;
        System.out.println("Tempo para criar " + qtde + " objetos string = " + tempoDecorrido + "ms.");
    }
}
