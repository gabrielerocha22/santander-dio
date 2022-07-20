package com.dio.estruturas;

import java.util.Scanner;

public class EstruturasArraysConsoantes {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String [] consoantes = new String [6];
		int quantConsoantes = 0;
		
		int count =0;
		do {
			System.out.println("Digite a letra: ");
			String letra = scan.next();
			
			if (!(letra.equalsIgnoreCase("a") || /*equalsIgnoreCase desconsidera o casesensitive*/
					letra.equalsIgnoreCase("e") ||
					letra.equalsIgnoreCase("i") ||
					letra.equalsIgnoreCase("o") ||
					letra.equalsIgnoreCase("u")))
					 {
				consoantes[count] = letra;
				quantConsoantes++;
			}
			
			count++;
			
		} while (count < consoantes.length);

		System.out.println("\nConsoantes: ");
		for (String consoante : consoantes) {
			if (consoante != null) {
				System.out.println(consoante);
			}
		}

		System.out.println("Quantidade: " + quantConsoantes);
	}

}
