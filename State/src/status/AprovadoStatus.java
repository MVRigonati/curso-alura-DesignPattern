package status;

import model.Orcamento;

public class AprovadoStatus implements Status {

	public double descontoExtra(Orcamento orcamento) {
		return orcamento.getValor() * 0.02;
	}

	@Override
	public Status toAprovado(Orcamento orcamento) {
		return this;
	}

	@Override
	public Status toReprovado(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos aprovados não podem ser reprovados.");
	}

	@Override
	public Status toFinalizado(Orcamento orcamento) {
		return new FinalizadoStatus();
	}
	
	
}