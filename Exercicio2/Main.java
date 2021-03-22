/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

/**
 *
 * @author igord
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ConversaoUnidadeDeArea conversor = new ConversaoUnidadeDeArea();
        
        int areaCampoFutebol = 8250; //8250 metros quadrados
        conversor.imprimirTodasAsAreas(areaCampoFutebol);
        
        
    }
}
