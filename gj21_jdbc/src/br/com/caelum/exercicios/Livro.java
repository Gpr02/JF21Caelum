package br.com.caelum.exercicios;

public class Livro {
	
	private String autor; 
	private String titulo;
	private boolean emprestado; // LIvro disponível false
	
	public Livro(String autor, String titulo) {
		this.autor = autor;
		this.titulo = titulo;
		this.emprestado = false;
		}
	
	public void emprestar() {
		if(!emprestado) {
			System.out.println("Livro Disponível");
			emprestado = true;
		} else {
			System.out.println("Livro emprestado");
		}
	}
	
	public void devolver() {
		if(emprestado) {
			emprestado = false;
			System.out.println("Livro devolvido.");
		}else {
			System.out.println("O livro já esta na biblioteca");
		}
	}
	
	public void verificarDisponibilidade() {
		System.out.println("Titulo: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Disponibilidade: " + (emprestado ? "indisponível" : "Dísponivel"));
	}
	
	
	

}
