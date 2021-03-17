package ExercíciosHerança.Exercicio4;

public class Circulo extends CalcularArea{
    

    private double pi = 3.1415;
    public Circulo(double base, double altura, double raio) {
        super(base, altura, raio);
    }
 
     @Override
     public void CalcularAreaFigura(){
         this.area = (this.raio * this.raio) * this.pi;
         System.out.printf("A area do circulo é igual a %.2f u.a\n", this.area);
     }
}
