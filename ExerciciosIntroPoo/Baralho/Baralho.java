package ExerciciosIntroPoo.Baralho;

public class Baralho {
    Carta[][] cartas = new Carta[4][13];
    
     void insereCarta(Carta carta, int linha, int coluna){ //fazer um loop duplo na main, passando a linha e coluna, para ir inserindo as cartas na matriz, sendo 4 linhas(uma de cada naipe) e 13 colunas(uma cada carta)
        cartas[linha][coluna] = carta;
    }

    
}
