# JavaExercises
training 

O que é uma Classe em Java?
	É um tipo estruturado que pode conter membros, sendo eles:
		- Atributos (dados / campos)
		- Métodos (funções / operações)
	Uma classe conter diversos recursos também, tais como:
		- Construtores
		- Sobrecarga
		- Encapsulamento
		- Herança
		- Polimorfismo

*Objetos são instâncias de Classes

Para acessarmos uma classe a partir de outro arquivo java, podemos utilizar o 'import' e, se essa classe for pública (public), podemos definir uma váriavel do tipo dessa classe, atribuindo um nome a ela, e chamamamos, a partir desse nome, o construtor da classe, como por exemplo:

	package Exemplo // nome do pacote ao qual essa classe declarada abaixo faz parte
	
	import nomeDoPacote.nomeDaClasse //fazendo o import da classe, que consiste em dizer o pacote ao qual ela faz parte + '.' + o nome da classe

	public class Exemplo {

		public static void main(String [] args) {
		
		nomeDaClasse v1; //dizendo que a váriavel v1 é do tipo ditado pela classe 'nomeDaClasse'
		
		v1 = new nomeDaClasse(); //dizendo que v1 é um novo objeto da classe 
		
		v1.atributoDaClasse = (...) //nome da váriavel e o atributo que você quer acessar dessa classe - '(...)' insira aqui o que deseja fazer com determinado atributo
									//esse atributo pode ser diversas coisas, desde armazenamento de dados, transformações, funções e mais
		
		}
	}
	
Toda classe Java é uma subclasse (herda) da classe Object, e a classe Object possui os seguintes métodos:
	- getClass, que retorna o tipo do objeto;
	- equals, que compara se um objeto é igual ao outro;
	- hashCode, que retorna um código Hash do objeto;
	- toString, que converte o objeto para String.