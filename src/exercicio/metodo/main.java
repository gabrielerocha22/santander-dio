package exercicio.metodo;

public class main {

	public static void main(String[] args) {
		
		System.out.println("Exercicio Calculadora:");
		
		ExercicioMetodos.soma(2,3);
		ExercicioMetodos.subtracao(5,2);
		ExercicioMetodos.multiplicacao(2,5);
		ExercicioMetodos.divisao(6,2);
		
		System.out.println("Exercício Horário:");
		
		Horario.obterHorario(10);
		Horario.obterHorario(5);
		Horario.obterHorario(12);
		Horario.obterHorario(24);
		Horario.obterHorario(56);
		
		System.out.println("Exercíco Empréstimo:");
		/*Emprestimo.calcula(valor: 1000, Emprestimo.getDuasParcelas());*/
		Emprestimo.calcula(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcula(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcula(1000, 5);
		
		
		System.out.println("Exercício Calcular Área:");
		AreaQuadrilatero.calculaAreaQuadrado(2, 2);
		AreaQuadrilatero.calculaAreaRetangulo(5, 2);
		AreaQuadrilatero.calculaAreatrapezio(3, 3, 2);
		
		System.out.println("Exercício Return: ");
		double areaQuadrado  = AreaQuadrilateroReturn.area(2,3);
		double areaRetangulo = AreaQuadrilateroReturn.area(2,3);
		double areaTrapezio  = AreaQuadrilateroReturn.area(6, 3, 2);
		System.out.println(areaQuadrado);
		System.out.println(areaRetangulo);
		System.out.println(areaTrapezio);
		
		

		
	}
	
		
		

}
