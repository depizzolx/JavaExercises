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
	
## MODIFICADORES DE ACESSO
	- public: O membro pode ser acessado por todas as classes, ao menos se, em um módulo diferente, o pacote onde ele reside não seja exportado;
	- private: O membro só pode ser acessado na própria classe;
	- (nada): O membro só pode ser acessado nas classes do mesmo pacote (package)
	- protected: O membro só pode ser acessado em classes do mesmo pacote, bem como em subclasses de pacotes diferentes;
	
## ENCAPSULAMENTO
	> Encapsulamento é o princípio que consiste em esconder detalhes de implementação de uma classe, expondo apenas operações seguras e que mantenham os objetos em um estado consistente;
	- Seguindo o padrão do JavaBeans, os atributos devem ser acessados por meio de métodos 'get' e 'set', pois usamos o modificador de acesso 'private' ao invés do 'public';
	- Utilizamos a regra acima da seguinte forma: 'get' ou 'set' + o nome do atributo com a inicial maiúscula (camelCase).
	- Por padrão, o método de encapsulamento é declarado após a declaração dos Construtores;
	- Por utilizarmos o modificador de acesso 'private', podemos proteger um atributo de mudanças indesejadas através da não-declaração do método 'set';

## tipos REFERÊNCIA 
	- Classe são Tipos Referência, ou seja, toda variável que cujo tipo são classes, não CONTÉM um valor, mas sim APONTA pra um valor. Ou seja, na memória, o valor referido na variável é buscado em outro local, e não está contido na própria variável do tipo classe. A variável refere-se a um valor, mas não o possui (PONTEIRO);
	- A alocação de uma variável na memória para ser referida é feita através do 'new', ou seja, para utilizarmos, é preciso instanciar a classe. Exemplo abaixo;
	
	Product p1, p2;
	
	p1 = new Product ("TV", 900.00, 0);
	p2 = p1.
	
	- No exemplo acima, p1 criou um objeto na memória e está apontando pra ele, e, da mesma forma, p2 aponta para esse objeto criado, mas não o recebe, é apenas uma referência;
	- Ou seja, quando eu crio uma variável do tipo referência, eu posso usar os "tipos primitivos" criados dentro dela, ou seja, seus métodos e atributos, pois é como se fossem uma nova tipagem para o Java, me permitindo trabalhar com diferentes tipos;

## tipos VALOR	
	- Tipos Primitivos são do tipo valor, ou seja, armazenam/possuem o valor, e não apontam pra ele (CAIXA). Exemplo abaixo;
	
	double x, y;
	
	x = 10;
	y = x;
	
	- No exemplo acima, y cria uma cópia de x e possui o valor copiado, da mesma forma que x possui o valor atribuído a ele, ou seja, 10.
	
## VETORES
	- Vetor é o nome dado a arranjos unidimensionais;
	- Um arranjo é nada mais que um Array, que é uma estrutura de dados;
	- O Array é homogêneo, ou seja, só possui dados do mesmo tipo;
	- É ordenado, ou seja, os elementos são acessados por meio de posições (IDs);
	- A vantagem do Array é o acesso imediato aos elementos através da sua posição;
	- A desvantagem é que os Arrays possuem um tamanho fixo, ex: Se eu quero um Array de 100 posições, já tenho que criá-lo previamente dessa forma;
	- Outra desvantagem é a dificuldade de fazer inserções e exclusões;