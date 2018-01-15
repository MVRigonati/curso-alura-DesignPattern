package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	private final List<Item> itens;

	public Orcamento() {
		this.itens = new ArrayList<Item>();
	}

	public double getValor() {

		double valor = 0;
		for (Item item : itens) {
			valor += item.getValor();
		}
		return valor;

	}

	public void addItem(Item item) {
		this.itens.add(item);
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public int itensNumber() {
		return this.itens.size();
	}

}