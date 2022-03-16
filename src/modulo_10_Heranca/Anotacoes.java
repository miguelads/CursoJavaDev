package modulo_10_Heranca;

public class Anotacoes {
	/* Heran�a em OO, permite cria��o de novas classes a partir de outra ja existentes, e 
	 * essas novas classes s�o chamadas de subclasses
	 * 
	 * Quando criamos uma classe pai, criamos seus atributos como protected n�o como private 
	 * pois se n�o vai da erro quando chamarmos os atributos da classe pai ou seja
	 * da super classe.
	 * 
	 * private:usado apenas para manipular atributos da propia classe.
	 * protected:usado na classe pai e na classe filha.
	 * 
	 * para usarmos a Heran�a usamos a palavra chave extends
	 * 
	 *      SOBRESCRITA DE METODOS
	 *   
	 * Nota��o @Override conseguimos sobrescrever o metodo ou mudar a regra de negocio, podendo
	 * ser usado em heran�a com metodos na classe pai e sobrescrevendo nas filhas ou em classe normal..
	 * 
	 *   CLASSES ABSTRATAS
	 * classe abstrata: qual a inte��o dela, � de servir como um modelo, e uma classe abstrata impede
	 * que possa ser instanciada e utilizamos a palavra chave abstract, servindo para manter a regra
	 * dentro do sistema impedindo que um dev use a classe de uma forma errada.
	 *  � o meio de n�o permitir ser criado um objeto dentro de um sistema de um determinado tipo generico
	 *  exemplos pessoa, e trabalhar com objetos concretos como aluno que herda de pessoa. 
	 *  
	 *  Metodos abstratos: metodo abstrato s� existe em uma classe abstrata, que obrigartoriamente � 
	 *  implementado nas classes filhas, vai ser um metodo tambem sobrescito como no exemplo 
	 *  nesse pacote Heran�a.
	 *  metodo abstrato � declarado mais n�o definido ex:
	 *  publi double salario();
	 *  
	 *  Polimofismo (poli = muitas, morphos = formas): varias formas, exemplo sobrescrita de metodo o mesmo metodo mais podendo
	 *  fazer ele de varias formas diferentes.
	 *  exemplo de polimofismo:
	 *  
	 *  Pessoa pessoa = new Aluno(); // ent�o aqui eu posso pegar os dados de aluno e de pessoa varias formas
	 *  
	 *  FALANDO AGORA SOBRE INTERFACESSS -----------------------------------------------------------
	 *  
	 *  Define uma serie de metodos mas nunca conter implementa��es deles, ele so exp�e o que o 
	 *  objeto deve fazer.
	 *  Ela � um contrato onde quem assina se responsabiliza por implementar esses m�todos.
	 *  
	 *  palavra reservada interface exemplo:
	 *  
	 *  public interface PermirtirAcesso{
	 *         public boolean autenticar();
	 *  }
	 *  
	 *  Diferen�a de Abstra��o e Heran�a x Interface
	 *  
	 *  na abstra��o e Heran�a as classes filhas implementar�o os metodos abstratos
	 *  e poderam acessar metodos e atributos da classe pai.
	 *  
	 *  na interface: s� tera acesso aos metodos as classes que implementarem a interface 
	 *  assim eu posso ter 3 ou mais classes filhas e escolher uma que implemente um metodo que eu n�o
	 *  quero que as outras n�o implementem, usando a interface e assinando o contrato com ela.
	 *  
	 *  
	 *  
	 */ 
}