package modulo_11_classeCostumizadaExcecao;

public class Aluno {
	private String nome;
	private String serie;
	private String professor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	/*o principal objetivo de uma classe de exce��o costumizada:
	 * podemos passar mensagens genericas e deixar como padr�o, ou agente fazer 
	 * a captura da exce��o e da uma mensagem especifica para ela*/
	
}
