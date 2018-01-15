package descontos;

import model.Orcamento;

public class DescontoMaisCincoItens extends AbstractDesconto {

	public double calcula(Orcamento orcamento) {
		
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.10;
		}
		
		return super.proximo.calcula(orcamento);
		
	}
	
}