package mainTeste;

import chainOfResponsibility.CalculadorDesconto;
import model.Item;
import model.Orcamento;

public class TesteDescontos {

	public static void main(String[] args) {
		
		CalculadorDesconto calculaDesconto = new CalculadorDesconto();
		
		Orcamento orcamento = new Orcamento();
		orcamento.addItem(new Item("Item1", 200.0));
		orcamento.addItem(new Item("Item2", 2000.0));
		orcamento.addItem(new Item("Item3", 10.0));
		orcamento.addItem(new Item("Item4", 15.0));
		orcamento.addItem(new Item("Item5", 35.0));
		orcamento.addItem(new Item("Item6", 10.0));
		
		System.out.println(calculaDesconto.calcula(orcamento));
		
	}
	
}