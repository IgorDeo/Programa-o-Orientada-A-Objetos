package Exercicio1;

public class Retangulo extends FormaGeometrica{
    public void calcularArea(double lado1, double lado2){
        this.area = lado1 * lado2;
    }

    public void calcularPerimetro(double lado1, double lado2){
        this.perimetro = (lado1 * 2) + (lado2 * 2);
    }
}