package Exercicio1;

public class Quadrado extends Retangulo{
    public void calcularArea(double lado){
        this.area = Math.pow(lado, 2);
    }

    public void calcularPerimetro(double lado){
        this.perimetro = lado * 4;
    }
}