package templateMethod;

import impostos.InterfaceImposto;
import model.Orcamento;

public abstract class TemplateImpostoCondicional implements InterfaceImposto {

	protected Orcamento orcamento;
	
	@Override
	public final double calcula(Orcamento orcamento) {
		
		this.orcamento = orcamento;
		if (condition()) {
			return trueCase();
		}
		return falseCase();
		
	}
	
	public final Orcamento getOrcamento() {
		return this.orcamento;
	}
	
	public final double getValorOrcamento() {
		return this.orcamento.getValor();
	}
	
	protected abstract boolean condition();
	protected abstract double trueCase();
	protected abstract double falseCase();
	
}