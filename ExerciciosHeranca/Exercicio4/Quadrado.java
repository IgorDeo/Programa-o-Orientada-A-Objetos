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
public class Quadrado extends Retangulo {
    
    public void calcularArea(float lado){
        this.area = lado*lado;
        System.out.printf("A area do quadrado de lado %.2f é igual a %.2f\n", lado,this.area);
    }
    
    public void calcularPerimetro(float lado){
        this.perimetro = (lado)*4;
        System.out.printf("O perimetro do quadrado de lado %.2f é igual a %.2f\n", lado,this.perimetro);
        
    }
}
