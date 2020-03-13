package br.target.empregados;

import java.util.Scanner;

public class ProgramaEmpregados {

	public void executar() {

		while (true) {
			System.out.println("***Iniciando Programa de Sal�rios:");
			System.out.println("***\t1 - Vendedor");
			System.out.println("***\t2 - Instrutor");
			System.out.println("***\t3 - Gerente");
			System.out.println("***\t0 - Sair");

			Scanner sc = new Scanner(System.in);

			OpcoesEntrada tipo = OpcoesEntrada.obtemEntrada(sc.nextInt());

			System.out.println("Voc� digitou: " + tipo);

			boolean interromperPrograma = false;

			Empregado empregado = null;

			if(OpcoesEntrada.VENDEDOR.equals(tipo)) {
				
				System.out.println("Entrando na l�gica do Vendedor");

				System.out.println("Informe a comiss�o:");
				double comissao = sc.nextDouble();

				System.out.println("Informe o valor das vendas:");
				double valorVendas = sc.nextDouble();

				empregado = new Vendedor(comissao, valorVendas);
				
			} else if (OpcoesEntrada.INSTRUTOR.equals(tipo)) {
				
				System.out.println("Entrando na l�gica do Instrutor");
				Instrutor instrutor = new Instrutor();
				System.out.println("Informe o valor hora:");
				instrutor.setValorHora(sc.nextDouble());
				System.out.println("Informe as horas trabalhadas:");
				instrutor.setHorasTrabalhadas(sc.nextDouble());

				empregado = instrutor;
				
			} else if (OpcoesEntrada.GERENTE.equals(tipo)) {
				
				System.out.println("Entrando na l�gica do Gerente");
				new Gerente();
				
			} else if(OpcoesEntrada.SAIR.equals(tipo)) {
				
				interromperPrograma = true;
				
			} else {
				
				System.out.println("ENTRADA INV�LIDA!!!");
				
			}

			if (interromperPrograma) {
				System.out.println("Interrompendo execu��o do programa......");
				break;
			}

			empregado.setNome(sc.next());

			double valorRendimentos = empregado.calcularRendimentos();

			System.out.println("Os rendimentos de " + empregado.getNome() + " s�o de: " + valorRendimentos);
		}
	}
}
