package filtroFraude;

import java.util.List;

import model.Conta;
import templateMethod.TemplateFiltroLista;

public class FiltroSaldoMenor100Reais extends TemplateFiltroLista {

	public FiltroSaldoMenor100Reais() {
		
	}
	
	public FiltroSaldoMenor100Reais(Filtro proximo) {
		super(proximo);
	}

	@Override
	protected void forEach(Conta conta, List<Conta> contasPossiveis) {
		
		if (conta.getSaldo() < 100.0) {
			contasPossiveis.add(conta);
		}
		
	}

}