package modulo_08_OperacoesLogicasCondicionaisRelacionais;

public class IfElseAninhado {
    /*opera��es aninhadas*/
	public static void main(String[] args) {
		int media = 69;

		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Aluno aprovado direto parab�ns " + media);
				} else {
					System.out.println("Aluno aprovado direto " + media);
				}
			} else {
				System.out.println("Aluno est� em recupera��o " + media);
			}
		} else {
			System.out.println("Aluno reprovado direto " + media);
		}
	}
}
