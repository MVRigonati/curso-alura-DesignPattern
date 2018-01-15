package model;

import ContaStatus.ContaNegativa;
import ContaStatus.ContaPositiva;
import ContaStatus.ContaStatus;

public class Conta {

	private double saldo;
	private ContaStatus status;
	
	public Conta() {
		this.status = new ContaPositiva();
	}
	
	public double getSaldo() {
		this.verificaStatus();
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		this.verificaStatus();
	}
	
	public void deposita(double valor) {
		
		if (valor >= 0) {
			this.setSaldo(this.saldo + this.status.deposito(valor));
		} else {
			throw new RuntimeException("Não é possível realizar depositos de valores a sbaixo de 0.");
		}
		
	}

	public double saca(double valor) {
		
		if (valor >= 0) {
			double valorParaEntrega = this.status.saque(valor);
			this.setSaldo(this.saldo - this.status.saque(valor));
			return valorParaEntrega;
		}
		throw new RuntimeException("Não é possível realizar saque de valores a baixo de 0.");
		
	}
	
	private void verificaStatus() {
		
		if (this.saldo >= 0) {
			this.status = new ContaPositiva();
		} else {
			this.status = new ContaNegativa();
		}
		
	}
	
}