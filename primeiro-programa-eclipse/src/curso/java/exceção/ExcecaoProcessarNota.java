package curso.java.exceção;

public class ExcecaoProcessarNota extends Exception {

	public ExcecaoProcessarNota(String erro) {
		super (" Erro no processamento de notas do aluno " +erro);
		
	}
}
