package builder;

import model.Item;

public class ItemBuilder {

	private String descricao;
	private double valor;
	
	public ItemBuilder addDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
	
	public ItemBuilder addValor(double valor) {
		this.valor = valor;
		return this;
	}
	
	public Item build() {
		return new Item(this.descricao, this.valor);
	}
	
}