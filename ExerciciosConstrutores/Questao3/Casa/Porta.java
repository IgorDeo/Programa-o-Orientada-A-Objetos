package ExerciciosConstrutores.Questao3.Casa;

public class Porta {
    private String cor;
    private double altura;
    private double largura;
    private boolean aberta = false;

    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
    

    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }


    public void setLargura(double largura){
        this.largura = largura;
    }
    public double getLargura(){
        return largura;
    }
    
    
    public boolean estaAberta(){
        if(aberta){
            return true;
        }else{
            return false;
        }
    }

    public void abrirPorta(){
        this.aberta = true;
    }
    
    public void fecharPorta(){
        this.aberta = false;
    }

    public void informacoesPorta(){
        System.out.printf("Cor: %s\n", cor);
        System.out.printf("Altura: %.2f metros\n", altura);
        System.out.printf("Largura: %.2f metros\n", largura);
    }
    
}
