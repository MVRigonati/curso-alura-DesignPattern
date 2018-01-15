package status;

import model.Orcamento;

public interface Status {

	public double descontoExtra(Orcamento orcamento);
	
	public Status toAprovado(Orcamento orcamento);
	public Status toReprovado(Orcamento orcamento);
	public Status toFinalizado(Orcamento orcamento);
	
}
