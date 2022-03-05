package Builder;

public class Foguete {

	private String cor;
	private String modelo;
	private String motor;
	private String tanqueCombustivel;
	private String numeroDeAssentos;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getTanqueCombustivel() {
		return tanqueCombustivel;
	}

	public void setTanqueCombustivel(String tanqueCombustivel) {
		this.tanqueCombustivel = tanqueCombustivel;
	}

	public String getNumeroDeAssentos() {
		return numeroDeAssentos;
	}

	public void setNumeroDeAssentos(String numeroDeAssentos) {
		this.numeroDeAssentos = numeroDeAssentos;
	}

	@Override
	public String toString() {
		return "Foguete [cor=" + cor + ", modelo=" + modelo + ", motor=" + motor + ", tanqueCombustivel="
				+ tanqueCombustivel + ", numeroDeAssentos=" + numeroDeAssentos + "]";
	}

}
