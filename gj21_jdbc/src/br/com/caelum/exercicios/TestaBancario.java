package br.com.caelum.exercicios;

public class TestaBancario {

	public static void main(String[] args) {
		Bancario b = new Bancario("Gustavo", 1, 200.00);
		
		b.consultarSaldo();
		b.depositarDinheiro(100.00);
		b.consultarSaldo();
		b.sacarDinheiro(400.00);
		b.consultarSaldo();
		

	}

}
