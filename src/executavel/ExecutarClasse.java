package executavel;

import java.time.Year;

import javax.swing.JOptionPane;

import orientacaoObjeto.Aluno;

public class ExecutarClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Objeto ainda não existena memória */
		//Aluno aluno1;

		/* Objeto real na memória */
		//Aluno aluno2 = new Aluno();
		
		//Aluno aluno3 = new Aluno("Miguel");
		
		/*
		 * new Aluno() -> é uma instancia ou criando um objeto
		 * aluno1 -> é uma referencia para o objeto aluno*/
      
		/*
		aluno2.setNome("Miguel");
		System.out.println("O nome é " + aluno2.getNome());
		
		aluno2.setNota1(9);
		aluno2.setNota2(8);
		aluno2.setNota3(6);
		aluno2.setNota4(8.5);
		System.out.println("A média do aluno é = " + aluno2.getMediaNota());
		System.out.println("A média do aluno é = " + aluno2.getAlunoAprovado2());
		System.out.println("A média do aluno é = " + aluno2.getAlunoAprovado());
		System.out.println("A média do aluno é = " + (aluno2.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		*/
		// Integer.valueOf() converte para inteiro
		/*
		String nome = JOptionPane.showInputDialog("Qual o nome do usuário?");
		String idade = JOptionPane.showInputDialog("Qual a idade do usuário?");
		aluno2.setNome(nome);
		aluno2.setIdade(Integer.valueOf(idade));
		System.out.println(aluno2.toString());*/
		
		/*Equals e hashcode --> diferenciar e comprar objetos
		 * quando comparamos objetos temos que usar o equal e hashcode
		 * na classe basica, ai sim ele vai poder fazer a comparação, pois
		 * o java por traz ele da um codigo ao objeto que mesmo o objeto tendo
		 * o mesmo valor ele vai da como diferente se não usar o equal e hashcode. 
		*/
		/*
		Aluno aluno = new Aluno();
		aluno.setNome("Miguel");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Miguel");
		
		if(aluno.equals(aluno2)) {
			System.out.println("Alunos são iguais");
		}else {
			System.out.println("Alunos são diferentes");
		}*/
		
		
        /* int [] valores = {12,03,55,33,35};
         
         for(int i=0; i < valores.length; i++) {
        	 System.out.println(valores[i]);
         }*/
		
		
		int ano = Year.now().getValue();
		
		System.out.println(ano);
	}

}
