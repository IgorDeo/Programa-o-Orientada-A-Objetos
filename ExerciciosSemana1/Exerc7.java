package ExerciciosSemana1;
// O setor que terceiriza o restaurante de uma empresa realizou uma pesquisa com os funcionários pedindo que cada um avaliasse a qualidade das refeições informando uma nota de 0 a 100. O setor quer saber o percentual de funcionários que considera as refeições péssimas (nota entre 0 e 25), ruins (nota acima de 25 e até 50), boas (nota acima de 50 e até 75) e ótimas (acima de 75 até 100). Escreva um programa que leia as notas informadas e imprima o percentual de funcionários que votou em cada faixa. A entrada de dados deve terminar quando for lido um valor que não pertença a nenhum dos intervalos acima.

import java.util.Scanner;

public class Exerc7 {
    public static void main(String[] args) {
        float inserido, total = 0;
        float pessimas = 0, ruins = 0, boas = 0, otimas = 0;
        float percPessimas, percRuins, percBoas, percOtimas;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira a nota dada pelos funcionarios(digite um numero maior do que 100 para encerrar a insercao de dados)");
        
        while (true){
            inserido = teclado.nextInt();
            if(inserido < 0 || inserido > 100){
                break;
            }
            else if(inserido >= 0 && inserido <= 25){
                pessimas++;
            }
            else if(inserido >= 26 && inserido <= 50){
                ruins++;
            }
            else if(inserido >= 51 && inserido <= 75){
                boas++;
            }
            else if(inserido >= 76 && inserido <= 100){
                otimas++;
            }
            total++;
        }
        percPessimas = (pessimas/total)*100;
        percRuins = (ruins/total)*100;
        percBoas = (boas/total)*100;
        percOtimas = (otimas/total)*100;

        System.out.printf("A porcentagem de funcionarios que consideram o restaurante pessimo é: %.2f\n", percPessimas);
        System.out.printf("A porcentagem de funcionarios que consideram o restaurante ruim é: %.2f\n", percRuins);
        System.out.printf("A porcentagem de funcionarios que consideram o restaurante bom é: %.2f\n", percBoas);
        System.out.printf("A porcentagem de funcionarios que consideram o restaurante otimo é: %.2f\n", percOtimas);

        teclado.close();
    }
    
}
