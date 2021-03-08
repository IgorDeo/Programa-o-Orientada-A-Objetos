package ExerciciosConstrutores.Questao3.Aniversario;

public class Pessoa {
    private int idade;
    private String nome;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }
    
    public int getIdade(){
        return idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void aniversario(){
        idade++;
    }

    public void imprimirInformacoes(){
        System.out.printf("\n Nome: %s \n", nome);
        System.out.printf(" Aniversario: %d\n", idade);
    }

}
