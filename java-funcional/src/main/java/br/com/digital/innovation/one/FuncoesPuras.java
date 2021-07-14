/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digital.innovation.one;

import java.util.function.BiPredicate;

/**
 *
 * @author Luís Guilherme Ferreira Bizzi - https://github.com/lgbizzi
 */
public class FuncoesPuras {
    public static void main(String[] args){
        BiPredicate<Integer, Integer> verificarSeEMaior =(parametro, valorComparacao) -> parametro > valorComparacao;
        
        System.out.println(verificarSeEMaior.test(13, 12));
        System.out.println(verificarSeEMaior.test(13, 12));
        
    }
    
}
