/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

/**
 *
 * @author igord
 */
public class Pessoa {
    private  String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, int idade, Pessoa pai, Pessoa mae){
        this.idade = idade;
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public Pessoa(String nome, int idade, String Pai, String Mae){
        this.idade = idade;
        this.nome = nome;
        this.pai = null;
        this.mae = null;
    }

    public void imprimirArvore(){
        System.out.printf("Nome: %s\n", this.getNome());
        System.out.printf("Idade: %s\n", this.idade);

        if(pai != null && mae != null){
            System.out.printf("Pai do(a) %s: %s\n", this.getNome(), this.pai.getNome());
            System.out.printf("Mãe do(a) %s: %s\n", this.getNome(), this.mae.getNome());
        }else{
            System.out.printf("Pai do(a) %s: %s\n", this.getNome(), "Sem registros");
            System.out.printf("Mãe do(a) %s: %s\n", this.getNome(), "Sem registros");
        }

        if(pai != null && mae != null){
            this.pai.imprimirArvore();
            this.mae.imprimirArvore();
        }
    }

    public String getNome(){
        return this.nome;
    }
   
    
}
