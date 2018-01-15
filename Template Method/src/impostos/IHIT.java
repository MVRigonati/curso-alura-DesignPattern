package impostos;

import java.util.ArrayList;
import java.util.List;

import model.Item;
import templateMethod.TemplateImpostoCondicional;

public class IHIT extends TemplateImpostoCondicional {

	@Override
	protected boolean condition() {
		return has2EqualItens(super.getOrcamento().getItens());
	}

	@Override
	protected double trueCase() {
		return (super.getValorOrcamento() * 0.13) + 100.0;
	}

	@Override
	protected double falseCase() {
		return (super.getValorOrcamento() * 0.01) * super.getOrcamento().itensNumber();
	}
	
	private boolean has2EqualItens(List<Item> lista) {

		List<String> listaNomes = new ArrayList<String>();
		
		for (Item item : lista) {
			
			if (listaNomes.contains(item.getNome())) {
				return true;
			} else {
				listaNomes.add(item.getNome());
			}
			
		}
		
		return false;
		
	}

}
