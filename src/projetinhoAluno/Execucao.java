package projetinhoAluno;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
	 Disciplina disciplina1 = new Disciplina();
	 Disciplina disciplina2 = new Disciplina();
	 Disciplina disciplina3 = new Disciplina();
	 Disciplina disciplina4 = new Disciplina();
	 
	 Aluno aluno = new Aluno();
	 
	 disciplina1.setDisciplina("Java Web");
	 disciplina1.setNota(7.5);
	 disciplina2.setDisciplina("Java Script");
	 disciplina2.setNota(8.5);
	 disciplina3.setDisciplina("HTML & CSS");
	 disciplina3.setNota(7.5);
	 disciplina4.setDisciplina("SQL Server");
	 disciplina4.setNota(9.5);
	 
	 aluno.setNome("Junior Miguel");
	 aluno.setInstituicao("Unibratec");
	 aluno.setCpf("012.535.924-53");
	 aluno.getDisciplinas().add(disciplina1);
	 aluno.getDisciplinas().add(disciplina2);
	 aluno.getDisciplinas().add(disciplina3);
	 aluno.getDisciplinas().add(disciplina4);
	 
	 System.out.println(aluno.toString());
	 System.out.println("A média do Aluno foi " + aluno.calculoMedia());
	 System.out.println("O aluno está " + (aluno.resultadoAluno() ? "aprovado" : "reprovado"));
	 
	*/
		
		// Fazendo de forma mais dinamica...
		
	   List<Aluno> alunos = new ArrayList<Aluno>();// criando lista de alunos
		
		for(int i = 1; i <= 2; i++) {
		String nome = JOptionPane.showInputDialog("Nome do Aluno");
		String cpf = JOptionPane.showInputDialog("CPF do Aluno");
		String instituicao = JOptionPane.showInputDialog("Instituição do Aluno");
		String ano = JOptionPane.showInputDialog("Digite o ano de aniversario");
		
		// instanciar o aluno para poder inserir os dados
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setCpf(cpf);
		aluno.setInstituicao(instituicao);
		aluno.setAnoNascimento(Integer.valueOf(ano));
		
		// deixando de forma dinamica construindo um for para colocar 4 notas e 4 disciplinas
		
		for(int pos =1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos);
			String notaDisciplina = JOptionPane.showInputDialog("Nota " + pos);
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));// double.ValueOf() convert de String para double
			
			aluno.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		if(escolha == 0) {
		  /*no array ele remove por inteiros e no remove no metodo ele remove por objetos
		   * então usamos o método intValue() para remover pelo indice da lista e o -1 para 
		   * pegar o valor exato ja que em toda lista se inicia com o zero!*/
		  int continuarRemover = 0;
		  int pos = 1;
		  while(continuarRemover == 0) {
			  String removerDisciplna = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4");
			  aluno.getDisciplinas().remove(Integer.valueOf(removerDisciplna).intValue() -pos); 
			  pos++; // este incremento serve para tirar um erro de excluir o 2 e depois o 4 e não da erro de posição
			  continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover");
			  System.out.println(aluno.toString());
		   }
		  
		    }
		       alunos.add(aluno);
		}
		
		 for(Aluno aluno : alunos) {
			 System.out.println(aluno.toString());
			 System.out.println("A média do aluno é " + aluno.calculoMedia());
			 System.out.println("O aluno está " + (aluno.resultadoAluno() ? " aprovado " : " reprovado "));
			 System.out.println("Sua idade é " + aluno.calcularIdade()); 
			 
		 }
		
}

}
