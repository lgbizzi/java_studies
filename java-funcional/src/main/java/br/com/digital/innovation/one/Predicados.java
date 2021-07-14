package br.com.digital.innovation.one;

import java.util.function.Predicate;

/**
 *
 * @author Luís Guilherme Ferreira Bizzi - https://github.com/lgbizzi
 */
public class Predicados {
    public static void main(String[] args){
        Predicate<String> estaVazio = valor -> valor.isEmpty();
        
        /*Predicate<String> estaVazio = String::isEmpty;                        //Funciona da mesma forma
        
        Predicate<String> estaVazio = valor -> {                                //Também funciona da mesma forma
            return valor.isEmpty();
        }*/
        
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Joao"));
    }    
}
