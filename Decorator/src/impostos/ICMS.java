package impostos;

import model.Orcamento;

public class ICMS extends AbstractImposto {

	public ICMS(AbstractImposto outroImposto) {
		super(outroImposto);
	}
	
	public ICMS() {
		
	}
	
	public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1 + calculaProximoImposto(orcamento);
    }
	
}