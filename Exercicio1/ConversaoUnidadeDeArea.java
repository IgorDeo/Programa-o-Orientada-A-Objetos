/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

/**
 *
 * @author igord
 */
public class ConversaoUnidadeDeArea {

    public static double MetroQuadradoParaPesQuadrados(double areaMetro){
        double areaPe = areaMetro * 10.76;

        return areaPe;
    }

    public static double PesQuadradosParaMetroQuadrado(double areaPe){
        double areaMetro = areaPe / 10.76;

        return areaMetro;
    }

    public static double PesQuadradosParaCmQuadrado(double areaPe){
        double areaCm = areaPe * 929;

        return areaCm;
    }

    public static double CmQuadradoParaPesQuadrados(double areaCm){
        double areaPe = areaCm / 929;

        return areaPe;
    }

    public static double MilhaParaAcre(double areaMilha){
        double areaAcre = areaMilha * 640;

        return areaAcre;
    }

    public static double AcreParaMilha(double areaAc){
        double areaMilha = areaAc / 640;

        return areaMilha;
    }

    public static double AcreParaPesQuadrados(double areaAcre){
        double areaPe = areaAcre * 43560;

        return areaPe;
    }

    public static double PesQuadradosParaAcre(double areaPe){
        double areaAc = areaPe / 43560;

        return areaAc;
    }
}
