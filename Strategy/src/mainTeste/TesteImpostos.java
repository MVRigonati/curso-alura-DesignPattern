package mainTeste;

import impostos.ICMS;
import impostos.ISS;
import impostos.InterfaceImposto;
import model.Orcamento;
import strategy.CalculadoraImposto;

public class TesteImpostos {

	public static void main(String[] args) {

		InterfaceImposto iss = new ISS();
		InterfaceImposto icms = new ICMS();

		Orcamento orcamento = new Orcamento(500.0);

		CalculadoraImposto calculador = new CalculadoraImposto();

		// Aqui temos o Design Pattern bem definido "Strategy",
		// estamos passando o valor (ou de onde o valor será retirado),
		// e uma estratégia para fazer qualquer quer seja o cálculo.
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
		
	}

}
