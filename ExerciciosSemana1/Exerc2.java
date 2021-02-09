package ExerciciosSemana1;
// Escreva um programa que efetue a leitura de três valores reais R, S e T, imprimindo qual deles é o maior

import java.util.Scanner;

public class Exerc2{
    
    public static void main(String[] args){

        float r, s, t;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de R, S, T");
        r = teclado.nextFloat();
        s = teclado.nextFloat();
        t = teclado.nextFloat();

        if(r > s && r > t){
            System.out.printf("R é maior que S e T, e vale %.2f.", r);
        }else if(s > t && s > r){
            System.out.printf("S é maior que R e T, e vale %.2f.", s);
        }else{
            System.out.printf("T é maior que R e S, e vale %.2f.", t);
        }

        teclado.close();
    }
}