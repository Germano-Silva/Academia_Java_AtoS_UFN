package aula_16;

public class Aula_16_03 {
    public static void main(String[] args) throws Exception{
        if(args.length == 3){
            int valor1 = 0, valor2 = 0, resultado = 0;
            char operador='+';
            try{
                valor1 = Integer.parseInt(args[0]);
                operador = args[1].charAt(0);
                valor2 = Integer.parseInt(args[2]);
            }catch (NumberFormatException e){
                System.err.println("Argumentos devem ser um inteiro,um caractereeoutro inteiro.");
                System.exit(1);
            }
            switch (operador) {
                case '+' -> resultado = valor1 + valor2;
                case '-' -> resultado = valor1 - valor2;
                case 'x' -> resultado = valor1 * valor2;
                case '/' -> resultado = valor1 / valor2;
                default -> {
                    System.err.format("O operador %c não foi reconhecido.%n", operador);
                    System.exit(2);
                }
            }
            System.out.format("Resultado = %d%n", resultado);
        }else{
            System.err.println("Esse programa requer 3 argumentos.");
            System.exit(3);
        }
    }
}
