package ExercíciosHerança.Exercicio3;

public class Main {
    public static void main(String[] args){
        Pessoa simone = new Pessoa("simone", 48, null, null);
        Pessoa jorge = new Pessoa("jorge", 45, null, null);
        Pessoa igor = new Pessoa("igor", 19, jorge, simone);

        igor.imprimeArvore();
    }
}
