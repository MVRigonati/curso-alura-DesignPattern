package templateMethod;

import java.util.List;

import model.Conta;

public abstract class TemplateRelatorio {

	public final void imprime(List<Conta> lista) {
		cabecalho();
		corpo(lista);
		rodape();
	}
	
	public abstract void cabecalho();
	public abstract void corpo(List<Conta> lista);
	public abstract void rodape();
	
}