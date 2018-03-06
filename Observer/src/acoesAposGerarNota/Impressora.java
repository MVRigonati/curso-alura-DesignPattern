package acoesAposGerarNota;

import model.NotaFiscal;

public class Impressora implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Impresso");
	}

}
