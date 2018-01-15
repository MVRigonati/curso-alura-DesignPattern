package mainTeste;

import chainOfResponsibility.AdministraRespostas;
import model.Conta;
import model.Formato;

public class TesteResponseBanco {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta("Marcus");
		conta1.deposita(1200.0);
		
		// Terminar teste
		String resposta = new AdministraRespostas().responde(conta1, Formato.XML);
		System.out.println(resposta);
		
	}
	
}
