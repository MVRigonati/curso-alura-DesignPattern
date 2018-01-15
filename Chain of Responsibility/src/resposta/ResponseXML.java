package resposta;

import model.Conta;
import model.Formato;

public class ResponseXML extends AbstractResponse {

	public ResponseXML(AbstractResponse proximo) {
		super.setProxima(proximo);
	}

	@Override
	public String responde(Formato format, Conta conta) {

		if (format == Formato.XML) {
			return "<conta>" + 
					"<titular>" + conta.getTitular() + "</titular>" + 
					"<saldo>" + conta.getSaldo() + "</saldo>" + 
					"</conta>";
		}

		return super.resposta.responde(format, conta);

	}

}