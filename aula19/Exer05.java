package com.laiane.cursojava.aula19;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		
		for (int i=0; i<vetorA.length; i++){
			
			System.out.println("Entre com o valor da posição: " + i);
			vetorA[i] = scan.nextInt();
	
			vetorB[i] =  vetorA[i] * i;
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

		

