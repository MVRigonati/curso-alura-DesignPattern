package resposta;

import model.Conta;
import model.Formato;

public abstract class AbstractResponse {

	protected AbstractResponse resposta;
	
	public final void setProxima(AbstractResponse resposta) {
		this.resposta = resposta;
	}
	
	public abstract String responde(Formato format, Conta conta);
	
}
