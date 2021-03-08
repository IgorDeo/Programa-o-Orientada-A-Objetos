package ExerciciosConstrutores.Questao3.Televisao;

public class Televisao {
    private boolean silenciado = false;
    private boolean ligada = false;
    private int canalAtual = 0;
    private int volume = 0;

    public void ligar(){
        this.ligada = true;
    }

    public void desligar(){
        this.ligada = false;
    }

    public void silenciar(){
        this.silenciado = true;
    }

    public void dessilenciar(){
        this.silenciado = false;
    }

    public void aumentarVolume(){
        this.volume++;
    }

    public void diminuirVolume(){
        this.volume--;
    }

    public void proximoCanal(){
        canalAtual++;
    }

    public void anteriorCanal(){
        canalAtual--;
    }

    public void selecionarCanal(int canal){
        canalAtual = canal;
    }

    public void estadoTelevisao(){
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
