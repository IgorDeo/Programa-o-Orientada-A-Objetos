package ExerciciosConstrutores.Questao3.Casa;

public class Casa {
    private String cor;
    private int abertas = 0;
    private int posicaoPorta = 0;


    Porta[] portas = new Porta[3];
    
    void addPorta(Porta porta){
        portas[posicaoPorta] = porta;
        posicaoPorta++;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }


    public void quantasPortasEstaoAbertas(){
        System.out.printf("Existem %d porta(s) aberta(s) no momento.\n", abertas);
    }

    public void abrirUmaPorta(int numeroDaPorta){
        if(!portas[numeroDaPorta-1].estaAberta()){
            portas[numeroDaPorta - 1].abrirPorta();
            System.out.printf("A porta de numero %d foi aberta\n", numeroDaPorta);
            abertas++;
        }
        else{
            System.out.printf("A porta de numero %d ja se encontra aberta\n", numeroDaPorta);
        }
    }
    
    public void fecharUmaPorta(int numeroDaPorta){
        if(portas[numeroDaPorta - 1].estaAberta()){
            portas[numeroDaPorta - 1].fecharPorta();
            System.out.printf("A porta de numero %d foi fechada\n", numeroDaPorta);
            abertas--;
        }
        else{
            System.out.printf("A porta de numero %d ja se encontra fechada\n", numeroDaPorta);
        }
    }

    public void abrirTodasAsPortas(){
        for(int i = 0; i < portas.length; i++){
            if(!portas[i].estaAberta()){
                portas[i].abrirPorta();
                abertas++;
            }
        }
    }

    public void fecharTodasAsPortas(){
        for(int i = 0; i < portas.length; i++){
            if(portas[i].estaAberta()){
                portas[i].fecharPorta();
                abertas--;
            }
        }
    }
}


