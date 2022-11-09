package aula_13;

public class Aula_13_04 {
    /**
     public class Manipulação_de_Strings {
     equals()
     Usar sempre que for comparar valores,conteúdo.

     equalsIgnoreCase()
     Não diferencia maiúsculaseminúsculas.

     Exemplos com equals()
     String s1 = "ABC";
     String s2 = "abc";
     String s3 = "ABD";
     String s4 = new String("ABC");

     System.out.println(s1.equals(s2));// false
     System.out.println(s2.equals(s1));// false

     System.out.println(s1.equals IgnoreCase(s2));// true
     System.out.println(s2.equals IgnoreCase(s1));// true

     System.out.println(s1.equals(s3));// false
     System.out.println(s3.equals(s1));// false

     System.out.println(s1.equals(s4));// true
     System.out.println(s4.equals IgnoreCase(s1));// true

     compareTo()
     Usa comparação lexicográfica e retorna -X, 0, X

     compareTolgnoreCase()
     Não diferencia maiúsculas e minúsculas.


     Resultado do compareTo()
     Resualdados validados pela ASCII TABLE

     s1 : A B C          s1.ct(s2) = -3
     s2 : A B F          s2.ct(s1) = +3

     s1 : A C B          s1.ct(s2) = +1
     s2 : A B C          s2.ct(s1) = -1

     s1 : A B C          s1.ct(s2) = 0
     52 : A B C          s2.ct(s1) = 0

     s1 : a b c          s1.ct(s2) = +32
     s2 : A B C          s2.ct(s1) = -32

     s1 : A B C          s1.ct(s2) = -2
     s2 : A B C D E      s2.ct(s1) = +2

     Métodos Úteis de Objetos String
     • Métodos que retornam um novo objeto:

     String s1 = "POO com Java";

     • concat()
     println(s1.concat("no VS Code"));// POO com Java no VS Code
     metodo para concatenar uma string em outra string

     • replace(),replaceAll()
     println(s1.replace("Java","Python"));// POO com Python
     Subistitue uma substring em outra substring desntro da string em questão

     • to LowerCase()
     println(s1.toLowerCase());// poo com java
     tranforma todas as letras da string em minuculas

     • toUpperCase()
     println(s1.toUpperCase());// POO COM JAVA
     tranforma todas as letras da string em maiusculas

     Métodos Úteis de Objetos String
     • Métodos que retornam um novo objeto:(cont.) com espaço no inicio e no fim
     String s1 = " POO com Java ";

     •trim()
     println(s1.trim());// POO com Java
     remove os espaços de inicio e fim

     •split() e trim()
     String[] ps = s1.trim().split("");//{"POO","com","Java"}
     divide uma string em outras strings em modelo de vetor

     •charAt()
     char c1=s1.charAt(5);//'c'
     retorna um caracterem na posição desejada

     •substring()
     println(s1.substring(1,3));// POO
     retona parte de um string

     •String.valueOf(object)
     Converte qualquer objeto para o tipo string;
     */
}
