package Builder;

public abstract class FoguetesIBuilder {
	protected Foguete modelo;

	public FoguetesIBuilder() {
		modelo = new Foguete();

	}

	public Foguete getModelo() {
		return modelo;
	}

	public abstract void buildCor();

	public abstract void buildModelo();

	public abstract void buildMotor();

	public abstract void buildtanqueCombustivel();

	public abstract void buildnumeroDeAssentos();

}
