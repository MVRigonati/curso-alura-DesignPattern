package mainTeste;

import impostos.AbstractImposto;
import impostos.ICMS;
import impostos.ICPP;
import model.Item;
import model.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {

		AbstractImposto imposto1 = new ICPP(new ICMS());
		// O design patter Decorator está sendo aplicado no construtor das classes ICPP e ICMS.
		// Quando precisamos fazer com que mais de uma regra 
		// seja aplicada para um mesmo cálculo, podemos passar a próxima regra
		// dentro do construtor. Na classe abstrata definimos um método
		// para chamar a próxima regra. Pode ser criado dois construtores,
		// um vazio e um com o parâmetro para calcular o próxiumo, ou então
		// apenas um construtos com parâmetro, e na última regra colocamos
		// "null" para finalizar no "catch" do método de executar a próxima regra de negócio,
		// dessa forma: AbstractImposto imposto2 = new ICPP(new ICMS(null));

		Orcamento orcamento = new Orcamento();
		orcamento.addItem(new Item("Caneta", 200.0));
		orcamento.addItem(new Item("Passagem", 350.0));
		orcamento.addItem(new Item("Barco", 7350.0));

		System.out.println("Imposto 1: " + imposto1.calcula(orcamento));
		
	}

}