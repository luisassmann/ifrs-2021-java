package aula;

public class OrientacaoObjetos {
	/*
	 * A Programa��o Orientada a objetos � o Paradigma no qual
	 * um programa � estruturado.
	 * 
	 * Permite que objetos do mundo real (carros, filmes, bicicletas,
	 * celulares, etc.) que possuem caracter�sticas semelhantes, sejam
	 * abstra�dos e mapeados em objetos no programa de computador.
	 * 
	 * Objeto � uma entidade que combina estrutura de dados
	 * e comportamento funcional.
	 * 
	 * -- Classe --
	 * 
	 * Uma Classe representa um tipo abstrato de dado. As classes usadas
	 * para representar objetos complexos que t�m estado e
	 * comportamento.
	 * 
	 * Uma Classe � um gabarito para defini��o de objetos que possui:
	 * 
	 * - Atributos: s�o propriedades da classe que armazena o seu estado;
	 * 
	 * - M�todos: s�o funcionalidades (comportamento) que permitem
	 *   a modifica��o do seu estado.
	 * 
	 * Diagrama de classes:
	 * |-----------------|
	 * |     Carro       |
	 * |-----------------|
	 * | +modelo: String |
	 * | +marca: String  |
	 * |-----------------|
	 * | +andar(): void  |
	 * |-----------------|
	 * 
	 * Representa��o em C�digo Java no arquivo Carro.java
	 * 
	 * O nome da classe SEMPRE come�a com letra mai�scula!
	 * 
	 * --- Atributo ---
	 * 
	 * Os atributos definem propriedades/caracter�sticas que o objeto possui.
	 * Um atributo � identificado por um nome e um tipo.
	 * 
	 * Os atributos podem opcionalmente estar inicializados, conforme
	 * o exemplo da classe Carro (Carro.java). No exemplo da Pessoa (Pessoa.java)
	 * n�o h� inicializa��o.
	 * 
	 * O nome de um atributo SEMPRE deve estar em letra min�scula!
	 * 
	 * ---- M�todo ----
	 * 
	 * Os m�todos definem as a��es (funcionalidades) da classe, ou seja, o que os
	 * objetos fazem.
	 * 
	 * Um m�todo � composto por:
	 * 
	 * - um identificador para o m�todo (o nome do m�todo);
	 * - o tipo para o valor de retorno;
	 * - e opcionalmente por sua lista de argumentos, sendo cada argumento
	 *   identificado por seu tipo e nome.
	 * 
	 * O nome do m�todo SEMPRE deve come�ar com letra min�scula!
	 * 
	 * Exemplos de M�todos na classe Pessoa. (Pessoa.java)
	 * 
	 * ----- Escopo -----
	 * 
	 * Os atributos s�o acess�veis em qualquer lugar da classe, mas vari�veis
	 * criadas dentro de um m�todo s�o inacess�veis fora deste. (Carro.java)
	 * 
	 * ------ Objeto ------
	 * 
	 * Objetos s�o inst�ncias de classe. Quando instanciamos um objeto
	 * de uma classe, estamos criando um novo item do conjunto representado
	 * por essa classe.
	 * 
	 * Cada Objeto possui:
	 * 
	 * - Estado: objetos diferentes podem ter valores diferentes para seus atributos;
	 * - Comportamento: definido pelos m�todos, que s�o comuns a todos objetos da mesma classe.
	 * 
	 * Exemplos:
	 * 
	 * - Livro: O Mundo de Sofia, Tutorial Java, ...
	 * - Filme: Matrix, Sexto Sentido, Avatar, Blade Runner, ...
	 * - Carro: Civic, Fiesta, S10, Corolla, HRV, ...
	 * 
	 */
}
