package ExerciciosConstrutores.Questao3.Aniversario;

public class Main {
    public static void main(String[] args){
        Pessoa igor = new Pessoa("Igor Deo Alves", 19);
        igor.imprimirInformacoes();

        for (int i= 0; i < 10; i++){
            igor.aniversario();
        }

        igor.imprimirInformacoes();

        
    }
}
