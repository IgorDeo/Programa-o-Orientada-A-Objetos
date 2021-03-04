package ExerciciosConstrutores.Questao3.Casa;

public class Porta {
    String cor;
    double altura;
    double largura;
    boolean aberta = false;

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
    
    
    boolean estaAberta(){
        if(aberta){
            return true;
        }else{
            return false;
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
