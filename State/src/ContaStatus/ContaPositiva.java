package ContaStatus;

public class ContaPositiva implements ContaStatus {

	@Override
	public double deposito(double valor) {
		return valor * 0.98;
	}

	@Override
	public double saque(double valor) {
		return valor;
	}

	@Override
	public ContaStatus toPositivo() {
		return this;
	}

	@Override
	public ContaStatus toNegativo() {
		return new ContaNegativa();
	}

}