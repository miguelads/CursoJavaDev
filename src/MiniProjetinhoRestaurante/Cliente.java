package MiniProjetinhoRestaurante;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nomeCliente;
	private int numeroMesa;
    private List<Cardapio> cardapios = new ArrayList<Cardapio>();
    
  //metodos getters e setters------------------------------------------	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getNumeroMesa() {
		return numeroMesa;
	}
	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}
	public List<Cardapio> getCardapios() {
		return cardapios;
	}
	public void setCardapios(List<Cardapio> cardapios) {
		this.cardapios = cardapios;
	}
	
	// metodo hascode e equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardapios == null) ? 0 : cardapios.hashCode());
		result = prime * result + ((nomeCliente == null) ? 0 : nomeCliente.hashCode());
		result = prime * result + numeroMesa;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cardapios == null) {
			if (other.cardapios != null)
				return false;
		} else if (!cardapios.equals(other.cardapios))
			return false;
		if (nomeCliente == null) {
			if (other.nomeCliente != null)
				return false;
		} else if (!nomeCliente.equals(other.nomeCliente))
			return false;
		if (numeroMesa != other.numeroMesa)
			return false;
		return true;
	}
	
	// metodo toString
	@Override
	public String toString() {
		return "Cliente [nomeCliente=" + nomeCliente + ", numeroMesa=" + numeroMesa + ", cardapios=" + cardapios + "]";
	}
	
	public double valorApagar() {
		double preco = 0;
		for(Cardapio cardapio : cardapios) {
		 	preco += cardapio.getValorPrato() * cardapio.getQuantidade();
		}
		return preco;
	}
    	
    	
}
