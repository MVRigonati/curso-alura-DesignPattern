package filtroFraude;

import java.util.Calendar;
import java.util.List;

import model.Conta;
import templateMethod.TemplateFiltroLista;

public class FiltroContaCriadaNesseMês extends TemplateFiltroLista {

	public FiltroContaCriadaNesseMês() {
		
	}
	
	public FiltroContaCriadaNesseMês(Filtro proximo) {
		super(proximo);
	}
	
	@Override
	protected void forEach(Conta conta, List<Conta> contasPossiveis) {
		
		if ( isContaCriadaNesseMês(conta) ) {
			contasPossiveis.add(conta);
		}

	}

	private boolean isContaCriadaNesseMês(Conta conta) {
		return conta.getDataAbertura().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH);
	}

}
