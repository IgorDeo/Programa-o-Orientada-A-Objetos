/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio8;

/**
 *
 * @author igord
 */
public class Par<F, S> {
    private F primeiroElemento; //F == "First"
    private S segundoElemento; //S == "Second"

    public Par(F primeiroElemento, S segundoElemento){
        this.primeiroElemento = primeiroElemento;
        this.segundoElemento = segundoElemento;
    }

    public F getPrimeiroElemento(){
        return this.primeiroElemento;
    }

    public S getSegundoElemento(){
        return this.segundoElemento;
    }
    
    public void setPrimeiroElemento(F novoPrimElem){
        this.primeiroElemento = novoPrimElem;
    }

    public void setSegundoElemento(S novoSegElem){
        this.segundoElemento = novoSegElem;
    }

}