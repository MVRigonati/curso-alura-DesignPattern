package impostos;

import model.Orcamento;

public class ICMS implements InterfaceImposto {

	public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }
	
}