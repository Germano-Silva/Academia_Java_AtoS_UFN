package aula_05;

public class Aula_05 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // conversoes do tipo implicitas
        int v1=50;
        long v2=v1;
        System.out.println(v2);

        byte v3 = 5;
        short v4 = 6;
        int v5 = 23423;
        long v6 = 231452345;
        long r1 = v3 + v4 + v5 + v6;
        System.out.println(r1);

        float f1 = 34.56f;
        double d1 = 567.234;
        float r2 = f1 * f1;
        System.out.println(r2);

        double r3 = f1 + d1;
        System.out.println(r3);

        double r4= f1 + d1 +v6;
        System.out.println(r4);

        //Conversoes do tipo explicitas
        /**
         float vFloat = 5.0f;
         double vDouble =2.5d;
         byte vByte = 8;
         short vshort = 12;
         int vInt= 41 ;
         */
        long vLong = 241;

        short r5 = (short)vLong;
        System.out.println(vLong);
        System.out.println(r5);
    }
}
