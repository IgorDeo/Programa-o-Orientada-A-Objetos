package Exercicio5;

public class ItemVenda implements Recebivel{
    private String produto;
    private int quantidade;
    private double precoUnitario;

    public ItemVenda(String produto, int quantidade, double precoUnitario){
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getProduto(){
        return this.produto;
    }

    public int getQtd(){
        return this.quantidade;
    }


    @Override
    public double totalizarReceita() {
        return this.precoUnitario * this.quantidade;
    }

    @Override
    public String toString() {
        return String.format("""
                Descrição produto: %s - Quantidade: %d
                Total da compra: R$%.2f
                """, this.getProduto(), this.getQtd(), this.totalizarReceita());
    }
}