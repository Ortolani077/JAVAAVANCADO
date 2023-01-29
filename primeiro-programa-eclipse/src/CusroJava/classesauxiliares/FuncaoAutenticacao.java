package CusroJava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Somente receber alguém que tenha o contrato da interface
 * de permitir acesso e chamar o autenticar*/

public class FuncaoAutenticacao {

	public boolean autenticarCursoJava(PermitirAcesso acesso) {
		
		return acesso.autenticar();
		
		
	}
	
	
}
