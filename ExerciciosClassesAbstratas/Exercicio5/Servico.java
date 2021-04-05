package Exercicio5;

public class Servico implements Recebivel{
    private String descricao;
    private int horas;
    private double precoHora;

    public Servico(String descricao, int horas, double precoHora){
        this.descricao = descricao;
        this.horas = horas;
        this.precoHora = precoHora;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public int getHoras(){
        return this.horas;
    }

    @Override
    public double totalizarReceita() {
        return this.precoHora * this.horas;
    }

    @Override
    public String toString() {
        return String.format("""
                Descrição serviço: %s - Horas necessárias: %d
                Total do serviço: R$%.2f               
                """, this.getDescricao(), this.getHoras(), this.totalizarReceita());
    }
}