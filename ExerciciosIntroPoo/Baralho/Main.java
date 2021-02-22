package ExerciciosIntroPoo.Baralho;

public class Main {
    public static void main(String[] args){
        Baralho baralho = new Baralho();
        
        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                Carta carta = new Carta();
                baralho.insereCarta(carta, i, j);   
            }
        }

        baralho.definirNaipes();
        baralho.definirValores();
        baralho.imprimeBaralho();
    }
}
