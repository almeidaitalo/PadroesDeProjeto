package Builder;

public class Cliente {

	public static void foguete(String modelo, FogueteModelo1 fogueteModelo1) {
		System.out.println("Foguete: " + modelo);
		FabricaDeFoguete director = new FabricaDeFoguete(fogueteModelo1);
		director.construirFoguete();
		System.out.println(director.getModelo());

	}

	public static void main(String[] args) {
		foguete("Montado", new FogueteModelo1());
	}

}
