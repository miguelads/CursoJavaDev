package modulo_10_Heranca;
/*esta interface ser� nosso contrato de autentica��o*/
public interface PermitirAcesso {
	public boolean autenticar();/*apenas declara��o do metodo*/
	public boolean autenticar(String login, String senha);// sobrescrevemos criando um metodo com o mesmo nome mais com parametros
	
}
