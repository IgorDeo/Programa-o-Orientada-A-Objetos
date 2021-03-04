package ExerciciosConstrutores.Questao3.Supermercado;

public class Produto {
    private String nome;
    private float preco;
    private int estoque;

    public Produto(String nome, float preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

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

    String getNome(){
        return this.nome;
    }
    

}
