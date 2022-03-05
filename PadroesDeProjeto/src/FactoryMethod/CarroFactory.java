package FactoryMethod;

public abstract class CarroFactory{
		
		public abstract void getInformacao();
		
		public void acelerar() {
			System.out.println("Acelerar");
		}

		public void frear() {
			System.out.println("frear");
		}

		public void trocarMarcha() {
			System.out.println("trocarMarcha");
		}
	}

