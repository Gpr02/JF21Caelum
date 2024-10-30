package br.com.caelum.exercicios;

public class Bancario {
	public String titular;
	public int numero;
	public double saldo;
	
	public Bancario (String titular, int numero,double saldo ) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void depositarDinheiro ( double ldo) {
		this.saldo += ldo;
		System.out.println("Deposito de " + ldo + " foi efetuado com sucesso");
	}
	
	public void sacarDinheiro (double ldo) {
		if (ldo <= this.saldo) { 
			this.saldo -= ldo;
		System.out.println("O saque de " + ldo + " foi efetuado com sucesso.");}
		else {
			System.out.println("Saldo insuficiente");
		}
		
	}
	
	public void consultarSaldo () {
		System.out.println("O nome do titular é " + this.titular);
		System.out.println("O número da conta do cliente é " + this.numero);
		System.out.println("O saldo disponível é de " + this.saldo );
	}

}
