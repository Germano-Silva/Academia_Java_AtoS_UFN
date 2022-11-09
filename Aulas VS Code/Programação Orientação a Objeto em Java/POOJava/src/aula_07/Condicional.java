package aula_07;

public class Condicional {
    public static void main(String[] args) throws Exception {

        //===============================================================
        // Condicional Se
        //nesta condicional vemos que se for verdadeiro temos o resultado de "r=v1/v2"
        //caso seja falso terá o valor anterior adicionado a varivel "r" = a 0
        /**
         int v1 = 10;
         int v2 = 0;
         int r  = 0;
         if (v2 != 0)
         r = v1 / v2;
         System.out.format("Resultado: %d%n", r);

         ===============================================================*/

        // Condicional Se e Senão
        //nesta condicional vemos que se for verdadeiro temos o resultado de "r=v1/v2"
        //caso seja falso terá o valor maior possivel que pode ser armazenado em uma variavel tipo int.
        /**
         int v1 =10;
         int v2 =0;
         int r  =0;
         if (v2 != 0)
         r = v1/v2;
         else
         r = Integer.MAX_VALUE;
         System.out.format("Resultado: %d%n", r);

         ===============================================================*/

        //Caso precise colocar mais de uma linha de codigo adicione chaves
        /**
         int v1 = 10;
         int v2 = 0;
         int r  = 0;
         if (v2 != 0){
         r=v1/v2;
         System.out.format("Resultado: %d%n", r);
         }
         else{
         System.out.println("Divisão impossível!");
         }

         ===============================================================*/

        /** Em casos de mais de uma condição é utilizado o farmato de blocos de if e else
         int v1  = 10;
         int v2  = 2;
         String op = "a";

         if (op =="a"){
         System.out.format("Soma: %d%n", v1+v2);
         }else{
         if (op == "s"){
         System.out.format("Subtração: %d%n", v1-v2);
         }else{
         if (op == "m"){
         System.out.format("Multiplicação: %d%n", v1*v2);
         }else{
         if (op == "d"){
         System.out.format("Divisão: %d%n", v1/v2);
         }
         else{
         System.out.println("Operação não reconhecida!");
         }
         }
         }
         }



         ===============================================================*/

        /**

         Em casos de condições utiliza-se blocos compactos de else if
         int v1=10;
         int v2=2;
         char op='a';

         if (op == 'a'){
         System.out.format("Soma: %d%n", v1+v2);
         }else if (op == 's'){
         System.out.format("Subtração: %d%n", v1-v2);
         }else if (op == 'm'){
         System.out.format("Multiplicação: %d%n", v1*v2);
         }else if (op == 'd'){
         System.out.format("Divisão: %d%n", v1/v2);
         }else{
         System.out.println("Operação é invalida!");
         }
         ===============================================================*/

        /**
         Em casos que a mais informações a serem adicionadas podem ser colocadas em mais um bloco ou ramificação
         int v1=10;
         int v2=2;
         char op='a';

         if (op == 'a'){
         System.out.format("Soma: %d%n", v1+v2);
         }else if (op == 's'){
         System.out.format("Subtração: %d%n", v1-v2);
         }else if (op == 'm'){
         System.out.format("Multiplicação: %d%n", v1*v2);
         }else if (op == 'd'){
         if (v2 != 0){
         System.out.format("Divisão: %d%n", v1/v2);
         }
         else{
         System.out.println("Divisão por zero impossível.");
         }
         }else{
         System.out.println("Operação é invalida!");
         }
         */

        /**===============================================================

         boolean c1 = true;
         boolean c2 = true;
         System.out.format("c1 & c2 : %b & %b = %b%n", c1, c2, c1 & c2);
         System.out.format("c1 | c2 : %b | %b = %b%n", c1, c2, c1 | c2);
         System.out.format("c1 * c2 : %b ^ %b = %b%n", c1, c2, c1 ^ c2);
         System.out.format("!c1 : ! %b = %b%n", c1, !c1);
         }
         }
         ===============================================================*/
        /**===============================================================

         Operador logico de contagio
         int pessoas=30;
         float areaM2=100;
         if (areaM2/pessoas<4){
         System.out.println("Risco de contágio está alto.");
         }else{
         System.out.println("Risco de contágio está baixo.");
         }

         ===============================================================*/

        /**==============================================================
         operadores logico "E"
         vai esecutar o comando nas duas partes
         int pessoas=30;
         float areaM2=100;
         if ((pessoas>0) && (areaM2/pessoas<4)){
         System.out.println("Risco de contágio está alto.");
         }else{
         System.out.println("Risco de contágio está baixo.");
         }

         vai executar o comando somente em 1 parte por vez se um der falso não será realizado no outro
         int pessoas=30;
         float areaM2=100;
         if ((pessoas>0) & (areaM2/pessoas<4)){
         System.out.println("Risco de contágio está alto.");
         }else{
         System.out.println("Risco de contágio está baixo.");
         }

         ===============================================================*/

        int v1 = 10;
        int v2 = 2;
        char op = 'a';
        switch (op){
            case 'a':
                System.out.format("Soma: %d%n", v1+v2);
                break;
            case 's':
                System.out.format("Subtração: %d%n", v1-v2);
                break;
            case 'm':
                System.out.format("Multiplicação: %d%n", v1*v2);
                break;
            case 'd':
                if (v2 != 0)
                    System.out.format("Divisão: %d%n", v1/v2);
                else
                    System.out.println("Divisão por zero impossível.");
                break;
            default:
                System.out.println("Operação não reconhecida.");
        }


/**===============================================================
 *
 *
 Foram vistos nessa aula
 Atribuição condicional
 if-else
 Operadores relacionais
 Operadores lógicos
 Operadores lógicos condicionais
 Blocos de instruções
 switch


 ===============================================================*/
    }
}
