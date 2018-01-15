package testeMain;

import model.Conta;

public class testeContaStatus {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		
		conta1.deposita(100);
		double valor = conta1.saca(101);
		
		System.out.println("Saldo: " + conta1.getSaldo());
		
		conta1.deposita(100);
		
		System.out.println("Saldo final: " + conta1.getSaldo());
		
	}
	
}