package Construtor;

public class Carro {
	
	private String placa;
	private int chassi;

	//Construtor padrão sem argumento
	public Carro() {
	}
	//Construtor com 2 argumentos
	public Carro(String placa, int chassi) {
		this.placa = placa;
		this.chassi = chassi;
	}
	//Construtor com 1 argumento
	public Carro(String placa) {
		this.placa = placa;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getChassi() {
		return chassi;
	}
	public void setChassi(int chassi) {
		this.chassi= chassi;
	}
}
