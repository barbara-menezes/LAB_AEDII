public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Cliente c1 = null, c2 = null, c3 = null;
	    MyIO.println("ADDRs:\nc1(" + c1 + ")\nc2(" + c2 + ")\nc3(" + c3 + ")");
	    
	    c1 = new Cliente(1, "aa");	    
	    c2 = c1;     
	    c3 = new Cliente(2, "bb");
	    MyIO.println("ADDRs:\nc1(" + c1 + ")\nc2(" + c2 + ")\nc3(" + c3 + ")");
	    c2.setCodigo(3);
	    MyIO.println("ATRIBUTOs:");
	    MyIO.println("c1(" + c1.getCodigo() + " / " + c1.getNome() + ")");
	    MyIO.println("c2(" + c2.getCodigo() + " / " + c2.getNome() + ")");
	    MyIO.println("c3(" + c3.getCodigo() + " / " + c3.getNome() + ")");
	}		
}
