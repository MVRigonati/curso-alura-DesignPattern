package ContaStatus;

public class ContaNegativa implements ContaStatus {

	@Override
	public double deposito(double valor) {
		return valor * 0.95;
	}

	@Override
	public double saque(double valor) {
		throw new RuntimeException("Contas em estado negativo não realizam saques.");
	}

	@Override
	public ContaStatus toPositivo() {
		return new ContaPositiva();
	}

	@Override
	public ContaStatus toNegativo() {
		return this;
	}

}