package investimentos;

import model.Conta;

public class Moderado implements InterfaceInvestimento {

	@Override
	public double retorno(Conta conta) {
		
		boolean escolhido = new java.util.Random().nextDouble() > 0.5;
		
		if (escolhido) {
			return conta.getSaldo() * 0.025;
		} else { 
			return conta.getSaldo() * 0.007;
		}
		
	}
}
