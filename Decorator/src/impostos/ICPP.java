package impostos;

import templateMethod.TemplateImpostoCondicional;

public class ICPP extends TemplateImpostoCondicional {

	public ICPP() {
		
	}
	
	public ICPP(AbstractImposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	protected boolean condition() {
		return super.getValorOrcamento() > 500;
	}

	@Override
	protected double trueCase() {
		return super.getValorOrcamento() * 0.07;
	}

	@Override
	protected double falseCase() {
		return super.getValorOrcamento() * 0.05;
	}

}