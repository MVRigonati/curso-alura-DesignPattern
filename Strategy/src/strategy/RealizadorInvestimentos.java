package strategy;

import investimentos.InterfaceInvestimento;
import model.Conta;

public class RealizadorInvestimentos {

	public void investimento(Conta conta, InterfaceInvestimento tipoInvest) {
		
		double valor = tipoInvest.retorno(conta);
		conta.deposita(valor * 0.75);
		
	}
	
}
