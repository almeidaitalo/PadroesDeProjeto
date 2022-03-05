package FactoryMethod;

	public class TeslaFactory extends CarroFactory {

		@Override
		public void getInformacao() {
			System.out.println("lista de Informações");
			System.out.println("\t- Montadora: Tesla");
			System.out.println("\t- Ano: 2020");
			System.out.println("\t- Preço: 150 mil ");
			System.out.println("\t- Flex");
		}
  }


