package Exercicio1;

public class Triangulo extends FormaGeometrica {
    public void calcularArea(double base, double altura){
        this.area = (base * altura) / 2;
    }

    public void calcularPerimetro(double lado1, double lado2, double lado3){
        this.perimetro = lado1 + lado2 + lado3;
    }
}