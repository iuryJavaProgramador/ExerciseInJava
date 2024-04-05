package com.laiane.cursojava.aula19;

import java.util.Scanner;


public class Exer01 {

	public static void main(String[] args) {
		
		try (var scan = new Scanner(System.in)) {
			int[] vetorA = new int[5];
			int[] vetorB = new int[vetorA.length];
			
			/*ENTRAR COM AS INFORMAÇÕES COM O "For"*/
			for (int i=0; i<vetorA.length; i++){
				
				System.out.println("Entre com o valor da posição: " + i);
				vetorA[i] = scan.nextInt();
			}	
			
			for (int i=0; i<vetorA.length; i++){
				vetorB[i] =  vetorA[i];
			}
			
			System.out.println("Vetor A = ");
			for (int i=0; i<vetorA.length; i++){
				System.out.println(vetorA[i] + ""); 
			}
			System.out.println();
			
			
			
			System.out.println("Vetor B = ");
			for (int i=0; i<vetorB.length; i++){
				System.out.println(vetorB[i] + " "); 
			}
		
		
		System.out.println();
		
		}	
		
	
	}	

	}


