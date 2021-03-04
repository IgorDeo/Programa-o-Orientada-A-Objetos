package ExerciciosConstrutores.Questao3.Baralho;

public class Baralho {
    Carta[][] cartas = new Carta[4][13];
    
     void insereCarta(Carta carta, int linha, int coluna){ //fazer um loop duplo na main, passando a linha e coluna, para ir inserindo as cartas na matriz, sendo 4 linhas(uma de cada naipe) e 13 colunas(uma cada carta)
        cartas[linha][coluna] = carta;
    }

    void imprimeBaralho(){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 13; j++){
                System.out.printf("Carta: %s  %s \n", cartas[i][j].getNaipe(), cartas[i][j].getValor());
            }
            System.out.println("");
        }
        
    }

    void definirValores(){
        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){             
                switch(j){       //essa forma insere a carta na ordem
                    case 0:
                        cartas[i][j].setValor("2");
                        break;
                    case 1:
                        cartas[i][j].setValor("3");
                        break;
                    case 2:
                        cartas[i][j].setValor("4");
                        break;
                    case 3:
                        cartas[i][j].setValor("5");
                        break;
                    case 4:
                        cartas[i][j].setValor("6");
                        break;
                    case 5:
                        cartas[i][j].setValor("7");
                        break;
                    case 6:
                        cartas[i][j].setValor("8");
                        break;
                    case 7:
                        cartas[i][j].setValor("9");
                        break;
                    case 8:
                        cartas[i][j].setValor("10");
                        break;
                    case 9:
                        cartas[i][j].setValor("valete");
                        break;
                    case 10:
                        cartas[i][j].setValor("dama");
                        break;
                    case 11:
                        cartas[i][j].setValor("rei");
                        break;
                    case 12:
                        cartas[i][j].setValor("as");
                        break;
                }   
            }         
        }
    }
    
    void definirNaipes(){
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 13; j++){
                switch(i){
                    case 0:
                        cartas[i][j].setNaipe("copas");
                        break;
                    case 1:
                        cartas[i][j].setNaipe("ouros");
                        break;
                    case 2:
                        cartas[i][j].setNaipe("paus");
                        break;
                    case 3:
                        cartas[i][j].setNaipe("espadas");
                }
                
            }
        }
    }
    
}
