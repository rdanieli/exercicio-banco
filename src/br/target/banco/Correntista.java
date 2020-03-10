package br.target.banco;

public class Correntista {
	
	private String nome;
	private Conta conta;
			
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		//this.setNome("Target");
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
}
