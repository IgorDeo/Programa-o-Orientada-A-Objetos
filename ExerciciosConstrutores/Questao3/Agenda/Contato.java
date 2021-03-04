package ExerciciosConstrutores.Questao3.Agenda;
public class Contato {
    private String nome;
    private String numero;

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }
    
    void setNome(String nome){
        this.nome = nome;
    }

    void setNumero(String numero){
        this.numero = numero;
    }

    String getNome(){
        return nome;
    }

    String getNumero(){
        return numero;
    }

}
