package resposta;

import model.Conta;
import model.Formato;

public class ResponseCSV extends AbstractResponse {

	public ResponseCSV(AbstractResponse proximo) {
		super.setProxima(proximo);
	}
	
	@Override
	public String responde(Formato format, Conta conta) {
		
		if (format == Formato.CSV) {
			return conta.getTitular() + "," + conta.getSaldo();
		}
		
		return super.resposta.responde(format, conta);
		
	}
	
}