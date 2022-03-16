package InterfaceComConstrutores;

public class Pessoa implements AcessoSistema{
	private String nome;
	private int idade;
	private String login;
	private String senha;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public boolean validar() {
		return login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin");
	}
	public Pessoa() {}
	public Pessoa(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	
	
	
}
