package Prototype;

final class Livro implements Cloneable {
	String editora;
	String titulo;
	String autor;
	String idioma;
	String assunto;
	String edicao;
	String dedicatoria;

	@Override
	public Livro clone() throws CloneNotSupportedException {
		return (Livro) super.clone();
	}

	@Override
	public String toString() {
		return "Livro [editora= " + editora + ", titulo= " + titulo + ", autor= " + autor + ", idioma= " + idioma
				+ ", assunto= " + assunto + ", edição= " + edicao + ", dedicatória= " + dedicatoria + "]";
	}

}
