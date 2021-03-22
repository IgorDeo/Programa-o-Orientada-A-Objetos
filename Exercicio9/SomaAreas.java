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
import java.util.ArrayList;

public class SomaAreas {
    private ArrayList<FiguraGeometrica> listaFormas = new ArrayList<FiguraGeometrica>();

    public void adicionarElemento(FiguraGeometrica forma){
        listaFormas.add(forma);
    }

    public double somaAreasLista(){
        double soma = 0;

        for(FiguraGeometrica forma : listaFormas){
            soma += forma.getArea();
        }

        return soma;
    }
}