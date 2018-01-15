package descontos;

import java.util.List;

import model.Item;
import model.Orcamento;

public class DescontoLapisCaneta extends AbstractDesconto {
	
	@Override
	public double calcula(Orcamento orcamento) {
		
		boolean lapis = false;
		boolean caneta = false;
		
		List<Item> vetor = orcamento.getItens();
		
		for (Item item : vetor) {
			lapis = item.getNome().equals("Lápis");
			caneta = item.getNome().equals("Caneta");
		}
		
		if (lapis && caneta) {
			return orcamento.getValor() * 0.05;
		}
		
		return super.proximo.calcula(orcamento);
		
	}

}