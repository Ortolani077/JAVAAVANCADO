package CusroJava.Executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import java.util.Scanner;

import CusroJava.classes.Aluno;
import CusroJava.classes.Diretor;
import CusroJava.classes.Disciplina;
import CusroJava.classesauxiliares.FuncaoAutenticacao;
import curso.java.exceção.ExcecaoProcessarNota;
import cursojava.constantes.StatusAluno;
public class PrimeiraClasseJava {
	@SuppressWarnings("rawtypes")
	public static  void main(String[]args) {
		
		
		try {
		
			/*lerArquivo();*/
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		
		
		
		
		
		
		if (new FuncaoAutenticacao(new Diretor(login,senha)).autenticar()) { /*vou travar o contraro somente quem realmente tem o contrato 100% legitimo*/
		
		List<Aluno> alunos= new ArrayList<Aluno>();
		
		/*é uma lista que dentro dela temos uma chave que identifica uma sequencia de valores também*/
		
		HashMap<String, List<Aluno>> maps= new HashMap<String, List<Aluno>>();
		
		
		
		for(int qtd=1; qtd<=1; qtd++) {
		
		 /*new Aluno() � uma instancia(cria��o de objeto)*/
		/*aluno1 � uma referencia para o objeto Aluno*/
		 String nome=  JOptionPane.showInputDialog("Qual o nome do aluno "+qtd+" ?");
		 String Idade= JOptionPane.showInputDialog("Qual a idade do aluno? ");
		 /*String DataNascimento= JOptionPane.showInputDialog("Qual data de nascimento do aluno? ");
		 String RegistroGeral= JOptionPane.showInputDialog("Qual o RG do aluno? ");
		 String NumeroCpf= JOptionPane.showInputDialog("Qual o CPF do aluno? ");
		 String NomeMae= JOptionPane.showInputDialog("Qual o nome da m�e do aluno? ");
		 String NomePai= JOptionPane.showInputDialog("Qual o nome do pai do aluno? ");
		 String DataMatricula= JOptionPane.showInputDialog("Qual a data da matr�cula? ");
		 String SerieMatriculado= JOptionPane.showInputDialog("Qual a s�rie matriculado? ");
		 String NomeEscola= JOptionPane.showInputDialog("Qual o nome da Escola? ");
		*/
	
		 
		 Aluno aluno1 = new Aluno();
	
		 aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(Idade));
		
		
		/*aluno1.setDataNascimento(DataNascimento);
		aluno1.setRegistroGeral(RegistroGeral);
		aluno1.setNumeroCpf(NumeroCpf);
		aluno1.setNomeMae(NomeMae);
		aluno1.setNomePai(NomePai);
		aluno1.setDataMatricula(DataMatricula);
		aluno1.setSerieMatriculado(SerieMatriculado);
		aluno1.setNomeEscola(NomeEscola);*/
	
		
	
			
		 for (int pos=1; pos<=1; pos++) {
		
			 String nomeDisciplina =  JOptionPane.showInputDialog("Nome da disciplina " +pos+ " ?");
		String notaDisciplina =  JOptionPane.showInputDialog("Nota da disciplina "+pos+" ?");
	
		 Disciplina disciplina = new Disciplina();
		
		
		disciplina.setDisciplina( nomeDisciplina);
		//disciplina.setNota(Double.valueOf( notaDisciplina));
		
		aluno1.getDisciplinas().add(disciplina);
		
		
		
	
		
	int escolha=	JOptionPane.showConfirmDialog(null, " Deseja remover alguma disciplina? ");
		              
		if(escolha==0) {
			
			int continuarRemover=0;
			int posicao= 1;
			while(continuarRemover==0){
				
			
			
			String disciplinaRemover = (String) JOptionPane.showInputDialog("Qual a disciplina? 1, 2 , 3 ou 4"   );
			aluno1.getDisciplinas().remove(Integer.valueOf((java.lang.String) disciplinaRemover).intValue()-posicao);
			posicao++;
			continuarRemover=JOptionPane.showConfirmDialog(null, "Continuar a remover? ");
			}
			
			
			
		}

		 }
		
		
		alunos.add(aluno1);
		 }
	
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		
		
		
		
		for (Aluno aluno : alunos) {
			if(aluno.getAlunoAprovado2().equals(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else
				if(aluno.getAlunoAprovado2().equals(StatusAluno.RECUPERACAO)){
					
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				}else if(aluno.getAlunoAprovado2().equals(StatusAluno.REPROVADO)) {
					maps.get(StatusAluno.REPROVADO).add(aluno);
					
				}
					
				}
			
		
		System.out.println("------Lista dos aprovados-------");

		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			
			System.out.println(aluno.getNome()  );
			System.out.println("Está  " + aluno.getAlunoAprovado2() +  " com média de: " + aluno.getMediaNota());
		
		}
		

		System.out.println("------Lista dos reprovados-------");

		for (Aluno aluno :maps.get(StatusAluno.REPROVADO)) {
			
			System.out.println(aluno.getNome() ) ;
			System.out.println("Está  " +aluno.getAlunoAprovado2()+ " com média de: " + aluno.getMediaNota());
			
		}

		
		System.out.println("------Lista dos alunos em recuperação -------");

		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println(aluno.getNome() );
			System.out.println("Está " +aluno.getAlunoAprovado2()+ "com média de: " + aluno.getMediaNota());
		
		
	
		
		
		}

		
		}else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido" );
		}
	
	/*aqui*/
	

		}catch (Exception e) {
			
			StringBuilder saida= new StringBuilder();
			
			
			
			e.printStackTrace();
		
			/*Impressão do erro ou causa*/
			
			System.out.println("Mensagem " +e.getMessage());
			for(int i=0;i<e.getStackTrace().length; i++ ) {
				saida.append("\n Classe de erro " +e.getStackTrace()[i].getClassName());
			
				saida.append("\n Metodo de erro:  "  +e.getStackTrace()[i].getMethodName());
				saida.append("\n Linha de erro:  "  +e.getStackTrace()[i].getLineNumber());
				saida.append("\n Classe:  "  +e.getClass().getName());
			}
			
			
		JOptionPane.showMessageDialog(null, "Erro de conversão de números"  + saida.toString());
		
		
		}finally {/*Sempre é executado ocorrendo erros ou não */
			JOptionPane.showMessageDialog(null, "Obrigado por usar nosso sistema");
			
		}
		
	}
	
	
	public static void lerArquivo() throws FileNotFoundException {
		
		
		File fil = new File ("c://lines.txt");
		Scanner scanner = new Scanner(fil);
		}
	}
	


	
	
	
	
	
	
		
		
	
		
		


	
	
