package descontos;

import model.Orcamento;

public class SemDesconto extends AbstractDesconto {

	@Override
	public double calcula(Orcamento orcamento) {
		return 0;
	}
	
}