package com.laiane.cursojava.aula13;

import java.util.Scanner;

public class Exer09 {

	private static final int F = 0;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com a temperatura em Farenheit:");
		double f = scan.nextDouble();
		
		double c = (5 * (f-32) / 9);
		
		System.out.println("A temperatura " + f + "F é igual a" + c + "C");

	}

}
