package strategy;

import impostos.InterfaceImposto;
import model.Orcamento;

public class CalculadoraImposto {

	// Dessa forma a classe nunca irá parar de crescer, pois a cada novo imposto
	// um novo "if" precisa ser colocado, e uma nova lógica precisa ser feita em outros lugares.
	// O mesmo vale para o caso de dividirmos os impostos em metodos diferentes
	/*
	public void realizaCalculo(Orcamento orcamento, String imposto) {

		if ("ICMS".equals(imposto)) {

			double icms = new ICMS().calculaICMS(orcamento);
			System.out.println(icms); // imprimirá 50.0

		} else if ("ISS".equals(imposto)) {

			double iss = new ISS().calculaISS(orcamento);
			System.out.println(iss); // imprimirá 30.0

		}
	}
	*/
	
	// Podemos perceber que todos os impostos tem características em comum,
	// então podemos usar isso a nosso favor, se todos eles implementarem
	// uma interface, então iremos chamar apenas um método, independente do imposto
	
	public void realizaCalculo(Orcamento orcamento, InterfaceImposto imposto) {
		imposto.calcula(orcamento);
	}
	
	// Dessa forma, além de eliminar o problema de o código crescer infinitamente,
	// também garantimos uma boa manutenção e fácil entendimento, pois
	// caso um novo imposto venha a aparecer, será criada uma nova classe para ele
	// com o requisito de que precisa implementar a interface.
	// Criamos então um padrão.
	
	// No momento esta classe tornou-se inútil pois executa apenas uma liha de código,
	// poderíamos remover ela, mas podería ser bastante útil caso fosse necessário 
	// colocar mais alguma regra ou lógica relacionada a cálculo de imposto.  

}
