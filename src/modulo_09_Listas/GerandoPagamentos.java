package modulo_09_Listas;

import javax.swing.JOptionPane;

public class GerandoPagamentos {

	public static void main(String[] args) {
		
		//criando uma lista de pagamento por m�s e adicionando os pagamentos na lista.
		Funcionario funcionario = new Funcionario();
		String valor = JOptionPane.showInputDialog("Digite a quantidade de meses pago!");
        if(valor.equals("")) {
        	JOptionPane.showMessageDialog(null, "Valor vazio n�o pode fazer a opera��o");
        }else {
        	  for(int cont=0; cont <= Integer.valueOf(valor); cont++) {
        		   Pagamento pagamento = new Pagamento();
	        		   String codigo = JOptionPane.showInputDialog("Digite o c�digo de pagamento!");
	        		   		pagamento.setCodigo(Integer.valueOf(codigo));
	        		   String mes = JOptionPane.showInputDialog("Digite o m�s que foi pago!");
	        		   		pagamento.setMes(mes);
	        		   String salario = JOptionPane.showInputDialog("Digite o sal�rio do m�s de " + pagamento.getMes() +"!");
	        		   		pagamento.setSalario(Double.valueOf(salario));
	        		   		funcionario.getPagamentos().add(pagamento);
        	  }
        	
        }
        
        // listando os pagamentos 
        
        for(Pagamento pg: funcionario.getPagamentos()) {
        	System.out.println("C�digo : " + pg.getCodigo());
        	System.out.println("M�s : " + pg.getMes());
        	System.out.println("Sal�rio : " + pg.getSalario());
        	System.out.println("-----------------------------------------------------");
        }
        
        // removendo seu pagamento pelo seu c�digo:
        
          int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja remover o pagamento");
          if(confirmacao == 0) {
        	  String codigoPagamento = JOptionPane.showInputDialog("Digite o codigo de pagamento");
        	  for(Pagamento pagamento:funcionario.getPagamentos()) {
        		  if(pagamento.getCodigo() == Integer.valueOf(codigoPagamento)) {
        			 
        			  funcionario.getPagamentos().remove(pagamento);
        			  break;// usamos o break para interroper o loop
        		  }
        	  }
        	  
        	  
          }else {
        	  JOptionPane.showMessageDialog(null, "Continuou o sistema");
          }
          
          for(Pagamento pg: funcionario.getPagamentos()) {
          	System.out.println("C�digo : " + pg.getCodigo());
          	System.out.println("M�s : " + pg.getMes());
          	System.out.println("Sal�rio : " + pg.getSalario());
          	System.out.println("-----------------------------------------------------");
          }
          
          // procurar pagamento 
           int opcao = JOptionPane.showConfirmDialog(null,"Deseja procurar um pagamento");
           if(opcao == 0) {
        	   String txtValor = JOptionPane.showInputDialog("Digite o c�digo para buscar o pagamento");
        	   for(Pagamento pg: funcionario.getPagamentos()) {
        		   if(pg.getCodigo() == Integer.valueOf(txtValor)) {
        			   System.out.println("C�digo : " + pg.getCodigo());
        	           System.out.println("M�s : " + pg.getMes());
        	           System.out.println("Sal�rio : " + pg.getSalario());
        	           break;
        		   }else {
        			   JOptionPane.showMessageDialog(null, "Pagamento n�o est� cadastrado!");
        		   }
        	   }
           }
           
           // editar valor
           int opcao2 = JOptionPane.showConfirmDialog(null,"Deseja Editar o pagamento");
           if(opcao2 == 0) {
        	   String txtValor = JOptionPane.showInputDialog("Digite o c�digo do pagamento que deseja editar");
        	   for(Pagamento pg: funcionario.getPagamentos()) {
        		   if(pg.getCodigo() == Integer.valueOf(txtValor)) {
        			   String mes = JOptionPane.showInputDialog("Digite o m�s que foi pago!");
	        		   String salario = JOptionPane.showInputDialog("Digite o sal�rio do m�s!");
	        		   pg.setMes(mes);
	        		   pg.setSalario(Double.valueOf(salario));
	        		   funcionario.getPagamentos().add(pg);
		        		   for(Pagamento p: funcionario.getPagamentos()) {
		                    	System.out.println("C�digo editado : " + p.getCodigo());
		                    	System.out.println("M�s editado: " + p.getMes());
		                    	System.out.println("Sal�rio editado: " + p.getSalario());
		                    	System.out.println("-----------------------------------------------------");
		                    }
		        		   		break;
        		   }else {
        			   JOptionPane.showMessageDialog(null, "N�o foi possiv�l editar!");
        		   }
        	   }
           }
           
          
           
           // chamando o metodo de somar salario
          JOptionPane.showMessageDialog(null, funcionario.somaSalario());
	}

}
