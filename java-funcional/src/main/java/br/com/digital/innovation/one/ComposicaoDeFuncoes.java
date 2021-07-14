/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digital.innovation.one;

import java.util.Arrays;

/**
 *
 * @author Luís Guilherme Ferreira Bizzi - https://github.com/lgbizzi
 */
public class ComposicaoDeFuncoes {
    public static void main(String[] args){
        int[] valores = {1, 2, 3, 4};

        //funcional
        Arrays.stream(valores)
                .filter(numero -> numero % 2 ==0)
                .map(numero -> numero * 2)
                .forEach(numero -> System.out.println(numero));
        
        //imperativo
        for (int i = 0; i < valores.length; i++){
            int valor = 0;
            if (valores[i]%2 == 0){
                valor = valores[i] * 2;
                
                if (valor != 0){
                    System.out.println(valor);
                }
            }
        }
    }    
}
