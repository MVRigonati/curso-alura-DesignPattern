package resposta;

import model.Conta;
import model.Formato;

public class DefaultResponse  extends AbstractResponse {

	@Override
	public String responde(Formato format, Conta conta) {
		return conta.getTitular() + " " + conta.getSaldo();
	}

}
