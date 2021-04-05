package Exercicio1;

public class Circulo extends FormaGeometrica {
    public void calcularArea(double raio){
        this.area = Math.PI * (Math.pow(raio, 2));
    }

    public void calcularPerimetro(double raio){
        this.perimetro = 2 * Math.PI * raio;
    }
}