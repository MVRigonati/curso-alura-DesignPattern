package filtroFraude;

import java.util.ArrayList;
import java.util.List;

import model.Conta;

public abstract class Filtro {

	private Filtro proximo;

	public Filtro getProximo() {
		return proximo;
	}

	public void setProximo(Filtro proximo) {
		this.proximo = proximo;
	}

	public final List<Conta> calcularProximo(List<Conta> lista) {

		try {
			return proximo.filtra(lista);
		} catch (NullPointerException ex) {
			return new ArrayList<Conta>();
		}

	}

	public abstract List<Conta> filtra(List<Conta> contas);

}