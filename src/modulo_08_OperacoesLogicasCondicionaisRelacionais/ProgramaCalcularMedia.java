package modulo_08_OperacoesLogicasCondicionaisRelacionais;

import javax.swing.JOptionPane;

public class ProgramaCalcularMedia {

	public static void main(String[] args) {
		// TODO Final do modulo criando um programa para calculo de m�dia!!
		
		String nota1 = JOptionPane.showInputDialog("Informe a primeira nota");
		String nota2 = JOptionPane.showInputDialog("Informe a segunda nota");
		String nota3 = JOptionPane.showInputDialog("Informe a terceira nota");
		String nota4 = JOptionPane.showInputDialog("Informe a quarta nota");
		
		double valor1 = Double.parseDouble(nota1);
		double valor2 = Double.parseDouble(nota2);
		double valor3 = Double.parseDouble(nota3);
		double valor4 = Double.parseDouble(nota4);
		
		double media = (valor1 + valor2 + valor3 + valor4)/4;
		
		if(media >= 7 && media <= 8) {
			JOptionPane.showMessageDialog(null, "Aluno aprovado por m�dia " + media);
		}else if(media > 8 && media <= 9.5) {
			JOptionPane.showMessageDialog(null, "Aluno aprovado por m�dia e com m�rito " + media);
		}else if(media > 9.5) {
			JOptionPane.showMessageDialog(null, "Aluno aprovado com excel�ncia " + media);
		}else {
			JOptionPane.showMessageDialog(null, "Aluno reprovado por m�dia " + media);
		}
		 System.out.println("Primeira nota " + nota1);
		 System.out.println("Segunda nota " + nota2);
		 System.out.println("Terceira nota " + nota3);
		 System.out.println("Quarta nota " + nota4);
		 System.out.println("A m�dia foi " + media);

	}

}
