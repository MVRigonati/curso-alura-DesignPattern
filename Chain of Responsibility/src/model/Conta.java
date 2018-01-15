package model;

public class Conta {
	
	private String titular;
	private double saldo;

	public Conta(String titular) {
		this.titular = titular;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void deposita(double valor) {
		
		if (valor >= 0) {
			this.saldo += valor;
		}
		
	}

}
