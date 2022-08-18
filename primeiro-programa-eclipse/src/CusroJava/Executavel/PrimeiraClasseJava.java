package CusroJava.Executavel;

import CusroJava.classes.Aluno;

public class PrimeiraClasseJava {

	 public static void main(String[]args) {
		 /*new Aluno() é uma instancia(criação de objeto)*/
		/*aluno1 é uma referencia para o objeto Aluno*/
		 
		 Aluno aluno1=new Aluno(); 
		 aluno1.setNome("João da Silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("10/10/1987");
		aluno1.setRegistroGeral("40.650.669-2");
		aluno1.setNumeroCpf("407.195.958-78");
		aluno1.setNomeMae("Maria");
		aluno1.setNomePai("Antônio");
		aluno1.setDataMatricula("01/06/2005");
		aluno1.setSerieMatriculado("5");
		aluno1.setNomeEscola("Escola JDEV Treinamento");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		
		 
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

