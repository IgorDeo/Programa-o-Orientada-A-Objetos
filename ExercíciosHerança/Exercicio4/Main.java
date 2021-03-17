package ExercíciosHerança.Exercicio4;

public class Main {
    public static void main(String[] args){
        Retangulo retangulo = new Retangulo(10,20,0);
        retangulo.CalcularAreaFigura();
        Triangulo triangulo = new Triangulo(10,20,0);
        triangulo.CalcularAreaFigura();
        Quadrado quadrado = new Quadrado(10,0,0);
        quadrado.CalcularAreaFigura();
        Circulo circulo = new Circulo(0,0,10);
        circulo.CalcularAreaFigura();
    }
}
