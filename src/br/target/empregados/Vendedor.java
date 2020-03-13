package br.target.empregados;

public class Vendedor extends Empregado {

	double comissao = 0.0;
	double valorDasVendas = 0.0;
	
	public double calcularRendimentos() {
		// TODO Auto-generated method stub
		return comissao * valorDasVendas;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public void setValorDasVendas(double valorDasVendas) {
		this.valorDasVendas = valorDasVendas;
	}
	
}
