package modulo_13_Matrizes;

public class Matriz {
	public static void main(String[] args) {
		
		int[][] notas = new int[2][3];
		
		notas[0][0] = 90;
		notas[0][1] = 80;
		notas[0][2] = 70;
		
		notas[1][0] = 60;
		notas[1][1] = 50;
		notas[1][2] = 50;
		for(int posLinha = 0; posLinha < notas.length; posLinha++) {
			System.out.println("============================================================");
			for(int posColuna = 0; posColuna < notas[posLinha].length; posColuna++) {
				System.out.println(" Posi��o "+ posLinha +" : "+ notas[posLinha][posColuna]);
			}
		}
		
		
	}
}
