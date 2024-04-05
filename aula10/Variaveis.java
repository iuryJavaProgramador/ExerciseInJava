package com.laiane.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
	    //convenção Java
		int idade = 20;
	    String nome = "Pantera";
        String nomeDoMeuCachorro = "Pantera";
        String ano2023 = "2023";
                
        //aceito, mas não utilizada
        int _idade;
        int $idade;
       
        // não é uma convenção java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeucachorro;
         
        idade = 25; 
         
        System.out.println("Idade = " + idade);
        System.out.println("Nome = " + nome);
        
        // má prática
        int a = 10;
        String b = "Pantera";	
	}

}
