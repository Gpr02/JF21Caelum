package br.com.caelum.exercicios;

public class Produto {
	
	// variáveis e seus tipos
	
	public String nome;
	public int quantidade;
	public double preco;
	
	//método construtor
	public Produto (String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	//adiciona quantidade ao estoque
	public void adicionaEstoque(int qtd) {
		this.quantidade += qtd;
		}
	
	//remover quantidade do estoque
	public void removerEstoque(int qtd) {
		this.quantidade -= qtd;
	}
	
	//calcular o valor total de todos os produtos do estoque
	public double calculaEstoque() {
		return this.quantidade * this.preco; 
	}
	
	// classe para printar na tela
	public void exibirInformacoes() {
	System.out.println("Nome do produto: " + this.nome);
	System.out.println("Quantidade do estoque: " + this.quantidade);
	System.out.println("Preço do estoque: " + this.preco);
	}
	
	

	

}
