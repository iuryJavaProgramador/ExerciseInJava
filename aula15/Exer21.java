package com.laiane.cursojava.aula15;

import java.util.Scanner;

public class Exer21 {

	private static double precoAlc;

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com a quantidade de litros vendidos");
			double Litros = scan.nextDouble();
			
			System.out.println("Entre com o tipo de combustivel");
			String tipo = scan.next();
			
			double precoGas = 2.5;
			double precoAlc = 1.9;
			int percDesconto = 0;
			double total = 0;
			double totalDesco = 0;
			
			if (tipo.equalsIgnoreCase("a")){
				
				if (Litros <= 20){
					percDesconto = 3;
				} else {
					percDesconto = 5;
				}
				
				total = Litros * precoAlc;
				
			
			} else if (tipo.equalsIgnoreCase("g")){		
			
				if (Litros <= 20){
					percDesconto = 4;
				} else {
					percDesconto = 6;
				}
      
			    total = Litros * precoGas;
			    	
			}
			
			totalDesco = (total / 100) * percDesconto;
			
			double precoAPagar = total - totalDesco;
			
			System.out.println("Valor a ser pago: " + precoAPagar);
		}
	
	}
}
