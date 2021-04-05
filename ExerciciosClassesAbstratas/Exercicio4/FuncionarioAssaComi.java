package Exercicio4;

public class FuncionarioAssaComi extends FuncionarioComissionado{
    private double salarioBase;

    public FuncionarioAssaComi(String nome, String matricula, double vendas, double porcentagem, double salario){
        super(nome, matricula, vendas, porcentagem);
        this.setSalarioBase(salario);
    }

    public void setSalarioBase(double salario){
        this.salarioBase = Math.max(salario, 0.0);
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }

    @Override
    public double folhaPagamento(){
        return getSalarioBase() + super.folhaPagamento();
    }

    @Override
    public String toString(){
        return String.format("""
                        Funcionário Assalariado e Comissionado: %s (Matrícula: %s)
                        Salário base: R$%.2f; Vendas: R$%.2f; Porcentagem de comissão: %.2f
                        Salário final: R$%.2f
                        
                        """,
                    this.getNome(), this.getMatricula(), this.getSalarioBase(), this.getVendas(),
                    this.getPorcentagemComissao(), this.folhaPagamento());
    }
}