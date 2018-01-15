package resposta;

import model.Conta;
import model.Formato;

public class ResponsePorcentagem extends AbstractResponse {

	public ResponsePorcentagem(AbstractResponse proximo) {
		super.setProxima(proximo);
	}
	
	@Override
	public String responde(Formato format, Conta conta) {

		if (format == Formato.PORCENTAGEM) {
			return conta.getTitular() + "%" + conta.getSaldo();
		}

		return super.resposta.responde(format, conta);

	}

}