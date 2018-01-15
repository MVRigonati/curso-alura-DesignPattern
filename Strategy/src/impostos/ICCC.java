package impostos;

import model.Orcamento;

public class ICCC implements InterfaceImposto {

	public double calcula(Orcamento orcamento) {
        
		double valor = orcamento.getValor();
		
		if (valor < 1000.0) {
			return valor * 0.05;
		
		} else if (valor <= 3000.0) {
			return valor * 0.07;
		
		} else {
			return (valor * 0.08) + 30;
		}
		
    }
	
}