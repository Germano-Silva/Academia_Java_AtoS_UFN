package aula_06;

public class Aula_06 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int v1 = 6;
        int v2 = 6;
        System.out.println(v1 + " >  " + v2 + " :: " + (v1 >  v2));
        System.out.println(v1 + " >= " + v2 + " :: " + (v1 >= v2));
        System.out.println(v1 + " <  " + v2 + " :: " + (v1 >  v2));
        System.out.println(v1 + " <= " + v2 + " :: " + (v1 <= v2));
        System.out.println(v1 + " == " + v2 + " :: " + (v1 == v2));
        System.out.println(v1 + " != " + v2 + " :: " + (v1 != v2));
        System.out.println();
        System.out.format("%d >  %d :: %b%n", v1, v2, v1 >  v2);
        System.out.format("%d >= %d :: %b%n", v1, v2, v1 >= v2);
        System.out.format("%d <  %d :: %b%n", v1, v2, v1 <  v2);
        System.out.format("%d <= %d :: %b%n", v1, v2, v1 <= v2);
        System.out.format("%d == %d :: %b%n", v1, v2, v1 == v2);
        System.out.format("%d != %d :: %b%n", v1, v2, v1 != v2);
    }
}
