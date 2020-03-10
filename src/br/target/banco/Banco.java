package br.target.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Conta> contas = new ArrayList<Conta>();
	
	public void depositar(Conta contaParaDeposito, Double valor) {
		
		for(int i = 0; i < contas.size(); i++) {
			Conta conta = contas.get(i);
			
			if(conta.getNumero().equals(contaParaDeposito.getNumero())) {
				Movimento movimentoDeDeposito = new Movimento();
				movimentoDeDeposito.setTipo(0);
				movimentoDeDeposito.setDescricao("Depósito em conta corrente.");
				movimentoDeDeposito.setValor(valor);
				
				conta.getMovimentos().add(movimentoDeDeposito);
				
				break;
			}
		}
	}

	public void sacar() {
		// TODO Auto-generated method stub
		
	}
		
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void imprimirSaldo(Conta c) {
		for(int i = 0; i < contas.size(); i++) {
			Conta conta = contas.get(i);
			
			if(conta.getNumero().equals(c.getNumero())) {
				
				for(int j = 0; j < c.getMovimentos().size(); j++) {
					Movimento movimento = c.getMovimentos().get(j);
					
					if(movimento.getTipo() == 0) {
						System.out.println("Movimento de deposito de: "+ movimento.getValor());
					} else if (movimento.getTipo() == 1){
						System.out.println("Movimento de saque de: "+ movimento.getValor());
					}
				}
			}
		}
	}
}
