package Construtor;

public class ConstrutorAnimal {

	public static void main(String[] args) {

		Animal animal1 = new Animal("Branco",9);
		System.out.println("-------ANIMAL 1------");
		System.out.println(animal1.getCor());
		System.out.println(animal1.getTamanho());
		
		//*******************************************
		
		Animal animal2 = new Animal("Preto");
		System.out.println("-------ANIMAL 2------");
		System.out.println(animal2.getCor());
		
		//********************************************
		
		Animal animal3 = new Animal(8);
		System.out.println("-------ANIMAL 3------");
		System.out.println(animal3.getTamanho());
	}
}

