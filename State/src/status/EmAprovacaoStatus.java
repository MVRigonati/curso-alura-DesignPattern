package status;

import model.Orcamento;

public class EmAprovacaoStatus implements Status {

	public double descontoExtra(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	public Status toAprovado(Orcamento orcamento) {
		return new AprovadoStatus();
	}

	@Override
	public Status toReprovado(Orcamento orcamento) {
		return new ReprovadoStatus();
	}

	@Override
	public Status toFinalizado(Orcamento orcamento) {
		throw new RuntimeException("Apenas orcamentos aprovados podem ser finalizados.");
	}
	
}
