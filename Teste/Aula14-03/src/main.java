
public class main {

	public static void main(String[] args) {
		Empregado heitor = new Empregado("Heitor");
		heitor.salarioBase = 1500;
		heitor.calculaSalario(10);
		
		System.out.println(heitor.nome);
		System.out.println(heitor.matricula);
		System.out.println(heitor.salarioBase);
		
		Empregado gustavo = new Empregado("Gustavo", 3);
		gustavo.salarioBase = 2000;
		
		System.out.println(gustavo.nome);		
		System.out.println(gustavo.matricula);
		System.out.println(gustavo.salarioBase);

	}

}
