package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import status.EmAprovacaoStatus;
import status.Status;

public class Orcamento {

	private final List<Item> itens;
	protected double valor;
	private Status status;
	private boolean descontoExtraAplicado;

	public Orcamento() {
		this.itens = new ArrayList<Item>();
		this.status = new EmAprovacaoStatus();
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

	public double descontoExtra() {
		
		if (!descontoExtraAplicado) {
			this.descontoExtraAplicado = true;
			return this.status.descontoExtra(this);
		}
		return 0;
		
	}
	
	public void toAprovado() {
		this.status = status.toAprovado(this);
	}
	
	public void toReprovado() {
		this.status = status.toReprovado(this);
	}
	
	public void toFinalizado() {
		this.status = status.toFinalizado(this);
	}

}