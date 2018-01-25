package main;

import builder.ItemBuilder;
import model.Item;

public class TesteBuilderItem {

	public static void main(String[] args) {
		
		ItemBuilder builder = new ItemBuilder();
		
		builder.addDescricao("Item1").addValor(50.00);
		Item item1 = builder.build();
		
		builder.addDescricao("Item2")
		.addValor(150.00);
		Item item2 = builder.build();
		
		System.out.println(item1.getDescricao() + " Valor: " + item1.getValor());
		System.out.println(item2.getDescricao() + " Valor: " + item2.getValor());
		
	}
	
}
