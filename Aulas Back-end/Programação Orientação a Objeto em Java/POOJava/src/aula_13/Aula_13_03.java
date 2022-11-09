package aula_13;

public class Aula_13_03 {
    /**
     Formatação de Strings
     •Retorno de valor
     String s1=String.format("textoaser formatado", v1, v2, ..., vn);

     •Exibição na tela
     System.out.format("texto a ser formatado", v1, v2, ..., vn);
     System.out.printf("texto a ser formatado", v1, v2, ..., vn);

     •Associação a um StringBuilder
     StringBuilder sb = new StringBuilder();
     Formatter fmt = new Formatter(sb);
     fmt.format("Maior inteiro: %d%n",Integer.MAX_VALUE);
     fmt.format("Menor inteiro: %d%n",Integer.MIN_VALUE);
     fmt.close();
     System.out.println(sb.toString());

     Exibição de um inteiro com diferentes especificadores
     int valorInteiro=65;
     System.out.printf("%d%n",valorInteiro);// 65
     System.out.printf("%o%n",valorInteiro);// 101
     System.out.printf("%x%n",valorInteiro);// 41
     System.out.printf("%#x%n",valorInteiro);// 0x41
     System.out.printf("%#X%n",valorInteiro);// 0X41
     System.out.printf("%b%n",valorInteiro);// true
     System.out.printf("%c%n",valorInteiro);//A
     System.out.printf("%s%n",valorInteiro);// 65
     System.out.printf("%h%n",valorInteiro);// 41

     Exibição de um double com diferentes especificadores
     double valorDecimal=62.75;
     System.out.printf("%f%n",valorDecimal);// 62,750000
     System.out.printf("%a%n",valorDecimal);//0x1.f6p5
     System.out.printf("%e%n",valorDecimal);// 6,275000e+01
     System.out.printf("%g%n",valorDecimal);// 62,7500
     System.out.printf("%#a%n",valorDecimal);//0x1.f6p5
     System.out.printf("%#A%n",valorDecimal);//0X1.F6P5
     System.out.printf("%b%n",valorDecimal);// true
     System.out.printf("%s%n",valorDecimal);//62.75
     System.out.printf("%h%n",valorDecimal);// 404f6000


     Completando com espaçosezeros
     double preco = 47.5;
     System.out.printf("|%.2f|%n",  preco);    //|47,50|
     System.out.printf("|%.2f|%n",  preco);    //| 47,50|
     System.out.printf("|%-6.2f|%n",preco);    //|47,50 |
     System.out.printf("|%06.2f|%n",preco);    //|047,50|
     int qtde=71;
     System.out.printf("|%d|%n",qtde);        //|71|
     System.out.printf("|%6d|%n",qtde);       //|    71|
     System.out.printf("|%-6d|%n",qtde);      //|71    |
     System.out.printf("|%06d|%n",qtde);      //|000071|


     Separadores,exibição de negativosecombinações
     double saldoPos=7654.321;
     System.out.printf("|%.2f|%n",saldoPos);            //|7654,32|
     System.out.printf("|%,.2f|%n",saldoPos);           //|7.654,32|
     System.out.printf("|%,.2f|%n",saldoPos);           //|7.654,32|
     double saldoNeg=-7654.321;
     System.out.printf("|%,.2f|%n",saldoNeg);         //|-7.654,32|
     System.out.printf("|%,.2f|%n",saldoPos);         //| 7.654,32|
     System.out.printf("|%+,.2f|%n",saldoNeg);        //|-7.654,32|
     System.out.printf("|%+,.2f|%n",saldoPos);        //|+7.654,32|
     System.out.printf("|%(,11.2f|%n",saldoNeg);      //|(07.654,32)|
     System.out.printf("%(,011.2f|%n",saldoPos);      //| 007.654,32|



     */
}
