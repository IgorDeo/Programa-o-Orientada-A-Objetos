package ExerciciosConstrutores.Questao3.Celular;

public class Bateria {
    private int capacidade = 1000;
    private int nivelDeCarga = 1000;
    

    public int getNivelDeCarga(){
        return this.nivelDeCarga;
    }

    public int getCapacidade(){
        return this.capacidade;
    }

    public void setNivelDeCarga(int nivelDeCarga){
        this.nivelDeCarga = nivelDeCarga;
    }

    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
}
