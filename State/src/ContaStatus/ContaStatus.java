package ContaStatus;

public interface ContaStatus {

	public double deposito(double valor);
	public double saque(double valor);
	
	public ContaStatus toPositivo();
	public ContaStatus toNegativo();
	
}
