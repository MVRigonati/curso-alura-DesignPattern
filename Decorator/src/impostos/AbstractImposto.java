package impostos;

import model.Orcamento;

public abstract class AbstractImposto {

	protected AbstractImposto outroImposto;
	
	public AbstractImposto(AbstractImposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	public AbstractImposto() {
		
	}
	
	protected final double calculaProximoImposto(Orcamento orcamento) {
		
		try {
			return outroImposto.calcula(orcamento);
		} catch (NullPointerException ex) {
			return 0;
		}
		
	}
	
	public abstract double calcula(Orcamento orcamento);
	
}
