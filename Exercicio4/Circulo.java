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
public class Circulo extends FiguraGeometrica {
    protected float pi = (float)3.14;

    public void calcularArea(float raio){
        float temp = (float)Math.pow(raio,2);
        this.area = pi*temp;
        System.out.printf("A area do circulo de raio %.2f é %.2f\n", raio, this.area);
    }
    
    public void calcularPerimetro(float raio){
        this.perimetro = 2*pi*raio;
        System.out.printf("O perimetro do circulo de raio %.2f é %.2f\n",raio, this.perimetro);
    }
}
