// Escreva um programa que recebe como parâmetro um número inteiro n. A função deve ler n valores do teclado e retornar quantos destes valores são negativos.
import java.util.Scanner;

class Exerc1{
    public static void main(String[] args){
        int n, negativos = 0, vez;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva a qtd");
        
        n = teclado.nextInt();

        for (int i = 0; i < n; i++){
            vez = teclado.nextInt();
            if (vez < 0){
                negativos++;
            }
        }
        System.out.printf("A quantidade de negativos é %d", negativos);
        teclado.close();

    }
}