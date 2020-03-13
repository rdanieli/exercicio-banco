package br.target.empregados;

public enum OpcoesEntrada {
	
	SAIR(-99),
	VENDEDOR(1),
	INSTRUTOR(2),
	GERENTE(3);

	public int opcao;
	
	OpcoesEntrada(int opcao) {
		this.opcao = opcao;
	}	
	
	public int getOpcao() {
		return opcao;
	}

	static OpcoesEntrada obtemEntrada(int tipo) {
		for(int i = 0; i < OpcoesEntrada.values().length; i++) {
			OpcoesEntrada opcoesEntrada = OpcoesEntrada.values()[i];
			
			if (tipo == opcoesEntrada.getOpcao()) {
				return opcoesEntrada;
			}
		}
		
		
		return null;
	}
	
	
}
