package Construtor;

public class ConstrutorCarro {
	
	public static void main(String[] args) {
	
	//Construtor padrão sem argumentos
	Carro carro1 = new Carro();

	carro1.setPlaca("AD18V43");
	carro1.setChassi(1865469);

	System.out.println(carro1.getPlaca());
	System.out.println(carro1.getChassi());

	//Construtor com 2 argumentos
	Carro carro2 = new Carro("DSG3722", 24595 );

	System.out.println(carro2.getPlaca());
	System.out.println(carro2.getChassi());

	//Construtor com 1 argumento
	Carro carro3 = new Carro("Lucas");

	System.out.println(carro3.getPlaca());
	}
}
