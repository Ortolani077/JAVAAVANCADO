package CusroJava.Executavel;

import javax.swing.JOptionPane;

import com.sun.tools.javac.util.Position;

import CusroJava.classes.Aluno;
import CusroJava.classes.Disciplina;

public class ArrayVetor {
	
	
	public static void main(String[] args) {
	
		double[] notasJava= {8.8,9.7,7.6,6.8};
		double[] notasLogica= {9.6,5.6,6.9,6.0};
		
		
		
		
	Aluno aluno= new Aluno ();
	aluno.setNome("Rodrigo");
	aluno.setNomeEscola("Jdev");
	
	Disciplina disciplina = new Disciplina();	
	disciplina.setDisciplina("Curso de Java");	
	
	
	
	
	disciplina.setNota(notasJava);	
	
	
	aluno.getDisciplinas().add(disciplina);
	
	Disciplina disciplina2 = new Disciplina();
	disciplina2.setDisciplina("Lógica de programação");
	disciplina2.setNota(notasLogica);
	
	aluno.getDisciplinas().add(disciplina2);
	
	//-------------------------------------------------------//-
	
	Aluno[] arrayAlunos= new Aluno[1];
	
	arrayAlunos[0]= aluno;
	
	for(int pos=0; pos< arrayAlunos.length; pos++) {
		
		System.out.println("Nome do alunoé: " + arrayAlunos[pos].getNome());
		
		for(Disciplina d : arrayAlunos[pos].getDisciplinas()) {
			System.out.println("Nome da disciplina é: " +d.getDisciplina());
			for(int posnota=0; posnota<d.getNota().length; posnota++) {
				System.out.println("A nota número: " +posnota+ "é igual = " +d.getNota()[posnota] );
				
			}
			
		}
		
	}
	
	
	
	
	
	
	
	}
}