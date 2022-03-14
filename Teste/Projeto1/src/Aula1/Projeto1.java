package Aula1;

public class Projeto1 {

	public static void main(String[] args) {
		float a = 77;
		float b = 33;
		calculadora_simples calc = new calculadora_simples(a, b);  //instanciar novo objeto (calculadora_simples)
		
		b++;
		a++;
		
						
		calc.soma();

	}

}
