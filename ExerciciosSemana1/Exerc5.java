package ExerciciosSemana1;

// Escreva um programa recebe um valor N inteiro e que, se N for positivo, retorna o fatorial de N (N!). Se não for possível calcular o fatorial, a função deve imprimir uma mensagem e retornar o valor -1.

import java.util.Scanner;

public class Exerc5 {
    public static int fatorial(int n){
        if (n == 0){
            return 1;
        }
        return n*fatorial(n- 1);
    }
    
    public static void main(String[] args){
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o N para encontrar seu fatorial\n");
        n = teclado.nextInt();

        if(n >= 0){
            System.out.printf("%d", fatorial(n));
        }
        else{
            System.out.println("Nao foi possivel calcular o fatorial");
            System.exit(-1);
        }
        teclado.close();
    }
}


