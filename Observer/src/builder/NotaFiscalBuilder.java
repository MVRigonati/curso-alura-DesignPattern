package builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import acoesAposGerarNota.AcaoAposGerarNota;
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
	
	private List<AcaoAposGerarNota> acoesAposGerarNota;
	
	public NotaFiscalBuilder(List<AcaoAposGerarNota> acoes) {
		this.acoesAposGerarNota = acoes;
	}
	
	public NotaFiscalBuilder() {
		acoesAposGerarNota = new ArrayList<>();
	}
	
	public void add(AcaoAposGerarNota acao) {
		this.acoesAposGerarNota.add(acao);
	}
	
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
		
		/*
		
		new Acao1().acao1AposGerarNota();
		new Acao2().acao1AposGerarNota();
		new Acao3().acao1AposGerarNota();
		
		 * Essa é uma forma incorreta de colocarmos nossas ações, pois
		 * apesar de cada classe ter sua responsabilidade, elas estão
		 * deixando essa classe aqui com muito acoplamento
		 */
		
		NotaFiscal notaFiscal = new NotaFiscal(this.razaoSocial, this.CNPJ, this.valorBruto, this.imposto, this.dataEmissao, this.observacoes, this.itens);
		
		for (AcaoAposGerarNota acao : acoesAposGerarNota) {
			acao.executa(notaFiscal);
		}
		
		// Dessa forma não temos problema de acoplação,
		// pois o uso da interface deixou abstraído toda e qualquer
		// ação.
		// Outro problema resolvido é em relação ao tamanho do código,
		// agora executamos quantas ações forem passadas sem alterar o código.
		// Foi preciso apenas receber uma lista no construtor.
		
		return notaFiscal;
		
	}
	
}