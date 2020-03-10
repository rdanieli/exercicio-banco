package br.target.banco;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		Banco nuBank = new Banco();
		
		List<Conta> minhasContasDoBanco = new ArrayList<Conta>();
		
		minhasContasDoBanco.add(new Conta(123, 001));
		minhasContasDoBanco.add(new Conta(456, 001));
		minhasContasDoBanco.add(new Conta(951, 001));
		
		nuBank.setContas(minhasContasDoBanco);
		
		Conta c = new Conta(951, 001);
		
		nuBank.depositar(c, 120.0);
		
		nuBank.imprimirSaldo(c);
		//nuBank.sacar(...);
	}
}
