package Construtor;

public class ConstrutorConsulta {

	public static void main(String[] args) {
		
		Consulta consulta1 = new Consulta("10/09, as 8:00 ");
		Consulta consulta2 = new Consulta("12/09");
		Consulta cosulta3 = new Consulta();
		System.out.println(consulta1.getData());
		System.out.println(consulta1.getNomePcnte());
		System.out.println(consulta1.getNomeDents());
		System.out.println(consulta2.getData());
	}
}
