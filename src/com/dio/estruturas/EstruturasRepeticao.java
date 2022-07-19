package com.dio.estruturas;
import java.util.Scanner;
public class EstruturasRepeticao {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int idade;
		String aluno;
		
		while (true) {
			System.out.println("Digite o nome do aluno: ");
			aluno = scan.next();			
			if (aluno.equals("0")) break;
	
			System.out.println("Digite a idadea do aluno: ");
			idade = scan.nextInt();
		}			
		
		System.out.println("Fim!");	
	}
}



