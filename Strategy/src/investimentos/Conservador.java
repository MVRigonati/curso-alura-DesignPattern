package investimentos;

import model.Conta;

public class Conservador implements InterfaceInvestimento {

	@Override
	public double retorno(Conta conta) {
		return conta.getSaldo() * 0.008;
	}
	
}
