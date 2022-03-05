package Prototype;

public class ImprimirLivro {
	public static void main(String[] args) throws CloneNotSupportedException {

		Livro l = new Livro();
		l.editora = "HarperCollins Brasil";
		l.titulo = "O Pequeno Principe";
		l.autor = "Antoine De Saint- Exup�ry";
		l.idioma = "Portugu�s";
		l.assunto = "fic��o infantil";
		l.edicao = "2�";
		l.dedicatoria = "Jean";

		Livro l1 = l.clone();

		String listaDededicatoria[] = { "Italo", "P�rola", "Beto" };

		System.out.println("--------------Imprimindo Livro--------------");
		System.out.println("");
		for (int i = 0; i < listaDededicatoria.length; i++) {

			l1.dedicatoria = listaDededicatoria[i];
			System.out.println(l1);
			System.out.println("");

		}

	}
}
