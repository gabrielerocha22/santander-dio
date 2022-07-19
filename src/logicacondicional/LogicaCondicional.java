package logicacondicional;

import java.util.Scanner;


public class LogicaCondicional {

	public static void obterMes(int ano) {
		Scanner scan = new Scanner (System.in);
		int a;
		
		System.out.println("Digite o mês no formato numeral exemplo: (1,2,3");
		a = scan.nextInt();
		
		if (a == 1) {
			System.out.println("Janeiro, mês de férias!");
		}
		if (a == 2) {
			System.out.println("Fevereiro");
		}
		if (a == 3) {
			System.out.println("Março");
		}
		if (a == 4) {
			System.out.println("Abril");
		}
		if (a == 5) {
			System.out.println("Maio");
		}
		if (a == 6) {
			System.out.println("Junho, mês de férias");
		}
		if (a == 7) {
			System.out.println("Julho");
		}
		if (a == 8) {
			System.out.println("Agosto");
		}
		if (a == 9) {
			System.out.println("Setembro");
		}
		if (a == 10) {
			System.out.println("Outubro");
		}
		if (a == 11) {
			System.out.println("Novembro");
		}
		if (a == 12) {
			System.out.println("Dezembro, mês de férias!");
		}
		

	}

}
