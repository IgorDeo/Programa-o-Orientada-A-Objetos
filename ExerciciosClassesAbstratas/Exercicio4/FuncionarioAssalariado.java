package Exercicio4;

import jdk.jfr.Percentage;

public class FuncionarioAssalariado extends Funcionario{
    private double salarioSemanal;

    public FuncionarioAssalariado(String nome, String matricula, double salario){
        super(nome, matricula);
        this.setSalario(salario);
    }

    public void setSalario(double novoSalario){
        this.salarioSemanal = Math.max(novoSalario, 0.0);
    }

    public double getSalarioMensal(){
        return this.salarioSemanal * 4;
    }

    @Override
    public double folhaPagamento() {
        return this.getSalarioMensal();
    }

    @Override
    public String toString(){
        return String.format("Funcionário assalariado: %s\nSalário: R$%.2f\n", super.toString(), this.folhaPagamento());
    }
}
