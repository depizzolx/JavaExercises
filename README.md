# JavaExercises

## CLASSE 

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

- Os atributos de uma classe são os membros que armazenam dados, seja os inseridos pelo usuário, sejam os vindos diretamente do sistema;
- Os métodos de uma classe são os membros responsáveis pelas operações e transformações do sistema;
- Quando um membro de uma classe é instânciado, ele, por padrão, recebe o valor 0 se for 'int' ou 'double', e 'null' se for String;

## MEMBROS ESTÁTICOS
	- São chamados de 'Membros de Classe', diferenciando-os de 'membros' e 'instâncias';
	- São membros que fazem sentido independentemente de objetos. ;
	- Não precisam de nome de objeto para serem chamados;
	- São chamados a partir do próprio nome da classe;
	- Sâo utilizados de maneira comum em Classes Utilitárias;
	- Sâo utilizados de maneira comum em Declaração de Constante (constantes são valores que não podem ser alterados dentro do código, e para isso, utilizamos a palavra 'final'. Exemplo: 'public static final int [NOME DA VÁRIAVEL]' - Nomes de Constantes, no padrão, são definidos em letra maiúscula);
	- Uma Classe que possui somente Membros Estáticos, será, por consequência, uma Classe estática, e essa classe não poderá ser instânciada.

## PALAVRA 'THIS'
	- É uma referência ao objeto onde ela está sendo declarada;
	- Diferencia atributos de variáveis (ou parâmetros) locais;
	- Quando usamos 'this', acessamos a variável do Objeto ao qual ela faz parte. Se não utilizassemos o 'this', acessariamos o parâmetro declarado, seja uma consulta ou um input do usuário (variável local);
	- Através da Palavra 'this', podemos passar o próprio objeto como argumento na chamada de um método ou construtor;


## CONSTRUTORES
	- O Construtor é uma operação especial da classe, que é executada no momento da instanciação do Objeto (quando chamamos o objeto no código através do comando 'new');
	- É utilizado para iniciar valores dos atributos ou permitir/obrigar que o objeto receba dados; 
	- É possível especificar mais de um construtor na mesma classe (o que chamamos de sobrecarga);
	- O Construtor, por padrão, é declarado após a definição dos atributos (variáveis); 
	- O Construtor, quando declarado, não faz parte de algum 'tipo', como 'String' ou 'int', por exemplo;
	- Quando declaramos o Construtor, ele recebe os parâmetros declarados no seu código, dizendo para o sistema o que será inserido ali;
	- Através dos Construtores, se, nos parâmetros, eu não declarar todas as variáveis a serem preenchidas, posso permitir que o usuário ou o sistema não preencha todos os campos de uma página (Construtor Personalizado);
	- Podemos, através da SOBRECARGA, definir um construtor padrão e um construtor personalizado;
	
## ENCAPSULAMENTO
	> Encapsulamento é o princípio que consiste em esconder detalhes de implementação de uma classe, expondo apenas operações seguras e que mantenham os objetos em um estado consistente;
	- Seguindo o padrão do JavaBeans, os atributos devem ser acessados por meio de métodos 'get' e 'set', pois usamos o modificador de acesso 'private' ao invés do 'public';
	- Utilizamos a regra acima da seguinte forma: 'get' ou 'set' + o nome do atributo com a inicial maiúscula (camelCase).
	- Por padrão, o método de encapsulamento é declarado após a declaração dos Construtores;