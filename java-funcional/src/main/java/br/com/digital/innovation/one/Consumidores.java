/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digital.innovation.one;

import java.util.function.Consumer;

/**
 *
 * @author Luís Guilherme Ferreira Bizzi - https://github.com/lgbizzi
 */
public class Consumidores {
    public static void main(String[] args){
        
        Consumer<String> imprimirUmaFrase = System.out::println;
        //Consumer<String> imprimirUmaFrase = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello World");
        
    }
}
