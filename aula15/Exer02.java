package com.laiane.cursojava.aula15;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int numero;
		System.out.println("Informe um valor númerico qualquer (positivo ou negativo):");
	    numero = scan.nextInt();
	    if(numero<0) {
		    numero = numero*3;
		    System.out.println("O valor informado é negativo");
	    }else {	
	        numero = numero*5;
	        System.out.println("O valor informado é positivo");
	    } 
    
	}	
}