package descontos;

import model.Orcamento;

public class DescontoMaisQuinhentosReais extends AbstractDesconto {

	public double calcula(Orcamento orcamento) {
		
		if (orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.07;
		}
		
		return super.proximo.calcula(orcamento);
		
	}
	
}