/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio7;

/**
 *
 * @author igord
 */
public enum DiaDaSemana {
    DOMINGO,
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO;

    public static boolean ehDiaUtil(DiaDaSemana dia){
        if(dia != DOMINGO && dia != SABADO){
            return true;
        }else{
            return false;
        }
    }
}
