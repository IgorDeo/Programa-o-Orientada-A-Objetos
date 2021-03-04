package ExerciciosConstrutores.Questao4;

public class Main {
    public static void main(String[] args){
        Data hoje = new Data(03,03,2021);
        Data hoje1 = new Data("Agosto", 8, 2017);

        hoje.imprimeData();
        hoje1.imprimeData();
    }
}
