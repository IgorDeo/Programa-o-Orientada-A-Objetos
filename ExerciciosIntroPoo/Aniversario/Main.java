package ExerciciosIntroPoo.Aniversario;

public class Main {
    public static void main(String[] args){
        Pessoa igor = new Pessoa();
        igor.imprimirInformacoes();

        for (int i= 0; i < 10; i++){
            igor.aniversario();
        }

        igor.imprimirInformacoes();

        
    }
}
