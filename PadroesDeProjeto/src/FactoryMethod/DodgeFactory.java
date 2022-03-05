package FactoryMethod;

	public class DodgeFactory extends CarroFactory  {

		@Override
		public void getInformacao() {
			System.out.println("lista de Informações");
			System.out.println("\t- Montadora: Dodge");
			System.out.println("\t- Ano: 2011");
			System.out.println("\t- Preço: 100 mil");
			System.out.println("\t- Flex");
		}
  }

