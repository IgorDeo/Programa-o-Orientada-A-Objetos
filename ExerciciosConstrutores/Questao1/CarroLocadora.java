package ExerciciosConstrutores.Questao1;

public class CarroLocadora {
    private String modelo;
    private String placa;
    private float aluguel;
    private int diasAluguel;
    private float precoTotal;
    

    CarroLocadora(String modelo, String placa, float aluguel, int diasAluguel){
        this.modelo = modelo;
        this.placa = placa;
        this.aluguel = aluguel;
        this.diasAluguel = diasAluguel;
    }
    
    
    public float getPrecoTotal(){
        return this.precoTotal = this.aluguel * this.diasAluguel;
    }

}
