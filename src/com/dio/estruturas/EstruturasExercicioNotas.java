package com.dio.estruturas;
import java.util.Scanner;

public class EstruturasExercicioNotas {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int nota;
		System.out.println("Digite uma nota entre 0 e 10: ");
		nota = scan.nextInt();
		
		while (nota < 0  | nota > 10) {
			System.out.println("Nota Inválida! Digite novamente!");
			nota = scan.nextInt();
		}
	}

}
