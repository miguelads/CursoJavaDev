package modulo_11_Excecao_Finally;

public class Rodar {
/*COMOANDO FINALLY SEMPRE SER� EXECUTADO MESMO TENDO UMA EXCE��O */
	public static void main(String[] args) {
		
		try {
			String valorTeste = null;//este erro vai da de variavel n�o iniciada e da erro de converter String para int
			int valor = 0;
			Aluno aluno = new Aluno();// Aluno aluno; sem o new vai da o erro de nullpointException
			aluno.setNome("Ana Alice");
			aluno.setSerie("2� serie");
			System.out.println(valor = Integer.parseInt(valorTeste));
			System.out.println("Nome: " + aluno.getNome() + " - " + "Serie: " + aluno.getSerie());
				}catch(NullPointerException erro) {
					  System.out.println("objeto ou variavel nulo " + erro.getMessage());
				}catch(NumberFormatException erro) {
					System.out.println("N�o � possivel converter um objeto nulo");
				}catch(Exception erro) {// captura todas as exce��es que n�o prevemos
				    erro.printStackTrace();
				}finally {//sempre � executado ocorrendo erros ou n�o.
					System.out.println("Calma voc� est� aprendendo Java");
				}

	}

}
