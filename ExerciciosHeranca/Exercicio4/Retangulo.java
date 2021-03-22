/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4;

/**
 *
 * @author igord
 */
public class Retangulo extends FiguraGeometrica {
    
    
    public void calcularArea(float lado1, float lado2){
        this.area = lado1*lado2;
        System.out.printf("A area do retangulo de lados %.2f e %.2f é igual a %.2f\n", lado1,lado2,this.area);
    }
    
    public void calcularPerimetro(float lado1, float lado2){
        this.perimetro = (lado1+lado2)*2;
        System.out.printf("O perimetro do retangulo de lados %.2f e %.2f é igual a %.2f\n", lado1,lado2,this.perimetro);
        
    }
}
