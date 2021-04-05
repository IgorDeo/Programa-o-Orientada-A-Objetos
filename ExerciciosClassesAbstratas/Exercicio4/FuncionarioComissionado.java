package Exercicio4;

public class FuncionarioComissionado extends Funcionario{
    private double vendas;
    private double porcentagemComissao;

    public FuncionarioComissionado(String nome, String matricula, double vendas, double porcentagem){
        super(nome, matricula);
        this.setVendas(vendas);
        this.setPorcentagemComissao(porcentagem);
    }

    public void setPorcentagemComissao(double novaPorcentagem){
        this.porcentagemComissao = (novaPorcentagem > 0.0 && novaPorcentagem < 1.0) ? novaPorcentagem : 0.0;
    }

    public double getPorcentagemComissao(){
        return this.porcentagemComissao;
    }

    public void setVendas(double vendas){
        this.vendas = Math.max(vendas, 0.0);
    }

    public double getVendas(){
        return this.vendas;
    }

    @Override
    public double folhaPagamento() {
        return this.getVendas() * this.getPorcentagemComissao();
    }

    @Override
    public String toString(){
        return String.format("Funcionário comissionado: %s\nVendas: %.2f; Porcentagem de comissão: %.2f\nSalário final: R$%.2f\n",
                super.toString(), this.getVendas(), this.getPorcentagemComissao(), this.folhaPagamento());
    }
}