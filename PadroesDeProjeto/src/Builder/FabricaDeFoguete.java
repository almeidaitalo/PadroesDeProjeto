package Builder;

public class FabricaDeFoguete {

	private FoguetesIBuilder bluider;

	public FabricaDeFoguete(FoguetesIBuilder bluider) {

		this.bluider = bluider;
	}

	public void construirFoguete() {
		bluider.buildCor();
		bluider.buildModelo();
		bluider.buildMotor();
		bluider.buildtanqueCombustivel();
		bluider.buildnumeroDeAssentos();
	}

	public Foguete getModelo() {
		return bluider.getModelo();

	}

}
