package com.laiane.cursojava.aula13;

import java.util.Scanner;

public class Exer8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com o valor/hora");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre com a quantidade de hora trabalhadas no mês:");
		double horas = scan.nextDouble();
		
		double salario = valorHora * horas;
		
		System.out.print("O salário é de: " + salario);

	}

}
