package com.dio.estruturas;
import java.util.Scanner;

public class EstruturasRepeticaoMedia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int maiorNumero = 0;
		int media = 0;
		
		int count = 0;
		do {
			System.out.println("Informe o número");
			numero = scan.nextInt();	
			media = media + numero;
			if (numero > maiorNumero) maiorNumero = numero;
			count = count +1;
		} while(count < 5);
		
		System.out.println("Maior número: " + maiorNumero);
		System.out.println("A média dos números fornecidos é igual a: " + (media/5));
	}
}
