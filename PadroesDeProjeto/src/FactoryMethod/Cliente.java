package FactoryMethod;

public class Cliente {

	public CarroFactory orderCarro(String Marca, String Modelo) {
		CarroFactory device = null;

		if (Marca.equals("X")) {
			if (Modelo.equals("charge")) {
				device = new DodgeFactory();
			} else if (Modelo.equals("dart")) {
				device = new DodgeFactory();
			}
		} else if (Marca.equals("s")) {
			if (Modelo.equals("TeslaModeloX")) {
				device = new TeslaFactory();
			} else if (Modelo.equals("modelo s")) {
				device = new TeslaFactory();
			}
		}

		device.getInformacao();
		device.acelerar();
		device.frear();
		device.trocarMarcha();

		return device;
	}

	public static void main(String[] args) {
		Cliente client = new Cliente();

		System.out.println("Encomendar charge X");
		CarroFactory carro = client.orderCarro("s", "modelo s");
		System.out.println(carro);

		System.out.println("\n\nEncomendar S");
		CarroFactory carro2 = client.orderCarro("X", "dart");
		System.out.println(carro2);
	}
}
