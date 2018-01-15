package model;

import java.util.Calendar;

public class Conta {

	private double saldo;
	private String titular;
	private Calendar dataAbertura;
	
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		this.dataAbertura = Calendar.getInstance();
	}
	
	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public Calendar getDataAbertura() {
		return dataAbertura;
	}
	
	@Override
	public String toString() {
		return this.titular;
	}
	
}
