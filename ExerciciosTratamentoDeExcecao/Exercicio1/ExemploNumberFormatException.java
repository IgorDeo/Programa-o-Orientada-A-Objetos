package Exercicio1;

public class ExemploNumberFormatException {
    public static void main(String[] args){
        try{
            String numero = "dez";
            int numeroConvertido = Integer.parseInt(numero);

            int numeroVezes2 = numeroConvertido * 2;
            System.out.println("Resultado: " + numeroVezes2);
        }
        catch (java.lang.NumberFormatException ex){ //Esse tipo de exceção ocorre quando uma String tenta ser convertida para um formato numérico, porém a string não possui o formato apropriado
            System.out.println("Essa string não pode ser convertida para inteiro");
        }
    }
}

