package modulo_08_OperacoesLogicasCondicionaisRelacionais;

public class OperacoesRelacionais {
	/* os operadores l�gicos e embaixo alguns exemplos
	 *  ==
	 *  !=
	 *  <
	 *  >
	 *  <=
	 *  >=
	 * */
	public static void main(String []args) {
		int nota1 = 90;
		int nota2 = 91;
		
		if(nota1 == nota2) {
			System.out.println("As notas s�o iguais");
		}else {
			System.out.println("As notas n�o s�o iguais");
		}
		
		if(nota1 != nota2) {
			System.out.println("As notas s�o diferentes");
		}else {
			System.out.println("As notas s�o iguais");
		}
		
		if(nota1 < nota2) {
			System.out.println("Nota 1 � menor");
		}else {
			System.out.println("Nota 1 n�o � menor");
		}
		
	}
}
