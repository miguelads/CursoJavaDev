package modulo_10_Heranca;
/*este implements a classe assina o contrato com a classe PermitirAcesso*/
public class Secretario extends Pessoa implements PermitirAcesso {
	private String registro;
	private String nivelCargo;
	private String experiencia;
	private String login;
	private String senha;
	
	public Secretario() {}//construtor padr�o, ajuda a n�o quebrar o resto do sistema que que na hora
	// da cria��o do objeto n�o vai exigir nem o login nem senha
	
	public Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	/*
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
	}*/
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}
	/*esse � o metodo do contrato de autentica��o
	@Override
	public boolean autenticar() {
		return true;//login.equals("admin") && senha.equals("admin");
		//retorna se a senha e login � igual a admin
	}*/
	
	// implementando a interface com par�metros
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;//este metodo n�o esta sendo usado, mais permaneceu pois
		return autenticar();// esta na interface e se caso precise pode ser usado...
	}
	@Override
	public boolean autenticar() {
		return login.equals("admin") && senha.equals("admin");
	}
	
	
}
