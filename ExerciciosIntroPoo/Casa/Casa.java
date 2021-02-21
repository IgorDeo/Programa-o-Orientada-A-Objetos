package ExerciciosIntroPoo.Casa;

public class Casa {
    String cor;
    int abertas = 0;
    int posicaoPorta = 0;


    Porta[] portas = new Porta[3];
    
    void addPorta(Porta porta){
        portas[posicaoPorta] = porta;
        posicaoPorta++;
    }
    
    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }


    void quantasPortasEstaoAbertas(){
        System.out.printf("Existem %d porta(s) aberta(s) no momento.\n", abertas);
    }

    void abrirUmaPorta(int numeroDaPorta){
        if(!portas[numeroDaPorta-1].estaAberta()){
            portas[numeroDaPorta - 1].abrirPorta();
            System.out.printf("A porta de numero %d foi aberta\n", numeroDaPorta);
            abertas++;
        }
        else{
            System.out.printf("A porta de numero %d ja se encontra aberta\n", numeroDaPorta);
        }
    }
    
    void fecharUmaPorta(int numeroDaPorta){
        if(portas[numeroDaPorta - 1].estaAberta()){
            portas[numeroDaPorta - 1].fecharPorta();
            System.out.printf("A porta de numero %d foi fechada\n", numeroDaPorta);
            abertas--;
        }
        else{
            System.out.printf("A porta de numero %d ja se encontra fechada\n", numeroDaPorta);
        }
    }

    void abrirTodasAsPortas(){
        for(int i = 0; i < portas.length; i++){
            if(!portas[i].estaAberta()){
                portas[i].abrirPorta();
                abertas++;
            }
        }
    }

    void fecharTodasAsPortas(){
        for(int i = 0; i < portas.length; i++){
            if(portas[i].estaAberta()){
                portas[i].fecharPorta();
                abertas--;
            }
        }
    }
}


