package ExerciciosConstrutores.Questao3.Supermercado;

public class Main {
   public static void main(String[] args){
        Produto ovo = new Produto("ovo", 12, 2);
        Produto cafe = new Produto("cafe", 5, 5);
        Pedido pedido = new Pedido();
        
        
        pedido.adicionarItens(ovo, 2);
        pedido.adicionarItens(cafe, 5);

        pedido.pagarPedido();
   }
}
