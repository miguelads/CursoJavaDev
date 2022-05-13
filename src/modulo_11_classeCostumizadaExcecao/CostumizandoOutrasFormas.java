package modulo_11_classeCostumizadaExcecao;

public class CostumizandoOutrasFormas {

	public static void main(String[] args) throws Exception {
		/*
		 * capturando o erro e exibindo a mensagem costumizada
		try {
			System.out.println(4 / 0);
		}catch(Exception e) {
			throw new IllegalArgumentException("n�o pode dividir um numero por 0");
		}*/
		
		//lan�ando sua propia exce��o que de erro em uma divis�o onde o quociente der 2
		/*int valor = 4;
		if((valor / 2) == 2) {
			throw new IllegalArgumentException("n�o pode ter valor de quociente 2");
		}*/

		// usando o exception e colocando o thorws subindo a exce��o pra cima, para a classe pai
		// o throws fica no metodo que chama a execu��o
		try {
			System.out.println(4 / 0);
		}catch(Exception e) {
			throw new Exception("n�o pode dividir um numero por 0");
		}
	}

}
