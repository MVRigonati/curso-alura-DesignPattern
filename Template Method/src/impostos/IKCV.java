package impostos;

import java.util.List;

import model.Item;
import templateMethod.TemplateImpostoCondicional;

public class IKCV extends TemplateImpostoCondicional {

	@Override
	public boolean condition() {
		return super.getValorOrcamento() > 500 && temItemMaiorQueValor(100.0);
	}

	@Override
	public double trueCase() {
		return super.getValorOrcamento() * 0.10;
	}

	@Override
	public double falseCase() {
		return super.getValorOrcamento() * 0.06;
	}

	private boolean temItemMaiorQueValor(double valor) {

		List<Item> listaItens = super.getOrcamento().getItens();
		for (Item item : listaItens) {
			
			if (item.getValor() > valor) {
				return true;
			}
			
		}
		return false;
		
	}
	
}