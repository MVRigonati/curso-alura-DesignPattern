package investimentos;

import model.Conta;

public class Arrojado implements InterfaceInvestimento {

	@Override
	public double retorno(Conta conta) {
		
		double chance = new java.util.Random().nextDouble();
		
		if (chance < 0.20) {
			return conta.getSaldo() * 0.05;
			
		} else if (chance < 0.50) {
			return conta.getSaldo() * 0.03;
			
		}
		return conta.getSaldo() * 0.006;
		
	}

}

