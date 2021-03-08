package ExerciciosConstrutores.Questao3.Celular;
import java.util.Scanner;

public class Celular {
    Bateria bateria = new Bateria();
    Scanner teclado = new Scanner(System.in);
    
    void enviarMensagem(){ //consome uma unidade de carga
        if((bateria.getNivelDeCarga() - 1) >= 0){
            System.out.println("Digite o numero para o qual gostaria de enviar a mensagem: ");
            teclado.nextLine();
            System.out.println("Digite a mensagem que gostaria de enviar: ");
            teclado.nextLine();
            bateria.setNivelDeCarga(bateria.getNivelDeCarga() - 1);
        }
        else{
            System.out.println("Bateria insuficiente para enviar a mensagem");
            System.out.println("Por favor, recarregue o celular");
        }

    }

    void fazerLigacao(int duracao){ //consome 5 unidades de carga por segundo de ligacao
        int consumo = 5 * duracao;
        if ((bateria.getNivelDeCarga() - consumo) >= 0){
            System.out.println("Digite o numero para o qual deseja ligar: ");
            teclado.nextLine();
            bateria.setNivelDeCarga(bateria.getNivelDeCarga() - consumo);
        }
        else{
            System.out.println("Bateria insuficiente para realizar a ligacao");
            System.out.println("Por favor, recarregue o celular");
        }

    }

 
    void recarregarBateria(){
        bateria.setNivelDeCarga(1000);
        System.out.println("Bateria completamente recarregada!");
    }

    void nivelDeCarga(){
        System.out.printf("Bateria atual: %d \n", bateria.getNivelDeCarga());
    }

}
