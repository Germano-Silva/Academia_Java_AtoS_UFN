package aula_07;

public class Aula_07 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int v1 = 10;
        int v2 = 0;
        /**A expresão não vai ser compilada quando dividido por 0
         * int r  =  v1 / v2;
         * System.out.format("Resultado: %d%n", r);
         */
        int r  = v2 > 0 ? v1 / v2 : 0;
        System.out.format("Resultado: %d%n", r);

        /**================================================================================================
         *
         public class app{
         public static void main(String[] args) throws execption{
         int valor = 5;
         int fatorial = 1;
         While (valor = 1 ) {
         fatorial *= valor;
         valor--;
         }
         System.out.println(fatorial);
         }
         }
         //Realiza o teste de repetição no inicio
         ================================================================================================*/
        /**================================================================================================

         public class app{
         public static void main(String[] args) throws execption{
         int numero = 8;
         int limite = 10;
         int i = 1;
         System.out.println("tabuada de " + numero);
         do{
         System.out.format("%d x x%d = %d%n", numero, i , numero*i);
         i++;
         }while (i <= limite);
         }
         }
         faz o teste no final

         ================================================================================================*/

        /**================================================================================================

         public class app{
         public static void main(String[] args) throws execption{
         int numero = 8;
         int limite = 10;
         System.out.println("Tabuada de " + numero);

         for (int i = 1; i <= limite; i++){
         System.out.format("%d x %d = %d%n", numero, i, numero*i);
         }
         }
         }
         possue um contador

         ================================================================================================*/
        /**================================================================================================

         public class app{
         public static void main(String[] args) throws execption{

         int[] vetor1;// não foi definido tamanho nem inicializado somete que pertence a clace de inteiros
         int[] vetor2 = new int[3];//inicializado com vetor de inteiros de 3 posições
         int[] vetor3={10, 20, 30};// inicializado com valores e identificado que possue valor inteiro
         // as posições se dão pelo valor dentro []
         vetor1[0]=1;// erro vetor um não foi inicializado não podendo atribuir o valor 1
         vetor2[0]=1;//será adicionado ao valor 0 do vetor o numero 1 pois o vetor já foi inicializado
         vetor3[0]=1;// neste caso como vetor já inicializado será subistituido o vetor numero 0 que é = 10 por 1

         int soma=0;
         for (int i = 0; i < vetor3.length; i++){
         soma += vetor3[i];
         }
         System.out.println(soma);
         //nesse caso vai ser somado os elementos do vetor
         }
         }


         ================================================================================================*/
        /**================================================================================================
         public class app{
         public static void main(String[] args) throws execption{
         int[] vetor={10, 20, 30, 40, 50};
         int soma=0; %3!
         //for-each:para-cada
         for (int elemento:vetor){
         soma += elemento;
         }
         System.out.println(soma);
         }
         }

         ================================================================================================*/
        /**================================================================================================
         public class app{
         public static void main(String[] args) throws execption{
         System.out.println("break");
         for (inti=0;i<10; i++){
         if (i == 5){
         break;// o comando filaliza passando apara a proxima interação
         }
         System.out.format("%d, ", i);
         }
         System.out.println("\ncontinue");// o \n faz a quebra de linha logo no inicio
         for (int i = e ; i < 10; i++){
         if (i == 5){
         continue;// o comando volta para o inicio da interação e não para a proxima linha
         }
         System.out.format("%d, ", i);
         }
         }

         }

         ================================================================================================*/
    }
}
