package br.target.empregados;

public class Vendedor extends Empregado {

	double comissao = 0.0;
	double valorDasVendas = 0.0;
	
	public Vendedor(double comissao, double valorDasVendas) { 
		this.comissao = comissao;
		this.valorDasVendas = valorDasVendas;
	}
	
	public double calcularRendimentos() {
		return (comissao * valorDasVendas) /100;
	}	
}
