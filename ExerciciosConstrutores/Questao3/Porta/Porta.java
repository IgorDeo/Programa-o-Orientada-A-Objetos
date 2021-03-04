package ExerciciosConstrutores.Questao3.Porta;

public class Porta {
    private String cor;
    private double altura;
    private double largura;
    private boolean aberta = false;

    public Porta(String cor, double altura, double largura){
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
    }
    
    void setCor(String cor){
        this.cor = cor;
    }
    String getCor(){
        return cor;
    }
    

    void setAltura(double altura){
        this.altura = altura;
    }
    double getAltura(){
        return altura;
    }


    void setLargura(double largura){
        this.largura = largura;
    }
    double getLargura(){
        return largura;
    }
    
    
    void estaAberta(){
        if(aberta){
            System.out.println("A porta está aberta!\n");
        }else{
            System.out.println("A porta está fechada!\n");
        }
    }

    void abrirPorta(){
        this.aberta = true;
    }
    
    void fecharPorta(){
        this.aberta = false;
    }

    void informacoesPorta(){
        System.out.printf("Cor: %s\n", cor);
        System.out.printf("Altura: %.2f metros\n", altura);
        System.out.printf("Largura: %.2f metros\n", largura);
    }
    
}
