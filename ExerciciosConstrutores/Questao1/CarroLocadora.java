package ExerciciosConstrutores.Questao1;

public class CarroLocadora {
    private String modelo;
    private String cor;
    private String placa;
    private float aluguel;   
    private Boolean abastecido = true;
    

    CarroLocadora(String modelo, String placa, float aluguel, String cor){
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.aluguel = aluguel;
    }
    
    public Boolean abastecer(){}



}
