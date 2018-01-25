package builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import model.Item;
import model.NotaFiscal;

public class NotaFiscalBuilder {

	private String CNPJ;
	private String razaoSocial;
	private Calendar dataEmissao;
	private String observacoes;
	private List<Item> itens = new ArrayList<Item>();
	private double valorBruto;
	private double imposto;
	
	// Os métodos dessa classe usam o estilo de programação Interfaces Fluentes.
	// Retornando o próprio objeto, o cliente é capaz de deixar seu código melhor
	// usando o MethodChain, assim: builder.addCNPJ("12345").addRazaoSocial("Razao Social").addObservacoes("Observacao");
	public NotaFiscalBuilder addRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder addCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
		return this;
	}
	
	private void addDataEmissao() {
		this.dataEmissao = Calendar.getInstance();
	}
	
	public NotaFiscalBuilder addObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}
	
	public NotaFiscalBuilder addItem(Item item) {
		
		this.itens.add(item);
		this.valorBruto += item.getValor();
		this.imposto += item.getValor() * 0.05;
		return this;
		
	}
	
	public NotaFiscal build() {
		
		this.addDataEmissao();
		return new NotaFiscal(this.razaoSocial, this.CNPJ, this.valorBruto, this.imposto, this.dataEmissao, this.observacoes, this.itens);
		
	}
	
}