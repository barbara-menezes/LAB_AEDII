
public class TesteMyIo {
	public static void main(String[] args) {
		String str;
		
		
		str = MyIO.readString("Entre com uma palavra: ");
		int inteiro = MyIO.readInt("Entre com um inteiro: ");
		double real = MyIO.readDouble("Entre com um real: ");
  		char caractere = MyIO.readChar("Entre com um caractere:");
		MyIO.println("Sua string: " + str);
		MyIO.println("Seu inteiro: " + inteiro);
  		MyIO.println("Seu real: " + real);
		MyIO.println("Seu caractere: " + caractere);
		
		
		/*
		str = MyIO.readLine("/home/sinaide/eclipse-workspace/teste_arquivo/pri.in");
		MyIO.println("Sua string: " + str);
		char c = MyIO.readChar("/home/sinaide/eclipse-workspace/teste_arquivo/pri.in");
		MyIO.println("Sua string: " + c);
		*/
		
		str = "Hello!";
		for(int i = 0; i < str.length(); i++) {
			//char ch = str.charAt(i);
			char ch = MyIO.readChar(str);
			MyIO.print(ch +" ");
		}

	}
}
