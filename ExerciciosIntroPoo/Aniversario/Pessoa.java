package ExerciciosIntroPoo.Aniversario;

public class Pessoa {
    int idade = 19;
    String nome = "Igor Deo";

    int getIdade(){
        return idade;
    }

    String getNome(){
        return nome;
    }

    void aniversario(){
        idade++;
    }

    void imprimirInformacoes(){
        System.out.printf("\n Nome: %s \n", nome);
        System.out.printf(" Aniversario: %d\n", idade);
    }

}
