package br.com.caelum.exercicios;
import java.util.Scanner;
public class TestaExercicio {

	public static void main(String[] args) {
		
		/*Produto p = new Produto("Sandália", 10, 12.5);
		Produto c = new Produto("Fusca",10,10.000);
		
		p.exibirInformacoes();
		p.removerEstoque(9);
		p.exibirInformacoes();
		
		
		c.exibirInformacoes();
		c.removerEstoque(9);
		c.exibirInformacoes();*/
		
		/*Aluno a = new Aluno("gustavo",1);
		
		a.adicionarNota(8.5);
		a.adicionarNota(8.5);
		a.adicionarNota(8.5);
		a.adicionarNota(8.5);*/
		
		/*Livro l = new Livro("gustavo","o menino maluquimho");
		
		l.emprestar();
		l.verificarDisponibilidade();
		l.devolver();*/
		
		Scanner sc = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		
		System.out.println("digite um número: ");
		double num1 = sc.nextDouble();
		
		System.out.println("digite um número: ");
		double num2 = sc.nextDouble();
		
		System.out.println("Escolha a operação (+,-,*,/): ");
		char operacao = sc.next().charAt(0);
		
		double resultado = 0;
		boolean operacaoValida = true;
		
		switch(operacao) {
		case '+':
			resultado = calc.somar(num1, num2);
			break;
		case '-':
			resultado = calc.subtracao(num1, num2);
			break;
		case '*':
			resultado = calc.multiplicacao(num1, num2);
			break;
		case '/':
			resultado = calc.divisao(num1, num2);
			break;
		}
		
		
		if(operacaoValida) {
			System.out.println("O resultado da operação é: " + resultado);
		}
		
		sc.close();
		
			 

	}

}
