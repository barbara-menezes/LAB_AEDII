
public class Empregado {
	int matricula;
	String nome;
	double salarioBase;
	
	Empregado(String nome){
		this.nome = nome;
	}
	
	Empregado(String nome, int matricula){
		this.nome = nome;
		this.matricula = matricula;
	}
	
	double calculaSalario(double horaExtra) {
		return horaExtra;
	}
	
}
