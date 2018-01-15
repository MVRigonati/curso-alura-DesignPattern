package mainTeste;

import java.util.ArrayList;
import java.util.List;

import model.Conta;
import relatorio.RelatorioComplexo;
import templateMethod.TemplateRelatorio;

public class testeRelatorio {

	public static void main(String[] args) {
		
		List<Conta> listaContas = new ArrayList<>();
		TemplateRelatorio tipoRelatorio = new RelatorioComplexo();
		
		listaContas.add(new Conta("Marcus", "1089", 101, 1200.0));
		listaContas.add(new Conta("Vinicius", "1240", 132, 600.0));
		listaContas.add(new Conta("Rigonati", "3024", 132, 440.0));
		
		tipoRelatorio.imprime(listaContas);
		
	}
	
}
