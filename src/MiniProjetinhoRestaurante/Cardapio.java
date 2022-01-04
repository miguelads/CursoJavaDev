package MiniProjetinhoRestaurante;

public class Cardapio {
	private String nomePrato;
	private double valorPrato;
	private int quantidade;
	
	// metodo gtteres e setteres
	public String getNomePrato() {
		return nomePrato;
	}
	public void setNomePrato(String nomePrato) {
		this.nomePrato = nomePrato;
	}
	public double getValorPrato() {
		return valorPrato;
	}
	public void setValorPrato(double valorPrato) {
		this.valorPrato = valorPrato;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	// metedo hascode e equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomePrato == null) ? 0 : nomePrato.hashCode());
		result = prime * result + quantidade;
		long temp;
		temp = Double.doubleToLongBits(valorPrato);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Cardapio other = (Cardapio) obj;
		if (nomePrato == null) {
			if (other.nomePrato != null)
				return false;
		} else if (!nomePrato.equals(other.nomePrato))
			return false;
		if (quantidade != other.quantidade)
			return false;
		if (Double.doubleToLongBits(valorPrato) != Double.doubleToLongBits(other.valorPrato))
			return false;
		return true;
	}
	
	// metodo toString
	@Override
	public String toString() {
		return "Cardapio [nomePrato=" + nomePrato + ", valorPrato=" + valorPrato + ", quantidade=" + quantidade + "]";
	}
	
	
	
}