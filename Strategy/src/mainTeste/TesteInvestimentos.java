package mainTeste;

import investimentos.Arrojado;
import model.Conta;
import strategy.RealizadorInvestimentos;

public class TesteInvestimentos {

	public static void main(String[] args) {
		
		Conta marcus = new Conta();
		marcus.deposita( 1200.0 );
		
		RealizadorInvestimentos realizador = new RealizadorInvestimentos();
		
		realizador.investimento(marcus, new Arrojado());
		
	}
	
}