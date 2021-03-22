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
public class Main {
    public static void main(String args[]){
        Circulo circulo1 = new Circulo();
        circulo1.calcularArea(2);
        circulo1.calcularPerimetro(2);
        
        Triangulo triangulo1 = new Triangulo();
        triangulo1.calcularArea(2,4);
        triangulo1.calcularPerimetro(2,2,2);
        
        Retangulo retangulo1 = new Retangulo();
        retangulo1.calcularArea(2,6);
        retangulo1.calcularPerimetro(2,6);
        
        Quadrado quadrado1 = new Quadrado();
        quadrado1.calcularArea(3);
        quadrado1.calcularPerimetro(3);
    }
}


