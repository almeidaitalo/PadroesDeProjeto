package Singleton;

public class Log {

	private Log() {

	}

	private static Log instanciar;

	public static Log getInstance() {
		if (instanciar == null)
			instanciar = new Log();
		return instanciar;
	}

	public void println(String mensagem) {
		System.out.println(mensagem);
	}

	public void dados() {

	}

	public void logs1() {
		Log log = Log.getInstance();
		System.out.print("Log" + log.hashCode());
		log.println("Grav1");
	}

	public void logs2() {
		Log log = Log.getInstance();
		System.out.print("Log" + log.hashCode());
		log.println("Grav2");

	}

	public void logs3() {
		Log log = Log.getInstance();
		System.out.print("Log" + log.hashCode());
		log.println("Grav3");
	}

	public static void main(String[] args) {
		Log arg = new Log();
		System.out.println("As instâncias são exatamente as mesmas)");
		arg.logs1();
		arg.logs2();
		arg.logs3();
	}
}
