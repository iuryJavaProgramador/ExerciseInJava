package com.laiane.cursojava.aula19;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		
		for (int i=0; i<vetorA.length; i++){
			
			System.out.println("Entre com o valor da posição: " + i);
			vetorA[i] = scan.nextInt();
	
			vetorB[i] = vetorA[i] * vetorA[i];
			
			System.out.println("Vetor A = ");
			for (int i1=0; i1<vetorA.length; i1++){
					System.out.println(vetorA[i1] + ""); 
			}
				System.out.println();
				
				
				
		    System.out.println("Vetor B = ");
		    for (int i1=0; i1<vetorB.length; i1++){
					System.out.println(vetorB[i1] + " "); 
			}
			System.out.println();
			}

	}

	}

