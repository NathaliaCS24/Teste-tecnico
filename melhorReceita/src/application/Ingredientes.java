package application;

public class Ingredientes {
	private String  nome;
	private Integer quantidade;
	
	public Ingrediente() {
	}

	public Ingredientes(String nome, Integer quantidade) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
