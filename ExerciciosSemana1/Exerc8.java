package ExerciciosSemana1;
// Um quadrado mágico é uma matriz quadrada, de valores inteiros, na qual a soma dos elementos de cada linha, a soma dos elementos de cada coluna e a soma dos elementos da diagonal primária e da diagonal secundária são iguais. A matriz quadrada de ordem 4 abaixo é um exemplo de quadrado mágico, no qual todas as somas são iguais a 34:

//                   [4][14][15][1] 
//                   [9][7][6][12] 
//                   [5][11][10][8] 
//                   [16][2][3][13] 

// Desenvolva um programa que leia do usuário uma matriz quadrada de ordem n e imprima se a matriz é um quadrado mágico ou não


import java.util.Scanner;

public class Exerc8 { 
    public static void main(String[] args){
        int n;
        int somaDigPrincipal = 0, somaDigSecundaria = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira o tamanho da matriz");
        n = teclado.nextInt();
        
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n;i++){    //ler matriz
            for (int j = 0; j < n; j++){
                System.out.printf("Insira o valor da posicao [%d][%d]", i, j);
                matriz[i][j] = teclado.nextInt();
            }
        }

        for (int i = 0; i < n;i++){    //pegar a soma da diagonal principal
                somaDigPrincipal += matriz[i][i];
        }

        for(int i = 0; i < n; i++){    //pegar soma da diagonal secundária
            somaDigSecundaria += matriz[i][n - 1 - i];
        }

        if (somaDigPrincipal != somaDigSecundaria){
            System.out.print("Nao eh um quadrado mágico");
            System.exit(0);
        }

        for (int i = 0; i < n; i++){    //Pegar soma das linhas e verificar
            int somaLinha = 0;
            for (int j = 0; j < n; j++){
                somaLinha += matriz[i][j];
            }
            if(somaLinha != somaDigPrincipal){
                System.out.print("Nao eh um quadrado magico");
                System.exit(0);
            }
        }

        for (int i = 0; i < n; i++){
            int somaColuna = 0;
            for(int j = 0; j < n; j++){
                somaColuna += matriz[j][i];
            }
            if(somaColuna != somaDigPrincipal){
                System.out.print("Nao eh um quadrado magico");
                System.exit(0);
            }
        }

        System.out.print("Eh um quadrado magico!");
        teclado.close();
    }

}


