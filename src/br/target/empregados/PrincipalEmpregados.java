package br.target.empregados;

import java.util.ArrayList;
import java.util.List;

public class PrincipalEmpregados {
	
	public static void main(String[] args) {
		
		Vendedor vendedorVariavel = new Vendedor();
		vendedorVariavel.setNome("Juca Bala");
		
		Gerente gerenteVariavel = new Gerente();
		gerenteVariavel.setNome("Gerentão");
		
		//Polimorfismo
		//Recebivel recebivel = new Gerente();
		
		List<Empregado> empregados = new ArrayList<Empregado>();
		empregados.add(vendedorVariavel);
		empregados.add(gerenteVariavel);
		
		for (Empregado empregado : empregados) {
			empregado.calcularRendimentos();
			empregado.getNome();
		}
	}
	
}
