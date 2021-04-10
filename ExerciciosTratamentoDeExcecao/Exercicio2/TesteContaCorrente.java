package Exercicio2;

public class TesteContaCorrente {

    public static void main(String[] args){
        ContaCorrente conta = new ContaCorrente(1000);

        try {
            //conta.sacar(2000); //Mensagem impressa "Valor sacado maior do que o saldo disponivel ou menor do que 0"
            //conta.depositar(-1); // Mensagem impressa "Valor depositado não pode ser negativo"
            conta.setValorLimite(-10000); //Mensagem impressa "Valor limite não pode ser negativo"
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}
