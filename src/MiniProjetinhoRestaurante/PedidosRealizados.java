package MiniProjetinhoRestaurante;

import javax.swing.JOptionPane;

public class PedidosRealizados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	Cliente  cliente = new Cliente();
	
	JOptionPane.showMessageDialog(null, "Faça seu pedido do cardapio!");
	String qtdCadastroPrato = JOptionPane.showInputDialog("Digite a quantidade de pedidos de pratos");
	
	for(int i=1; i <= Integer.valueOf(qtdCadastroPrato); i++) {
		String nomePrato = JOptionPane.showInputDialog("Digite o nome do prato");
		String valorPrato = JOptionPane.showInputDialog("Digite o valor do prato");
		String quantidade = JOptionPane.showInputDialog("Digite a quantidade de pedido");
		Cardapio cardapio = new Cardapio();	
		cardapio.setNomePrato(nomePrato);
		cardapio.setValorPrato(Double.valueOf(valorPrato));
		cardapio.setQuantidade(Integer.valueOf(quantidade));
		cliente.getCardapios().add(cardapio);
	}
	
    System.out.println(cliente.toString());
    System.out.println("------------------------------------------------");
	System.out.println("Valor total a pagar " + cliente.valorApagar());
		
		
		
		
	}

}
