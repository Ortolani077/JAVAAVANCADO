package CusroJava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Somente receber alguém que tenha o contrato da interface
 * de permitir acesso e chamar o autenticar*/

public class FuncaoAutenticacao {

	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		
		return permitirAcesso.autenticar();
		
		
	}
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso= acesso;
		
	}
	
}
