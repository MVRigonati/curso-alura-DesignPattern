package impostos;

import model.Orcamento;

public class ISS implements InterfaceImposto {

	public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
	
}
