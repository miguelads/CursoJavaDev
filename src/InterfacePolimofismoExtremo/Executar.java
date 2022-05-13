package InterfacePolimofismoExtremo;

import javax.swing.JOptionPane;

public class Executar {
	/*Diferen�a classe abstrata e Interface:
	 na classe abstrata todas as classes filhas s�o obrigadas a implementar o metodo
	 abstrato, e na interface n�o, a classe tem que assinar um contrato com ela para poder
	 implementar os metodos da interface criada.Resumindo se eu tenho 3 classes filhas e 
	 quero que uma delas tenha um metodo diferente que as outras n�o tenham eu crio uma
	 interface de acorde com a regra de negocio*/
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
