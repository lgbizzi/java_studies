/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digital.innovation.one;

/**
 *
 * @author Luís Guilherme Ferreira Bizzi - https://github.com/lgbizzi
 */
public class FuncaoAltaOrdem {
    public static void main(String[] args){
        Calculo soma = (a, b) -> a+b;
            System.out.println(executarOperacao(soma, 1, 3));
    }
    
    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a,b);
    }
    
    interface Calculo{
        public int calcular(int a, int b);
    }
}
