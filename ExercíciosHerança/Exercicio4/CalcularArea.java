package ExercíciosHerança.Exercicio4;

public class CalcularArea {
    protected double base;
    protected  double altura;
    protected  double raio;
    protected  double area;

    public CalcularArea(double base, double altura, double raio) {
        this.base = base;
        this.altura = altura;
        this.raio = raio;
    }

    public void CalcularAreaFigura(){
        System.out.printf("A area é igual a %.2f u.a", this.area);
    }
}
