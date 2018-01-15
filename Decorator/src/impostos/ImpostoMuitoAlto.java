package impostos;

import model.Orcamento;

public class ImpostoMuitoAlto extends AbstractImposto {

	public ImpostoMuitoAlto(AbstractImposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	public ImpostoMuitoAlto() {
		
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return (orcamento.getValor() * 0.2) + super.calculaProximoImposto(orcamento);
	}

}
