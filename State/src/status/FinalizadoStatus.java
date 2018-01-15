package status;

import model.Orcamento;

public class FinalizadoStatus implements Status {

	@Override
	public double descontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos finalizados não recebem desconto extra.");
	}

	@Override
	public Status toAprovado(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos finalizados não podem mudar de status.");
	}

	@Override
	public Status toReprovado(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos finalizados não podem mudar de status.");
	}

	@Override
	public Status toFinalizado(Orcamento orcamento) {
		return this;
	}

}
