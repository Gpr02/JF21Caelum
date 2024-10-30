package br.com.caelum.exercicios;

public class Calculadora {
	
	//soma
	public double somar (double num1,double num2 ) {
	return num1 + num2;	
	}
	
	//subtração
	public double subtracao (double num1, double num2) {
		return num1 - num2;
	}
	
	//multiplicação
	public double multiplicacao (double num1, double num2) {
		return num1 * num2;
	}
	
	//divisão
	public double divisao(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("Erro divisão por zero.");
			return Double.NaN;
		} 
		return num1 / num2;
		
	}
	
	
	
	
	
	

}
