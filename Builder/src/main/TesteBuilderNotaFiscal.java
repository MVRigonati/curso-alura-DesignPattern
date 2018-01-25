package main;

import java.util.ArrayList;
import java.util.List;

import builder.NotaFiscalBuilder;
import model.Item;
import model.NotaFiscal;

public class TesteBuilderNotaFiscal {

	public static void main(String[] args) {

		List<Item> lista = new ArrayList<Item>();
		lista.add(new Item("Item1", 50.0));
		lista.add(new Item("Item2", 150.0));
		
		/*
		 * Dessa forma fica muito difícil de construir uma nota, e muita responsabilidade para o cliente
		double valorBruto = 0;
		for (Item item : lista) {
			valorBruto += item.getValor();
		}
		double imposto = valorBruto * 0.05;
		
		NotaFiscal nf = new NotaFiscal("Razao Social", "12345", valorBruto, imposto, Calendar.getInstance(), "Observacao", lista);
		*/
		
		// Agora temos um código muito mais simples, deixando uma classe separada cuidar
		// de todo o processo para construir uma NotaFiscal
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		
		builder.addCNPJ("12345")
		.addRazaoSocial("Razao Social")
		.addObservacoes("Observacao");
		// Esse estilo de programação é chamado de Interfaces Fluentes
		// Os métodos da classe NotaFiscalBuilder retornam ele mesmo,
		// assim podemos realizar várias ações na mesma linha
		// usando o MethodChain, para ligar um método no outro.
		
		for (Item item : lista) {
			builder.addItem(item);
		}
		
		NotaFiscal nf = builder.build();
		
		System.out.println(nf.getValorBruto());
		
	}
	
}