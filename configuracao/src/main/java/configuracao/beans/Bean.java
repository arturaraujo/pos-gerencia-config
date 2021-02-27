package configuracao.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Bean {
	
	private List<Livro> livros;
	
	public Bean() {
		this.livros = new ArrayList<Livro>();
	}
	
	@PostConstruct
	public void init() {
		this.livros.add(new Livro("Dracula", "Bram Stoker", 1897));
		this.livros.add(new Livro("Harry Potter and the Philosopher's Stone", "J. K. Rowling", 1997));
		this.livros.add(new Livro("The Fellowship of the Ring", "J. R. R. Tolkien", 1954));
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
}
