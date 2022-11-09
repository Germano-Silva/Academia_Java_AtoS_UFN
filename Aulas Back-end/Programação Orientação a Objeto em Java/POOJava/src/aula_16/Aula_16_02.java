package aula_16;

public class Aula_16_02 {
    public static void main(String[] args)throws Exception{
        if(args.length > 0){
            int[] intArgs = new int[args.length];
            for(int i = 0; i < intArgs.length; i++){
                try{
                    intArgs[i] = Integer.parseInt(args[i]);
                    System.out.format("Argumento inteiro %d = %d%n", i, intArgs[i]);
                }catch(NumberFormatException e){
                    System.err.println("Argumento " +args[i]+ " deve ser um inteiro.");
                    System.exit(1);
                }
            }
        }
    }
}
