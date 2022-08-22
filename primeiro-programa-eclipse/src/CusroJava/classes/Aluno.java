package CusroJava.classes;

public class Aluno {
	/*Esses s�o os atributos do Aluno*/
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	private Disciplina disciplina =new Disciplina();
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	
	
	
	
	
	
	
	public Aluno (String nomePadrao) {
		
		nome=nomePadrao;
		
	}

	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
		
		
	} 

	
	
	
	/* veremos o metodo setters e guetters do objeto*/
	/* set � para adicionar ou receber dados para os atributos*/
	/* get � para resgatar ou obter valor do atributo* /
	
	 */

public void setNome(String nome) {
	
	this.nome=nome;
}
public String getNome() {
	return nome;
	
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public String getDataNascimento() {
	return dataNascimento;
}
public void setDataNascimento(String dataNascimento) {
	this.dataNascimento = dataNascimento;
}
public String getRegistroGeral() {
	return registroGeral;
}
public void setRegistroGeral(String registroGeral) {
	this.registroGeral = registroGeral;
}
public String getNumeroCpf() {
	return numeroCpf;
}
public void setNumeroCpf(String numeroCpf) {
	this.numeroCpf = numeroCpf;
}
public String getNomeMae() {
	return nomeMae;
}
public void setNomeMae(String nomeMae) {
	this.nomeMae = nomeMae;
}
public String getNomePai() {
	return nomePai;
}
public void setNomePai(String nomePai) {
	this.nomePai = nomePai;
}
public String getDataMatricula() {
	return dataMatricula;
}
public void setDataMatricula(String dataMatricula) {
	this.dataMatricula = dataMatricula;
}
public String getNomeEscola() {
	return nomeEscola;
}
public void setNomeEscola(String nomeEscola) {
	this.nomeEscola = nomeEscola;
}
public String getSerieMatriculado() {
	return serieMatriculado;
}
public void setSerieMatriculado(String serieMatriculado) {
	this.serieMatriculado = serieMatriculado;
}

/* metodo retorna media do aluno*/
public double getMediaNota() {
	return (disciplina.getNota1()+ disciplina.getNota2()+disciplina.getNota3()
	
	+disciplina.getNota4())/4;
	
}

public boolean getAlunoAprovado() {
	double media = this.getMediaNota();
	if(media>=70) {
		return true;
		
	}else {
		return false;
	}
	
}
public String getAlunoAprovado2() {
	double media = this.getMediaNota();
	if(media>=70) {
		return "Aluno est� aprovado";
		
	}else {
		return "Aluno est� reporvado !!!!";
	}
	
	
	
	
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((nome == null) ? 0 : nome.hashCode());
	result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Aluno other = (Aluno) obj;
	if (nome == null) {
		if (other.nome != null)
			return false;
	} else if (!nome.equals(other.nome))
		return false;
	if (numeroCpf == null) {
		if (other.numeroCpf != null)
			return false;
	} else if (!numeroCpf.equals(other.numeroCpf))
		return false;
	return true;
}



}









