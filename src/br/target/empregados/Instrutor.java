package br.target.empregados;

public class Instrutor extends Empregado {

	double horasTrabalhadas = 0.0;
	double valorHora = 0.0;
	
	@Override
	public double calcularRendimentos() {
		// TODO Auto-generated method stub
		return horasTrabalhadas * valorHora;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
}
