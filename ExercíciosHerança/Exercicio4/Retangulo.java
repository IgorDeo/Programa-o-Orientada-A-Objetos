package ExercíciosHerança.Exercicio4;

public class Retangulo extends CalcularArea {

   public Retangulo(int base, int altura, int raio) {
       super(base, altura, raio);
   }

    @Override
    public void CalcularAreaFigura(){
        this.area = this.altura * this.base;
        System.out.printf("A area do retangulo é igual a %.2f u.a\n", this.area);
    }
}
