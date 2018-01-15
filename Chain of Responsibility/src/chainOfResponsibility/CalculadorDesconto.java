package chainOfResponsibility;

import descontos.AbstractDesconto;
import descontos.DescontoLapisCaneta;
import descontos.DescontoMaisCincoItens;
import descontos.DescontoMaisQuinhentosReais;
import descontos.SemDesconto;
import model.Orcamento;

public class CalculadorDesconto {

	public double calcula(Orcamento orcamento) {
		
		// Nesse caso o código não para de crescer, sempre que aparecer um novo desconto
		// precisaremos adicionar mais um if.
		/*
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
			
		} else if (orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.07;
			
		}
		*/
		// Aqui temos uma situação onde se uma situação não for válida testamos a próxima,
		// esse é o princípio do "Chain of Responsibility".
		
		
		// Aqui conseguimos resolver o problema de uma outra forma,
		// agora o código está muito melhor para manutenção e entendimento,
		// e caso seja necessário acrecentar mais regras, não é necessário muitas linhas.
		AbstractDesconto desconto1 = new DescontoMaisCincoItens();
		AbstractDesconto desconto2 = new DescontoMaisQuinhentosReais();
		AbstractDesconto desconto3 = new DescontoLapisCaneta();
		AbstractDesconto descontoFinal = new SemDesconto();
		// Toda corrente precisa ter um fim, ou então irá acabar com um erro de null pointer,
		// a classe "SemDesconto" apenas retorna zero, funcionando como um caso base,
		// fazendo assim a cadeia terminar de forma correta.
		
		desconto1.setProximoDesconto(desconto2);
		desconto2.setProximoDesconto(desconto3);
		desconto3.setProximoDesconto(descontoFinal);
		
		return desconto1.calcula(orcamento);
		// Dessa outra forma temos um esquema em corrente, onde instanciamos os descontos
		// e dizemos qual será a ordem.
		
	}
	
}