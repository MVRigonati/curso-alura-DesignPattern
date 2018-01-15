package templateMethod;

import impostos.AbstractImposto;
import model.Orcamento;

public abstract class TemplateImpostoCondicional extends AbstractImposto {

	protected Orcamento orcamento;
	
	public TemplateImpostoCondicional() {
		
	}
	
	public TemplateImpostoCondicional(AbstractImposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public final double calcula(Orcamento orcamento) {
		
		this.orcamento = orcamento;
		if (condition()) {
			return trueCase() + calculaProximoImposto(orcamento);
		}
		return falseCase() + calculaProximoImposto(orcamento);
		
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