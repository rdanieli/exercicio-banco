package br.target.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Conta> contas = new ArrayList<Conta>();
	
	public void depositar(Conta contaParaDeposito, Double valor) {
		
		for(int i = 0; i < contas.size(); i++) {
			Conta conta = contas.get(i);
			
			if(conta.getNumero().equals(contaParaDeposito.getNumero())) {
				conta.getMovimentos().add(gerarMovimentacao("Depósito em conta corrente.", valor, 0));
				break;
			}
		}
	}

	private Movimento gerarMovimentacao(String descricao, Double valor, Integer tipo) {
		Movimento movimentoDeDeposito = new Movimento();
		movimentoDeDeposito.setTipo(tipo);
		movimentoDeDeposito.setDescricao(descricao);
		movimentoDeDeposito.setValor(valor);
		
		System.out.println("Gerando movimentação...");
		
		return movimentoDeDeposito;
	}
	
	public void sacar(Conta contaDeSaque, Double valor) {
		for(int i = 0; i < contas.size(); i++) {
			Conta conta = contas.get(i);
			
			if(conta.getNumero().equals(contaDeSaque.getNumero())) {
				conta.getMovimentos().add(gerarMovimentacao("Saque em conta corrente.", valor, 1));
				break;
			}
		}
	}
		
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void imprimirSaldo(Conta c) {

		for(Conta conta : contas) {

		
			if(conta.getNumero().equals(c.getNumero())) {
				
				Double saldo = 0.0;
				
				for(Movimento movimento : conta.getMovimentos()){
					if(movimento.getTipo() == 0) {
						saldo += movimento.getValor();
					} else if (movimento.getTipo() == 1){
						saldo -= movimento.getValor();
					}
				}
				
				System.out.println("Seu saldo é: "+ saldo);
			}
		}
	}
}
