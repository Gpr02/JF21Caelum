package br.com.caelum.exercicios;

public class Aluno {
	public String nome;
	public int matricula;
	public double[] notas;
	public int indiceNotas;
	
	
	public Aluno (String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
		this.notas = new double[4]; // até quatro notas
		this.indiceNotas = 0;
		
	}
	
	public void adicionarNota (double nota) {
			if (indiceNotas <notas.length) {
				notas[indiceNotas++] = nota;
				
			}else {
				System.out.println("total de notas já alcançadas.");
			}	
	}
	
	public double calculaMedia() {
		double soma = 0;
		for (int i = 0; i < indiceNotas; i ++) {
			soma += notas[i];
		}
		return soma / indiceNotas;
		}
	public boolean estaAprovado() {
		return calculaMedia() >= 7;
	}
	public void exibirInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Média: " + calculaMedia());
		System.out.println("Aprovado: " + (estaAprovado() ? "sim" : "não")); //ifternario
	}

}
