package aula_13;

public class Aula_13_01 {
    public static void construirStrings(int qtde){
        long inicio = System.currentTimeMillis();
        String s1 = "Programação";
        String s2 = "Orientada";
        String s3 = "aObjetos";
        String s4 = "com Java";

        for(int i = 0; i<qtde; i++){
            String titulo = "";
            titulo += s1;
            titulo += s2;
            titulo += s3;
            titulo += s4;
        }

        long fim = System.currentTimeMillis();
        long tempoDecorrido = fim - inicio;
        System.out.println("Tempo para construir" + qtde + "strings concatenadas = " +tempoDecorrido+ "ms.");
        inicio = System.currentTimeMillis();

        for(int i = 0; i < qtde; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(s1);
            sb.append(s2);
            sb.append(s3);
            sb.append(s4);
        }
        fim = System.currentTimeMillis();
        tempoDecorrido = fim - inicio;
        System.out.println("Tempo para construir "+qtde+ " strings aprimoradas = "+tempoDecorrido+" ms.");
    }
}
