package filtroFraude;

import java.util.List;

import model.Conta;
import templateMethod.TemplateFiltroLista;

public class FiltroSaldoMaior500Mil extends TemplateFiltroLista {

	public FiltroSaldoMaior500Mil() {
		
	}
	
	public FiltroSaldoMaior500Mil(Filtro proximo) {
		super(proximo);
	}

	@Override
	protected void forEach(Conta conta, List<Conta> contasPossiveis) {
		
		if (conta.getSaldo() > 500000.0) {
			contasPossiveis.add(conta);
		}
		
	}

}
