package projetoAlunoSemComentario;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String quantidadeAluno = JOptionPane.showInputDialog("Digite a quantidade de aluno a ser inserido");
        List<Aluno> alunos = new ArrayList<Aluno>();
		
        for(int qtd=0; qtd <= Integer.valueOf(quantidadeAluno); qtd++) {
		
		Aluno aluno = new Aluno();
		String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno!");
		String anoNascimento = JOptionPane.showInputDialog("digite seu ano de nascimento");
		aluno.setNomeAluno(nomeAluno);
		aluno.setAnoNascimento(Integer.valueOf(anoNascimento));
		alunos.add(aluno);
		
		for (int i = 1; i <= 4; i++) {
			String nomeDisciplina = JOptionPane.showInputDialog("digite a disciplina " + i);
			String nota = JOptionPane.showInputDialog("digite a nota do aluno " + i);
			Disciplina disciplina = new Disciplina();
			disciplina.setNomeDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(nota));
			aluno.getDisciplinas().add(disciplina);
		}
	
	  }	
        for(Aluno aluno : alunos) {
        	System.out.println(aluno.toString());
        	System.out.println("Sua idade é " + aluno.idadeAluno());
        	System.out.println("A média do aluno é " + aluno.calcularMedia() + " e o aluno está "
        			+ aluno.statusAluno());
        	
        }
	}
}
