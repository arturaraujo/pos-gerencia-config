package configuracao.beans;

public class Livro {

	private String nome;
	private String autor;
	private Integer ano;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Livro(String nome, String autor, Integer ano) {
		super();
		this.nome = nome;
		this.autor = autor;
		this.ano = ano;
	}

	public Livro() {
		super();
	}

	@Override
	public String toString() {
		return "Livro '" + this.nome + "' de " + this.autor + ", publicado em " + this.ano;
	}

}
