package mainTeste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import filtroFraude.Filtro;
import filtroFraude.FiltroContaCriadaNesseMês;
import filtroFraude.FiltroSaldoMaior500Mil;
import model.Conta;

public class TesteFiltroContas {

	public static void main(String[] args) {
		
		List<Conta> contas = new ArrayList<>();
		contas.add(new Conta("Marcus", 500001));
		contas.add(new Conta("Vinicius", 100));
		contas.add(new Conta("Rigonati", 20));
		
		Filtro filtros = new FiltroContaCriadaNesseMês(new FiltroSaldoMaior500Mil());
		
		System.out.println( listToString(filtros.filtra(contas)) );
		
	}

	private static String listToString(List<?> contas) {
		return Arrays.toString(contas.toArray());
	}
	
}
