package entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pessoa {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private String genero;
	private String corDosOlhos;
	private String corDoCabelo;
	private Date dataNascimento;
	private String tipoSanguineo;
	private char fatorRh;
	
	
	public Pessoa() {
	}


	public Pessoa(String nome, String genero, String corDosOlhos, String corDoCabelo, Date dataNascimento,
			String tipoSanguineo, char fatorRh) {
		this.nome = nome;
		this.genero = genero;
		this.corDosOlhos = corDosOlhos;
		this.corDoCabelo = corDoCabelo;
		this.dataNascimento = dataNascimento;
		this.tipoSanguineo = tipoSanguineo;
		this.fatorRh = fatorRh;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCorDosOlhos() {
		return corDosOlhos;
	}


	public void setCorDosOlhos(String corDosOlhos) {
		this.corDosOlhos = corDosOlhos;
	}


	public String getCorDoCabelo() {
		return corDoCabelo;
	}


	public void setCorDoCabelo(String corDoCabelo) {
		this.corDoCabelo = corDoCabelo;
	}


	public Date getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getTipoSanguineo() {
		return tipoSanguineo;
	}


	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}


	public char getFatorRh() {
		return fatorRh;
	}


	public void setFatorRh(char fatorRh) {
		this.fatorRh = fatorRh;
	}
	
	
	public Integer idade(int ano) {
		int esteAno = Calendar.getInstance().get(Calendar.YEAR);
		return esteAno - ano;
	}
	
	String cor;
	public String corOlhos(String cor1, String cor2) {
		if (cor1 == "CASTANHO" && cor2 == "CASTANHO") {
			cor = "75% castanho/19% verdes/6% azuis";
		}
		else if (cor1 == "VERDE" && cor2 == "CASTANHO") {
			cor = "50% castanho/37% verdes/12% azuis";
		}
		else if (cor1 == "AZUL" && cor2 == "CASTANHO") {
			cor = "50% castanho/0% verdes/50% azuis";
		}
		else if (cor1 == "VERDE" && cor2 == "VERDE") {
			cor = "-1% castanho/75% verdes/25% azuis";
		}
		else if (cor1 == "VERDE" && cor2 == "AZUL") {
			cor = "0% castanho/50% verdes/50% azuis";
		}
		return cor;
	}

	@Override
	public String toString() {
		return "Nome: " 
				+ nome 
				+ ", Gênero: " 
				+ genero 
				+ ", Cor dos Olhos: " 
				+ corDosOlhos 
				+ ", Cor do cabelo: "
				+ corDoCabelo 
				+ ", Data de nascimento: " 
				+ sdf.format(dataNascimento) 
				+ ", Tipo sanguíneo: " 
				+ tipoSanguineo 
				+ ", Fator RH: "
				+ fatorRh;
	}
	
	

}
