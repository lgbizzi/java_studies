package br.com.digital.innovation.one;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Luís Guilherme Ferreira Bizzi - https://github.com/lgbizzi
 */
public class Iteracoes {
    
    public static void main(String[] args){
        String[] nomes = {"Luis", "Guilherme", "Ferreira", "Bizzi", "Futuro", "Desenvolvedor"};
        Integer[] numeros = {1, 2, 3, 4, 5, 6};
        imprimirNomesFiltrados(nomes);
        imprimirTodosNomes(nomes);
        imprimirODobro(numeros);
        
        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Testados");
        profissoes.add("Gerente de projeto");
        profissoes.add("Gerente de qualidade");
        
        profissoes.stream()
                .filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);
    }
    
    public static void imprimirNomesFiltrados(String... nomes){
        
        String nomesParaImprimir = "";
        for(int i = 0; i < nomes.length; i++){
            if (nomes[i]. equals("Luis")){
                nomesParaImprimir+=""+nomes[i];
            }
        }
    
        System.out.println("Nomes do For: "+nomesParaImprimir);
        
        //Imprimir as mesmas informações, porém fazendo uso da função Stream
        
        String nomesParaImprimirDaStream = Stream.of(nomes)
                .filter(nome -> nome.equals("Luis"))
                .collect(Collectors.joining());
        
        System.out.println("Nomes da Stream: "+nomesParaImprimirDaStream);
    }
    
    
    public static void imprimirTodosNomes(String... nomes){
        for(String nome : nomes){
            System.out.println("Impresso pelo For: "+nome);
        }
        System.out.println("\n");
        
        Stream.of(nomes)
                .forEach(nome -> System.out.println("Impresso pelo forEach: "+nome));
        System.out.println("\n");
    }
    
    public static void imprimirODobro(Integer... numeros){
        for(Integer numero: numeros){
            System.out.println("O dobro impresso pelo For: "+numero*2);
        }
        System.out.println("\n");
        
        System.out.println("O dobro impresso pelo forEach");
        Stream.of(numeros).map(numero -> numero * 2)
                .forEach(System.out::println);
        System.out.println("\n");
    }

}
