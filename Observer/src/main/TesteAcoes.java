package main;

import acoesAposGerarNota.EnviadorEmail;
import acoesAposGerarNota.Impressora;
import builder.NotaFiscalBuilder;
import model.NotaFiscal;

public class TesteAcoes {
	
	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.add(new EnviadorEmail());
		builder.add(new Impressora());
		
		NotaFiscal nf = builder.addRazaoSocial("Caelum").addCNPJ("123").build();
		
		System.out.println(nf.getValorBruto());
		
	}
	
}
