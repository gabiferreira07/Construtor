package Construtor;

public class Consulta {
	String data;
	String nomePcnte;
	String nomeDents;
	public Consulta() {
	}
	public Consulta(String data, String nomePcnte, String nomeDents) {
		this.data = data;
		this.nomePcnte = nomePcnte;
		this.nomeDents = nomeDents;
	}
	public Consulta(String data) {
		this.data = data;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getNomePcnte() {
		return nomePcnte;
	}
	public void setNomePcnte(String nomePcnte) {
		this.nomePcnte = nomePcnte;
	}
	public String getNomeDents() {
		return nomeDents;
	}
	public void setNomeDents(String nomeDents) {
		this.nomeDents = nomeDents;
	}
}

