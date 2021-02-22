package ExerciciosIntroPoo.Supermercado;

public class Produto {
    String nome;
    float preco;
    int estoque;

    void setPreco(float preco){
        this.preco = preco;
    }

    void setEstoque(int estoque){
        this.estoque = estoque;
    }

    float getPreco(){
        return this.preco;
    }

    int getEstoque(){
        return this.estoque;
    }
    

}
