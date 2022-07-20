package com.dio.estruturas;

import java.util.Scanner;

public class EstruturasRepeticaoTabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int numero;
		
			System.out.println("Digite o número a ser calculado na tabuada:");
			numero = scan.nextInt();
			System.out.println("Resultado da tabuada de " + numero);
			for (int count = 1; count <= 10; count++ ) {
				System.out.println(numero + " X " + count + " = " + (numero*count));
			
			}
				
	}

}
