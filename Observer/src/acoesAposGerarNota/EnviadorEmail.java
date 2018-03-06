package acoesAposGerarNota;

import model.NotaFiscal;

public class EnviadorEmail implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Enviei por email.");
	}

}
