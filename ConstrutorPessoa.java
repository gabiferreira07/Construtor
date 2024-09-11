package Construtor;

public class ConstrutorPessoa {

	public static void main(String[] args) {

		//Construtor padrão sem argumentos
		Pessoa pessoa1 = new Pessoa();

		pessoa1.setNome("Matheus");
		pessoa1.setIdade(18);

		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());

		//Construtor com 2 argumentos
		Pessoa pessoa2 = new Pessoa("Fulano", 36);

		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());

		//Construtor com 1 argumento
		Pessoa pessoa3 = new Pessoa("Lucas");

		System.out.println(pessoa3.getNome());
		
		//Construtor com 1 argumento
		Pessoa pessoa4 = new Pessoa(17);

		System.out.println(pessoa4.getIdade());
	}

}
