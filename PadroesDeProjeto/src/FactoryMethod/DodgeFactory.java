package FactoryMethod;

	public class DodgeFactory extends CarroFactory  {

		@Override
		public void getInformacao() {
			System.out.println("lista de Informa��es");
			System.out.println("\t- Montadora: Dodge");
			System.out.println("\t- Ano: 2011");
			System.out.println("\t- Pre�o: 100 mil");
			System.out.println("\t- Flex");
		}
  }

