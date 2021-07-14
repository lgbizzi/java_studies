/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digital.innovation.one;

import java.util.function.Function;

/**
 *
 * @author Luís Guilherme Ferreira Bizzi - https://github.com/lgbizzi
 */
public class Funcoes {
    public static void main(String[] args){
        Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converterStringParaInteiroECalcularODobro = string -> Integer.valueOf(string) * 2;
        System.out.println(retornarNomeAoContrario.apply("Joao"));
        System.out.println(converterStringParaInteiroECalcularODobro.apply("20"));
    }
    
}
