package mainTeste;

import impostos.ICPP;
import impostos.IKCV;
import impostos.InterfaceImposto;
import model.Item;
import model.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {

		InterfaceImposto imposto1 = new IKCV();
		InterfaceImposto imposto2 = new ICPP();
		// O design patter TemplateMethod está sendo aplicado dentro das classes IKCV e ICPP.
		// Esses dois impostos obedecem uma regra de negócio muito parecida, além de serem imposto,
		// por tanto foi criado um Template, que é a classe abstrata com a implementação
		// do que tem e comum entre eles dois.
		// As partes diferentes foram separadas em metodos abstratos, assim cada classe implemeta
		// da forma que desejar.

		Orcamento orcamento = new Orcamento();
		orcamento.addItem(new Item("Caneta", 200.0));
		orcamento.addItem(new Item("Passagem", 350.0));
		orcamento.addItem(new Item("Barco", 7350.0));

		System.out.println("Imposto 1: " + imposto1.calcula(orcamento));
		System.out.println("Imposto 2: " + imposto2.calcula(orcamento));
		
	}

}