package ExercíciosHerança.Exercicio3;

public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, int idade, Pessoa pai, Pessoa mae){
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }

    public void imprimeArvore(){
        System.out.printf("Nome do individuo: %s\n", this.nome);
        System.out.printf("Idade do individuo: %d\n", this.idade);
        System.out.printf("Mãe do individuo: %s\n", this.mae.getNome());
        System.out.printf("Pai do individuo: %s\n", this.pai.getNome());
    }

    public String getNome(){
        return this.nome;
    }
}
