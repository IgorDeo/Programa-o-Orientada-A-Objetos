package ExercíciosHerança.Exercicio4;

public class Quadrado extends CalcularArea{
    public Quadrado(double base, double altura, double raio) {
        super(base, altura, raio);
    }
 
     @Override
     public void CalcularAreaFigura(){
         this.area = this.base * this.base;
         System.out.printf("A area do quadrado é igual a %.2f u.a\n", this.area);
     }
}
