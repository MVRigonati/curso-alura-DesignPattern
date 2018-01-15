package relatorio;

import java.util.Calendar;
import java.util.List;

import model.Conta;
import templateMethod.TemplateRelatorio;

public class RelatorioComplexo extends TemplateRelatorio {

	@Override
	public void cabecalho() {
		System.out.println("Bradesco - Rua Pedregulho, 19 - (11)99166-8172");
	}

	@Override
	public void corpo(List<Conta> lista) {
		
		for (Conta conta : lista) {
			
			System.out.println("\n## ## ##");
			System.out.println("Titular: " + conta.getTitular());
			System.out.println("Agencia: " + conta.getAgencia());
			System.out.println("Conta: " + conta.getNumeroConta());
			System.out.println("Saldo: " + conta.getSaldo());
			
		}
		System.out.println();
		
	}

	@Override
	public void rodape() {
		System.out.println("bancoseguro@bradesco.com");
		System.out.println(Calendar.getInstance().getTime());
	}

}
