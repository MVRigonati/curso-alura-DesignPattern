package testeMain;

import model.Item;
import model.Orcamento;

public class TesteDescontoExtra {
	
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento();
		orcamento.addItem(new Item("Item1", 500.0));
		
		orcamento.toAprovado();
		double valorDesconto = orcamento.descontoExtra();
		// O status do orcamento (aprovado, reprovado, etc) ao invés de ser apenas uma variável com
		// constantes, virou uma classe, onde é controlado também o desconto dado de acordo 
		// com o estado. Assim, os metodos do Orcamento apenas repassam para essa classe.
		
		System.out.println(valorDesconto);
		
	}

}