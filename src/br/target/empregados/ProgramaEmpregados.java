package br.target.empregados;

import java.util.Scanner;

public class ProgramaEmpregados {
	
	public void executar() {
		
		while(true) {
			System.out.println("***Iniciando Programa de Salários:");
			System.out.println("***\t1 - Vendedor");
			System.out.println("***\t2 - Instrutor");
			System.out.println("***\t3 - Gerente");
			System.out.println("***\t0 - Sair");
			
			Scanner sc = new Scanner(System.in);
			
			int tipo = sc.nextInt();
			
			System.out.println("Você digitou: " + tipo);
			
			boolean interromperPrograma = false;
			
			Empregado empregado = null;
			
			switch (tipo) {
			case 1:
				System.out.println("Entrando na lógica do Vendedor");
				
				System.out.println("Informe a comissão:");
				double comissao = sc.nextDouble();
				
				System.out.println("Informe o valor das vendas:");
				double valorVendas = sc.nextDouble();
				
				empregado = new Vendedor(comissao, valorVendas);
				break;
			case 2:
				System.out.println("Entrando na lógica do Instrutor");
				Instrutor instrutor = new Instrutor();
				System.out.println("Informe o valor hora:");
				instrutor.setValorHora(sc.nextDouble());
				System.out.println("Informe as horas trabalhadas:");
				instrutor.setHorasTrabalhadas(sc.nextDouble());
				
				empregado = instrutor;
				break;
			case 3:
				System.out.println("Entrando na lógica do Gerente");
				new Gerente();
				break;
			case 0:
				interromperPrograma = true;
				break;
			default:
				System.out.println("ENTRADA INVÁLIDA!!!");
				break;
			}
			
			if(interromperPrograma) {
				System.out.println("Interrompendo execução do programa......");
				break;
			}
						
			empregado.setNome(sc.next());
			
			double valorRendimentos = empregado.calcularRendimentos();
			
			System.out.println("Os rendimentos de " + empregado.getNome() + " são de: " + valorRendimentos);
		}
	}
}
