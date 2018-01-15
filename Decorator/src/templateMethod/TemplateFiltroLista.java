package templateMethod;

import java.util.ArrayList;
import java.util.List;

import filtroFraude.Filtro;
import model.Conta;

public abstract class TemplateFiltroLista extends Filtro {

	public TemplateFiltroLista(Filtro proximo) {
		super.setProximo(proximo);
	}
	
	public TemplateFiltroLista() {
		
	}
	
	@Override
	public final List<Conta> filtra(List<Conta> contas) {
		
		List<Conta> contasPossiveis = new ArrayList<>();
		for (Conta conta : contas) {
			forEach(conta, contasPossiveis);
		}
		
		contasPossiveis.addAll(super.calcularProximo(contas));
		return contasPossiveis;
		
	}

	protected abstract void forEach(Conta conta, List<Conta> contasPossiveis);

}
