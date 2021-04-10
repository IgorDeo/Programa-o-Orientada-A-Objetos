package Exercicio2;

public class ContaCorrente {
    public float limite;
    public float saldo;
    public float valorLimite;

    public ContaCorrente(float saldoInicial){
        this.saldo = saldoInicial;
    }


    public void sacar(float valor){
        if (valor > this.saldo || valor < 0)
            throw new IllegalArgumentException("Valor sacado maior do que o saldo disponivel ou menor do que 0");
    }
    void depositar(float valor){
        if (valor < 0)
            throw new IllegalArgumentException("Valor depositado não pode ser negativo");

    }
    void setValorLimite(float valor){
        if (valor < 0)
            throw new IllegalArgumentException("Valor limite não pode ser negativo");
    }

}
