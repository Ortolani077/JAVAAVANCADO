package CusroJava.Executavel;

import javax.swing.JOptionPane;

import CusroJava.classes.Aluno;

public class PrimeiraClasseJava {

	 public static void main(String[]args) {
		 /*new Aluno() é uma instancia(criação de objeto)*/
		/*aluno1 é uma referencia para o objeto Aluno*/
		 String nome= JOptionPane.showInputDialog("Qual o nome do aluno? ");
		 String Idade= JOptionPane.showInputDialog("Qual a idade do aluno? ");
		 String DataNascimento= JOptionPane.showInputDialog("Qual data de nascimento do aluno? ");
		 String RegistroGeral= JOptionPane.showInputDialog("Qual o RG do aluno? ");
		 String NumeroCpf= JOptionPane.showInputDialog("Qual o CPF do aluno? ");
		 String NomeMae= JOptionPane.showInputDialog("Qual o nome da mãe do aluno? ");
		 String NomePai= JOptionPane.showInputDialog("Qual o nome do pai do aluno? ");
		 String DataMatricula= JOptionPane.showInputDialog("Qual a data da matrícula? ");
		 String SerieMatriculado= JOptionPane.showInputDialog("Qual a série matriculado? ");
		 String NomeEscola= JOptionPane.showInputDialog("Qual o nome da Escola? ");
		 String Nota1= JOptionPane.showInputDialog("Qual a Nota 1? ");
		 String Nota2= JOptionPane.showInputDialog("Qual a Nota 2? ");
		 String Nota3= JOptionPane.showInputDialog("Qual a Nota 3? ");
		 String Nota4= JOptionPane.showInputDialog("Qual a Nota 4? ");
		
		 
		 Aluno aluno1=new Aluno(); 
		 aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(Idade));
		aluno1.setDataNascimento(DataNascimento);
		aluno1.setRegistroGeral(RegistroGeral);
		aluno1.setNumeroCpf(NumeroCpf);
		aluno1.setNomeMae(NomeMae);
		aluno1.setNomePai(NomePai);
		aluno1.setDataMatricula(DataMatricula);
		aluno1.setSerieMatriculado(SerieMatriculado);
		aluno1.setNomeEscola(NomeEscola);
		aluno1.setNota1(Double.parseDouble(Nota1));
		aluno1.setNota2(Double.parseDouble(Nota2));
		aluno1.setNota3(Double.parseDouble(Nota3));
		aluno1.setNota4(Double.parseDouble(Nota4));
		
		
		 
		 System.out.println("Nome é: " +aluno1.getNome());
		 System.out.println("A idade é: " +aluno1.getIdade());
		 System.out.println("Data de nascimento: " +aluno1.getDataNascimento());
		 System.out.println("Número do RG: " +aluno1.getRegistroGeral());
		 System.out.println("Número do CPF: " +aluno1.getNumeroCpf());
		 System.out.println("Nome da mãe: " +aluno1.getNomeMae());
		 System.out.println("Nome do pai: " +aluno1.getNomePai());
		 System.out.println("Data da matrícula: " +aluno1.getDataMatricula());
		 System.out.println("Série matriculado: " +aluno1.getSerieMatriculado());
		 System.out.println("Nome da escola é:" +aluno1.getNomeEscola());
		 System.out.println("Média da nota é: " +aluno1.getMediaNota());
		 System.out.println("Resultado =  " +(aluno1.getAlunoAprovado()? "Aprovado":
			 "Reprovado"));
		 System.out.println("Resultado2: " +aluno1.getAlunoAprovado2() );	
		 
		 
		 
		 
		 /* -----------------------------------------------------------------------*/
		 System.out.println("-------------------------");
		 System.out.println("-------------------------");
		 System.out.println("-------------------------");
		
		 
		 
		 
		 Aluno aluno2=new Aluno();
		 aluno2.setNome("Pedro Luiz");
			aluno2.setIdade(40);
			aluno2.setDataNascimento("10/08/1998");
			aluno2.setRegistroGeral("50.465.458.78");
			aluno2.setNumeroCpf("401.458.985.78");
			aluno2.setNomeMae("Silvia");
			aluno2.setNomePai("Marcos");
			aluno2.setDataMatricula("01/06/2017");
			aluno2.setSerieMatriculado("7");
			aluno2.setNomeEscola("Escola JDEV Treinamento");
			
		 
		 
			System.out.println("Nome é: " +aluno2.getNome());
			 System.out.println("A idade é: " +aluno2.getIdade());
			 System.out.println("Data de nascimento: " +aluno2.getDataNascimento());
			 System.out.println("Número do RG: " +aluno2.getRegistroGeral());
			 System.out.println("Número do CPF: " +aluno2.getNumeroCpf());
			 System.out.println("Nome da mãe: " +aluno2.getNomeMae());
			 System.out.println("Nome do pai: " +aluno2.getNomePai());
			 System.out.println("Data da matrícula: " +aluno2.getDataMatricula());
			 System.out.println("Série matriculado: " +aluno2.getSerieMatriculado());
			 System.out.println("Nome da escola é:" +aluno2.getNomeEscola());
			 
		 
		 
		 
		 
		 
		 Aluno aluno3=new Aluno(); 
		 
		 Aluno aluno4=new Aluno("Maria");
		 
		 Aluno aluno5=new Aluno("José..", 50);
		 
		 
		 
	 }
	
}

