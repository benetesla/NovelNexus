package Livros;

import autor.Autor;
import autor.AutorNuloException;
import produtos.Produto;

public abstract class Livro implements Produto {
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;

	public Livro(Autor autor) {
		if (autor == null) {
			throw new AutorNuloException("O livro deve ter um autor");
		}
	}

	protected boolean temAutor() {
		return this.autor != null;
	}

	public void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do livro ");
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);

		if (this.temAutor()) {
			autor.mostrarDetalhes();
		}
		System.out.println("--");
	}

	public abstract boolean aplicaDescontoDe(double porcentagem);

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public void setWaterMark(String string) {
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Livro))
			return false;
		Livro outro = (Livro) obj;
		return this.isbn.equals(outro.isbn);
	}

}
