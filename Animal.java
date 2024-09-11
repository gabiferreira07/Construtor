package Construtor;

public class Animal {

	private int tamanho;
	private String cor;
	public Animal(String cor, int tamanho) {
		this.cor =cor;
		this.tamanho = tamanho;
	}
	public Animal (String cor) {
		this.cor = cor;
	}
	public Animal(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
}
