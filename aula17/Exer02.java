package com.laiane.cursojava.aula17;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    
	    boolean infoInvalidas = false;
	    String nomeUser;
	    String senha;
	    	
	    do {
	    	
	    	System.out.println("Entre com o nome de usuário:");
	    	nomeUser = scan.next();
	    	
	    	System.out.println("Entre com a senha:");
	    	senha = scan.next();
	    	
	    	if (nomeUser.equalsIgnoreCase(senha)){
	    		//infoValidas = false;
	    	    System.out.println("Senha igual a usuário, digite novamente.");
	    	} else {
	    		var infoValidas = true;
	    		System.out.println("Senha e usuários válidos");
		
	    	} 
	    	
	    	
	    } while (!infoInvalidas);
	   
	}
}
	   
	 
	


