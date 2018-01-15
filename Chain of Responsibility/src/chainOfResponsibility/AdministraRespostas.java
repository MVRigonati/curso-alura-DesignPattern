package chainOfResponsibility;

import model.Conta;
import model.Formato;
import resposta.DefaultResponse;
import resposta.AbstractResponse;
import resposta.ResponseCSV;
import resposta.ResponsePorcentagem;
import resposta.ResponseXML;

public class AdministraRespostas {

	public String responde(Conta conta, Formato format) {
		
		AbstractResponse respostaFinal = new DefaultResponse();
		AbstractResponse resposta3 = new ResponsePorcentagem(respostaFinal);
		AbstractResponse resposta2 = new ResponseCSV(resposta3);
		AbstractResponse resposta1 = new ResponseXML(resposta2);

		// Nesse caso não precisria de uma resposta final, pois todas as respostas
		// possíveis devem estar na classe enum, porém eu adicionei mesmo assim
		
		return resposta1.responde(format, conta);
		
	}
	
}