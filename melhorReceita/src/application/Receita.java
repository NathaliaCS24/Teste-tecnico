package application;

import java.util.ArrayList;
import java.util.List;

public class Receita {
	private String nome;
	private Integer tempo;
	private String modoPreparo;
	private List<Ingredientes> ingredientes = new ArrayList<>():

	
	public Receita() {
	}

	public Receita(String nome, String ingrediente, Integer quantidade, Integer tempo, String modoPreparo) {
		this.nome = nome;
		this.tempo = tempo;
		this.modoPreparo = modoPreparo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTempo() {
		return tempo;
	}

	public void setTempo(Integer tempo) {
		this.tempo = tempo;
	}

	public String getModoPreparo() {
		return modoPreparo;
	}

	public void setModoPreparo(String modoPreparo) {
		this.modoPreparo = modoPreparo;
	}

	

}
