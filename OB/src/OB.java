
public class OB {

	public static void main (String args []){ 
		 int val = 11; 
		 TestaPassagemParametros.trocaValorPrimitivo (val); 
		 System.out.println ("val = "+val); 
		 
		 ContaCorrente minhaConta = new ContaCorrente ("SuperHomem"); 
		 System.out.println (minhaConta.saldo); 
		 TestaPassagemParametros.trocaValorObjeto (minhaConta); 
		 System.out.println (minhaConta.saldo); 
		 TestaPassagemParametros.trocaReferenciaObjeto (minhaConta); 
		 System.out.println (minhaConta.nome); 
		 }
	
}
