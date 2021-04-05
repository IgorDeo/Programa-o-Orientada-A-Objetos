package Exercicio4;

public abstract class Funcionario {
    private String nome;
    private String matricula;

    public Funcionario(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public String getNome(){
        return this.nome;
    }

    public String getMatricula(){
        return this.matricula;
    }

    @Override
    public String toString(){
        return String.format("%s (Matrícula: %s)", this.getNome(), this.getMatricula());
    }

    public abstract double folhaPagamento();




}