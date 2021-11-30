grammar Alguma;            // Define a grammar called Alguma


//Grammar
programa : Delim DEC declaracoes Delim ALG acao* EOF;
algoritmo : acao*;
declaracoes : declaracao*; 
declaracao : ID Delim tipo;
tipo : REA
	   | INT
	   | STR;
	   
acao : condicional | laco | preatribuicao | iooperacao;

//acoes
iooperacao : iooperador objeto;
iooperador : LER | IMP;

preatribuicao : ATR atribuicao;
atribuicao : (operacaoaritmetica|objeto) A ID;

condicional : SE operacaoboleana ENT conteudo condicionalfalso;
condicionalfalso : (SEN conteudo)?;

laco : ENQ operacaoboleana conteudo;

//elementos 'fundamentais'
conteudo : (INI algoritmo FIM) | acao;
		  
objeto : (ID | num | Str);
num : (NumI | NumR);

operacaoboleana : (objeto OpRel objeto)
						 | (AP objeto OpRel objeto FP)
		         | (AP objeto OpRel objeto FP OpBool operacaoboleana);

operacaoaritmetica : (objeto OpArit continuaoperacaoaritmetica)
										| (AP objeto OpArit continuaoperacaoaritmetica FP);

continuaoperacaoaritmetica : operacaoaritmetica | objeto;





//RegularDefinitions
WS: [ \n\t\r] -> skip;
fragment DIGITO: [0-9];
COMENTARIO:'%'.*?[\n] -> skip;

//Tokens
ALG: 'ALGORITMO';
DEC: 'DECLARACOES';
INT: 'INTEIRO';
STR: 'STRING';
REA: 'REAL';
ATR: 'ATRIBUIR';
LER: 'LER';
IMP: 'IMPRIMI';
ENQ: 'ENQUANTO';
SE: 'SE';
SEN: 'SENAO';
ENT: 'ENTAO';
INI: 'INICIO';
FIM: 'FIM';
A: 'A';

fragment LETRA: [A-Za-z];

ID: LETRA (LETRA|DIGITO)*;
OpBool: ('E' | 'OU');
OpArit: ('*' | '/' | '+' | '–' | '-' );
OpRel : ( '<' | '<=' | '>=' | '>' | '=' | '<>' | '!=');
AP: '(';
FP: ')';
Delim: ':';
NumI: DIGITO+;
NumR: DIGITO+','DIGITO+;
Str: '\'' .+? '\'';


