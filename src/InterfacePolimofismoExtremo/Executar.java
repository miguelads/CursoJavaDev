package InterfacePolimofismoExtremo;

import javax.swing.JOptionPane;

public class Executar {

	public static void main(String[] args) {
		 String login = JOptionPane.showInputDialog("Login");
		 String senha = JOptionPane.showInputDialog("Senha");
		 
		// TemContrato tem = new TemContrato();
		 AcessoSistema acesso = new Pessoa(login, senha);
		 /*
		 if(tem.permitirAcesso(acesso) == true) 
			 System.out.println("Acesso Liberado");
		 }else {
			 System.out.println("Acesso negado");
		 }
		 */
		 
		 
		 // outra forma de amarrar mais ainda
		 
		 if(new TemContrato(acesso).permitirAcesso()) {
			 System.out.println("Acesso Liberado");
		 }else {
			 System.out.println("Acesso negado");
		 }
	}

}
