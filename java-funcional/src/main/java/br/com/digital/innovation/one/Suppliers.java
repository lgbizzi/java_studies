package br.com.digital.innovation.one;

import java.util.function.Supplier;

/**
 *
 * @author Luís Guilherme Ferreira Bizzi - https://github.com/lgbizzi
 */
public class Suppliers {
    public static void main(String[] args){
        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
        Supplier<Pessoa> instanciaPessoa2 = Pessoa::new;
        
        System.out.println(instanciaPessoa.get());
        System.out.println(instanciaPessoa2.get());
    }
}

class Pessoa{
    private String nome;
    private Integer idade;
    
    public Pessoa(){
        nome = "joao";
        idade = 23;
    }
    
    @Override
    public String toString(){
        return String.format("nome: %s, idade: %d", nome, idade);
    }
}
