package ExerciciosIntroPoo.Supermercado;

public class Main {
   public static void main(String[] args){
        Produto ovo = new Produto();
        Produto cafe = new Produto();
        Pedido pedido = new Pedido();
        
        ovo.setPreco(12);
        cafe.setPreco(5);
        
        pedido.adicionarItens(ovo, 2);
        pedido.adicionarItens(cafe, 5);

        pedido.pagarPedido();
   }
}
