package Construtor;

public class Pessoa {

	private String nome;
	private int idade;

	//Construtor padrão sem argumento
	public Pessoa() {
	}
	//Construtor com 2 argumentos
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	//Construtor com 1 argumento
	public Pessoa(String nome) {
		this.nome = nome;
	}
	//Construtor com 1 argumento
		public Pessoa(int idade) {
			this.idade = idade;
		}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade= idade;
	}
}
