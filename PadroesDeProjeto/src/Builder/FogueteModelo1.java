package Builder;

public class FogueteModelo1 extends FoguetesIBuilder {

	@Override
	public void buildCor() {
		modelo.setCor("Rosa");

	}

	@Override
	public void buildModelo() {
		modelo.setModelo("1");

	}

	@Override
	public void buildMotor() {
		modelo.setMotor("Possui 3 motores");

	}

	@Override
	public void buildtanqueCombustivel() {
		modelo.setTanqueCombustivel("Cheio");

	}

	@Override
	public void buildnumeroDeAssentos() {
		modelo.setNumeroDeAssentos("15");

	}

}
