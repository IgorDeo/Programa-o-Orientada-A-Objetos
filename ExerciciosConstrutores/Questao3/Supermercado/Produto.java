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

    public void setPreco(float preco){
        this.preco = preco;
    }

    public void setEstoque(int estoque){
        this.estoque = estoque;
    }

    public float getPreco(){
        return this.preco;
    }

    public int getEstoque(){
        return this.estoque;
    }

    public String getNome(){
        return this.nome;
    }
    

}
