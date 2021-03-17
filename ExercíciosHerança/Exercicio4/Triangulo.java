package ExercíciosHerança.Exercicio4;

public class Triangulo extends CalcularArea{
    public Triangulo(int base, int altura, int raio) {
        super(base, altura, raio);
    }
 
     @Override
     public void CalcularAreaFigura(){
         this.area = (this.base * this.altura)/2;
         System.out.printf("A area do triangulo é igual a %.2f u.a\n", this.area);
     }
}
