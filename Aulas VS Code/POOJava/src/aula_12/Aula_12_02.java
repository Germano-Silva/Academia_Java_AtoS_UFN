package aula_12;

import java.io.IOException;

public class Aula_12_02 {
    public static void clearScreen()throws IOException, InterruptedException{
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
    }
    public static void main(String[] args) throws Exception {
        clearScreen();
        //criarStrings(999999999);
        compararStrings();
        // compararStrings2();
        // modificarStrings();
        // construirStrings(99999999);
        // formatarStrings();
    }
    public static void compararStrings() {
        String s1="ABC";// SCP
        String s2="ABC";// SCP
        System.out.println(s1 == s2);// true

        String s3=new String("ABC");// heap
        String s4=new String("ABC");// heap
        System.out.println(s3 == s4);// false

        String s5 = s1 + s2;// heap
        String s6 = "ABCABC";// SCP
        System.out.println(s5 == s6);// false

        System.out.println(s5.intern() == s6);// true

        final int i1 = 5;
        String s7 = "ABC" + i1;// SCP
        String s8 = "ABC5";// SCP
        System.out.println(s7 == s8);// true

        String s9="Programação ";// SCP
        s9 += "Java";// heap
        String s10 = "Programação Java";// SCP
        System.out.println(s9 == s10);// false

        String s11 = s9.intern();// SCP
        System.out.println(s10 == s11);// true
    }
}
