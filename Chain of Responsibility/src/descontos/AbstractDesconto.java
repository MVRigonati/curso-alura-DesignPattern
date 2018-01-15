package descontos;

import model.Orcamento;

public abstract class AbstractDesconto {

	protected AbstractDesconto proximo;
	
	public final void setProximoDesconto(AbstractDesconto proximo) {
		this.proximo = proximo;
	}
	
	public abstract double calcula(Orcamento orcamento);
	
}