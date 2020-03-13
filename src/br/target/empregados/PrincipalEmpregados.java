package br.target.empregados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalEmpregados {
	
	public static void main(String[] args) {
		
		PrincipalEmpregados pe = new PrincipalEmpregados();
		pe.executar();
	}

	private void executar() {
		
		while(true) {
			System.out.println("***Iniciando Programa de Sal�rios:");
			System.out.println("***\t1 - Vendedor");
			System.out.println("***\t2 - Instrutor");
			System.out.println("***\t3 - Gerente");
			System.out.println("***\t0 - Sair");
			
			Scanner sc = new Scanner(System.in);
			
			int tipo = sc.nextInt();
			
			System.out.println("Voc� digitou: " + tipo);
			
			boolean interromperPrograma = false;
			
			Empregado empregado = null;
			
			switch (tipo) {
			case 1:
				System.out.println("Entrando na l�gica do Vendedor");
				Vendedor vendedor = new Vendedor();
				System.out.println("Informe a comiss�o:");
				vendedor.setComissao(sc.nextDouble());
				System.out.println("Informe o valor das vendas:");
				vendedor.setValorDasVendas(sc.nextDouble());
				
				empregado = vendedor;
				break;
			case 2:
				System.out.println("Entrando na l�gica do Instrutor");
				Instrutor instrutor = new Instrutor();
				System.out.println("Informe o valor hora:");
				instrutor.setValorHora(sc.nextDouble());
				System.out.println("Informe as horas trabalhadas:");
				instrutor.setHorasTrabalhadas(sc.nextDouble());
				
				empregado = instrutor;
				break;
			case 3:
				System.out.println("Entrando na l�gica do Gerente");
				new Gerente();
				break;
			case 0:
				interromperPrograma = true;
				break;
			default:
				System.out.println("ENTRADA INV�LIDA!!!");
				break;
			}
			
			if(interromperPrograma) {
				System.out.println("Interrompendo execu��o do programa......");
				break;
			}
			
			empregado.setNome(sc.next());
			
			double valorRendimentos = empregado.calcularRendimentos();
			
			System.out.println("Os rendimentos de " + empregado.getNome() + " s�o de: " + valorRendimentos);
		}
	}
	
}
