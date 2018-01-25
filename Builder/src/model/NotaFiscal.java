package model;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

	private String razaoSocial;
	private String CNPJ;
	private double valorBruto;
	private double impostos;
	private Calendar dataEmissao;
	private String observacoes;
	private List<Item> itensNota;

	public NotaFiscal(String razaoSocial, String CNPJ, double valorBruto, double impostos, Calendar dataEmissao,
			String observacoes, List<Item> itensNota) {

		this.razaoSocial = razaoSocial;
		this.CNPJ = CNPJ;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.dataEmissao = dataEmissao;
		this.observacoes = observacoes;
		this.itensNota = itensNota;

	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public double getImpostos() {
		return impostos;
	}

	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public List<Item> getItensNota() {
		return itensNota;
	}

}