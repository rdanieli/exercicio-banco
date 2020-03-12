package br.target.empregados;

public class Vendedor extends Empregado {

	double comissao = 0.0;
	double valorDasVendas = 0.0;
	
	public double calcularRendimentos() {
		// TODO Auto-generated method stub
		return comissao * valorDasVendas;
	}

}
