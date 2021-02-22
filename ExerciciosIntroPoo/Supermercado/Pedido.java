package ExerciciosIntroPoo.Supermercado;
import java.util.Scanner;


public class Pedido {
    Produto[] itens = new Produto[100];
    int quantidadeItens = 0;

    void adicionarItens(Produto produto, int quantidade){
        for (int i = 0; i < quantidade; i++){
            itens[quantidadeItens] = produto;
            quantidadeItens++;
        }
    }
    
    
    float getTotal(){
        float total = 0;
        for(int i = 0; i < quantidadeItens; i++){
            total += itens[i].getPreco();
        }
        return total;
    }

    void pagarPedido(){
        String metodoDePagamento;
        float dinheiroRecebido;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o metodo de pagamento: ");
        metodoDePagamento = teclado.nextLine();

        switch(metodoDePagamento){
            case "cartao":
                System.out.printf("O total da compra foi %.2f\n", this.getTotal());
                System.out.println("Insira o cartao");
                System.out.println("Insira a senha");
                System.out.println("Pagamento aprovado");
                break;
            case "dinheiro":
                System.out.printf("O total do seu pedido é: %.2f. \n", this.getTotal());
                dinheiroRecebido = teclado.nextFloat();
                if (dinheiroRecebido >= this.getTotal()){
                    System.out.printf("Seu troco foi de %.2f", (dinheiroRecebido - this.getTotal()));
                    System.out.println("Aproveite!");
                }
                else{
                    System.out.println("Pagamento Insuficiente");
                }
                break;
            case "cheque":
            System.out.println("Obrigado por comprar conosco!");
            break;


            
        }
        teclado.close();
    }
}
