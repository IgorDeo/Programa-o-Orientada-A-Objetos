/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio9;

/**
 *
 * @author igord
 */
public class Triangulo extends FiguraGeometrica{
    
     public void calcularArea(float base, float altura){
         this.area = (base*altura)/2;
         System.out.printf("A area do triangulo é %.2f\n", this.area);
     }
    public void calcularPerimetro(float lado1, float lado2, float lado3){
        this.perimetro = lado1+lado2+lado3;
        System.out.printf("O perímetro do triangulo é %.2f\n", this.perimetro);
    } 
}   
