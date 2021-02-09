import java.util.Scanner;

class Exerc3 {
    public static void main(String[] args){
        int soma = 0;
        for(int i=1; i<1000; i++){
            soma += i;          
        }

        System.out.printf("A soma de 1 ate 999 = %d", soma);
    }
}
