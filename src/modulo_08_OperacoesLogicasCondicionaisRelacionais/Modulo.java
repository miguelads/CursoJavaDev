package modulo_08_OperacoesLogicasCondicionaisRelacionais;

import javax.swing.JOptionPane;

public class Modulo {
	public static void main(String []args) {
		// mod � o resto da divis�o!
		/*double resto = carro % pessoa;
		System.out.println("Sobraram exatamente " + resto + " carro.");*/
		
		/* tivemos convers�es e casts neste exemplo usando swing do java.
		 * 
		 * 
		 * */
		/*
		String carro = JOptionPane.showInputDialog("Informe a quantidade de carros?");
		String pessoa = JOptionPane.showInputDialog("Informe a quantidade de pessoas?");;
	    double carroNumero = Double.parseDouble(carro);
	    double pessoaNumero = Double.parseDouble(pessoa);
	    int divisao = (int) (carroNumero / pessoaNumero);//este (int) convert para inteiro chamamos de cast
	    //(carroNumero / pessoaNumero) primeiro ele faz a divis�o e depois converte para inteiro
		double resto = carroNumero % pessoaNumero;
	    
	    JOptionPane.showMessageDialog(null, "Divis�o para pessoas deu "+ divisao + " carros e sobrou " + 
	   		 resto + " carro");
	    System.out.println("Divis�o para pessoas deu "+ divisao + " carros e sobrou " + 
	   		 resto + " carro");
		*/
		
		
		// USANDO O CONFIRM DIALOGO
		
		String carro = JOptionPane.showInputDialog("Informe a quantidade de carros?");
		String pessoa = JOptionPane.showInputDialog("Informe a quantidade de pessoas?");;
	    double carroNumero = Double.parseDouble(carro);
	    double pessoaNumero = Double.parseDouble(pessoa);
	    int divisao = (int) (carroNumero / pessoaNumero);
	    double resto = carroNumero % pessoaNumero;
	    
	    int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divis�o?");
	    if(resposta == 0) {
	    	JOptionPane.showMessageDialog(null, "O resultado da divis�o foi " + divisao);
	    }
	    
	    resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divis�o?");
	    if(resposta == 0) {
	    	JOptionPane.showMessageDialog(null, "O resto foi de " + resto);
	    }
	}
}
