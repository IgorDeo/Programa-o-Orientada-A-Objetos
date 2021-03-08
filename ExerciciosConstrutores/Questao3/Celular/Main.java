package ExerciciosConstrutores.Questao3.Celular;

public class Main {
    public static void main(String[] args){
        Celular celular = new Celular();

        celular.nivelDeCarga();
        celular.fazerLigacao(50);

        celular.nivelDeCarga();

        celular.enviarMensagem();

        celular.nivelDeCarga();

        celular.recarregarBateria();

        celular.nivelDeCarga();
    }
}
