package aula_04;

public class Aula_04 {
    public static void main(String[] args) throws Exception {



        float variavel1 = 100;
        float variavel2 = 250;

        float r1 = variavel1 + variavel2;
        float r2 = variavel2 - variavel1;
        float r3 = variavel1 * variavel2;
        float r4 = variavel2 / variavel1;
        float r5 = variavel2 % variavel1;

        System.out.println("Soma: " + r1);
        System.out.println("Subtração: " + r2);
        System.out.println("Multiplicação: " + r3);
        System.out.println("Divisão: " + r4);
        System.out.println("Módulo: " + r5);
        System.out.println("Byte: "+ Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
        System.out.println("Integer: "+ Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);
        System.out.println("Float: " + Float.MIN_VALUE + " a " + Float.MAX_VALUE);
        System.out.println("Double: " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);
    }
}
/**==============================================================

 Declaração de variavel em duas etapas
 int numero;
 numero = 50;

 ==============================================================

 Declaração de variavel em uma etapa
 int numero = 50;

 ==============================================================

 Tambem é possivel iniciar uma variavel com o "_"
 int _n1 = 50;

 ==============================================================

 Em Java, nós temos 8 tipos primitivos:
 https://homepages.dcc.ufmg.br/~rodolfo/aedsi-2-05/variavel.html

 byte;
 short;
 int;
 long;
 boolean;
 char;
 float;
 double.

 ==============================================================

 usando a palavra "final" faz com que a variavel seja considerada uma constande
 não permitindo trocar seu valor.

 final numero = 50;

 ==============================================================

 Variaveis do tipo inteiro
 byte    v1 = 30;
 short   v2 = 68;
 int     v3 = 50;
 long    v4 = -8;
 Byte:       -128 a 127
 Short:      -32768 a 32767
 Integer:    -2147483648 a 2147483647
 Long:       -9223372036854775808 a 9223372036854775807

 ==============================================================

 Variaveis do tipo ponto flutuante
 float   nf = 45.6f;
 double  nd = 47.2;
 Float: 1.4E-45 a 3.4028235E38
 Double: 4.9E-324 a 1.7976931348623157E308

 ==============================================================

 Variavel tipo caractere
 char letra = "A";
 char letraAcentuada = "\u00DA"; Ú

 ==============================================================
 int v1=100;
 int v2=250;

 int r1 = v1 + v2;
 int r2 = v2 - v1;
 int r3 = v1 * v2;
 int r4 = v2 / v1;
 int r5 = v2 % v1;
 System.out.println("Soma: "  + r1);
 System.out.println("Subtração: " + r2);
 System.out.println("Multiplicação: "+ r3);
 System.out.println("Divisão: "+ r4);
 System.out.println("Módulo: " + r5);
 System.out.println("Hello, World!");



 **/
