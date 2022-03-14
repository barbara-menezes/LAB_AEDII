package Aula1;

public class calculadora_simples {
	
	private float numa, numb;
	
	public calculadora_simples(float a, float b) {
		this.numa = a;
		this.numb = b;
	}
	
	public void soma() {
		System.out.println("Soma");
		System.out.println(numa + numb);
	}
	
	public void subtracao(float a, float b) {
		System.out.println("Subtracao");
		System.out.println(a - b);
	}
	
	public void mult(float a, float b) {
		System.out.println("Multiplicação");
		System.out.println(a * b);
	}
	
	public void divisao(float a, float b) {
		System.out.println("Divisão");
		System.out.println(a / b);
	}
	

}
