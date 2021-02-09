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
        int soma_dig_principal = 0, soma_dig_secundaria = 0;
        Scanner teclado = new Scanner(System.in);
        n = teclado.nextInt();
        int matriz[][] = new int[n][n];

        for (int i = 0; i < n;i++){    //ler matriz
            for (int j = 0; j < n; j++){
                System.out.printf("Insira o valor da posicao [%d][%d]", i, j);
                matriz[i][j] = teclado.nextInt();
            }
        }

        for (int i = 0; i < n;i++){    //pegar a soma da diagonal principal
                soma_dig_principal += matriz[i][i];
        }

        for(int i = 0; i < n; i++){    //pegar soma da diagonal secundária
            soma_dig_secundaria += matriz[i][n - 1 - i];
        }

        if (soma_dig_principal != soma_dig_secundaria){
            System.out.print("Nao eh um quadrado mágico");
            System.exit(0);
        }

        for (int i = 0; i < n; i++){    //Pegar soma das linhas e verificar
            int soma_linha = 0;
            for (int j = 0; j < n; j++){
                soma_linha += matriz[i][j];
            }
            if(soma_linha != soma_dig_principal){
                System.out.print("Nao eh um quadrado magico");
                System.exit(0);
            }
        }

        for (int i = 0; i < n; i++){
            int soma_coluna = 0;
            for(int j = 0; j < n; j++){
                soma_coluna += matriz[j][i];
            }
            if(soma_coluna != soma_dig_principal){
                System.out.print("Nao eh um quadrado magico");
                System.exit(0);
            }
        }

        System.out.print("Eh um quadrado magico!");
    }
}


