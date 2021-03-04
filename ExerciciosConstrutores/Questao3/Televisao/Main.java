package ExerciciosConstrutores.Questao3.Televisao;

public class Main {
    public static void main(String[] args){
        Televisao televisao = new Televisao();

        System.out.println("");

        televisao.estadoTelevisao();

        televisao.ligar();
        televisao.selecionarCanal(35);

        televisao.aumentarVolume();
        televisao.aumentarVolume();

        televisao.estadoTelevisao();

        televisao.proximoCanal();
        televisao.silenciar();

        televisao.estadoTelevisao();

        televisao.dessilenciar();

        televisao.estadoTelevisao();

        televisao.desligar();

        televisao.estadoTelevisao();

    }
}
