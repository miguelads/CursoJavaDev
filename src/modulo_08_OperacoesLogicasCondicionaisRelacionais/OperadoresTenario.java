package modulo_08_OperacoesLogicasCondicionaisRelacionais;

public class OperadoresTenario {
   public static void main(String []args) {
	   
	   /*operadores ten�rios usados para micro valida��es, valida��es de uma linha*/
	   int mediaAluno = 70;
	   String saidaResultado;
	                  /* condi��o     tenario    verdadiro         falso      */
	   saidaResultado = mediaAluno >= 70 ? "Aluno aprovado" : "Aluno reprovado";
	  
	   System.out.println(saidaResultado);
   }
}
