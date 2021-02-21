package ExerciciosIntroPoo.Televisao;

public class Televisao {
    boolean silenciado = false;
    boolean ligada = false;
    int canalAtual = 0;
    int volume = 0;

    void ligar(){
        this.ligada = true;
    }

    void desligar(){
        this.ligada = false;
    }

    void silenciar(){
        this.silenciado = true;
    }

    void dessilenciar(){
        this.silenciado = false;
    }

    void aumentarVolume(){
        this.volume++;
    }

    void diminuirVolume(){
        this.volume--;
    }

    void proximoCanal(){
        canalAtual++;
    }

    void anteriorCanal(){
        canalAtual--;
    }

    void selecionarCanal(int canal){
        canalAtual = canal;
    }

    void estadoTelevisao(){
        if(this.ligada){
            System.out.printf("A televisao encontra-se ligada\n");
            System.out.printf("Volume: %d\n", this.volume);
            System.out.printf("Canal: %d\n", this.canalAtual);
            if(this.silenciado){
                System.out.printf("Silenciado: sim\n\n");
            }
            else{
                System.out.printf("Silenciado: nao\n\n");
            }
        }
        else{
            System.out.printf("A televisao encontra-se desligada\n");
        }
    }



    
}
