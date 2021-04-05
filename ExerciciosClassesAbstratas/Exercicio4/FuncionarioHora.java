package Exercicio4;

public class FuncionarioHora extends Funcionario{
    private double salarioHora;
    private double horasTrabalhadas;

    public FuncionarioHora(String nome, String matricula, double salarioHora, double horasTrabalhadas){
        super(nome, matricula);
        this.setSalarioHora(salarioHora);
        this.setHorasTrabalhadas(horasTrabalhadas);
    }

    public void setSalarioHora(double novoSalarioHora){
        this.salarioHora = Math.max(novoSalarioHora, 0.0);
    }

    public double getSalarioHora(){
        return this.salarioHora;
    }

    public void setHorasTrabalhadas(double novasHorasTrabalhadas){
        this.horasTrabalhadas = novasHorasTrabalhadas;
    }

    public double getHorasTrabalhadas(){
        return this.horasTrabalhadas;
    }

    @Override
    public double folhaPagamento(){
        if(this.getHorasTrabalhadas() <= 160)
            return (this.getHorasTrabalhadas() * this.getSalarioHora());
        else
            return 160 * this.getSalarioHora() + ((this.getHorasTrabalhadas() - 160) * (1.5 * this.getSalarioHora()));
    }

    @Override
    public String toString(){
        return String.format("Funcionário por Hora: %s\nSalário por hora: R$%.2f; Horas trabalhadas: %.2f\nSalário final: R$%.2f\n",
                super.toString(), this.getSalarioHora(), this.getHorasTrabalhadas(), this.folhaPagamento());
    }
}