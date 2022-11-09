package aula_08;

public class Aula_08_06 {
    public static void main(String[] args) throws Exception {

        int[] primos = new int[1000];
        int qtdePrimos = 0;
        int valorAtual = 1;
        while (qtdePrimos<primos.length){
            boolean ehPrimo=true;
            for(int i = 2; i < valorAtual; i++){
                if(valorAtual % i == 0){
                    ehPrimo = false;
                    break;
                }
            }
            if(ehPrimo){
                qtdePrimos++;
                primos[qtdePrimos-1] = valorAtual;
                System.out.println("Número primo encontrado: " + valorAtual);
            }
            valorAtual++;
        }
//  public static void clearScreen() throws IOException, InterruptedException{
//      new ProcessBuilder("cmd","/c","cls").inheritI0().start().waitfor();
//   }

    }
}
