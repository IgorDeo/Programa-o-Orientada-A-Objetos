package ExerciciosConstrutores.Questao3.Aniversario;

public class Pessoa {
    private int idade;
    private String nome;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }
    
    int getIdade(){
        return idade;
    }

    String getNome(){
        return nome;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    void setIdade(int idade){
        this.idade = idade;
    }

    void aniversario(){
        idade++;
    }

    void imprimirInformacoes(){
        System.out.printf("\n Nome: %s \n", nome);
        System.out.printf(" Aniversario: %d\n", idade);
    }

}
