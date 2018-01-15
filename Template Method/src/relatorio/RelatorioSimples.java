package relatorio;

import java.util.List;

import model.Conta;
import templateMethod.TemplateRelatorio;

public class RelatorioSimples extends TemplateRelatorio {

	@Override
	public void cabecalho() {
		System.out.println("Bradesco");
	}

	@Override
	public void corpo(List<Conta> lista) {

		for (Conta conta : lista) {

			System.out.println("\n## ## ##");
			System.out.println("Titular: " + conta.getTitular());
			System.out.println("Saldo: " + conta.getSaldo());

		}
		System.out.println();

	}

	@Override
	public void rodape() {
		System.out.println("(11)99166-8172");
	}

}
