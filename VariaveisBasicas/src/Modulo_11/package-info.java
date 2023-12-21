package Modulo_11;
/*

Tipos de Interfaces:

Iterator: está no topo da hierarquia e possibilita percorrer uma coleção e remover seus elementos;

Collection: Não existe implementação direta dessa interface, mas ela define as operações básicas 
para as coleções, como adicionar, remover, esvaziar, etc.;

List: define uma coleção ordenada, podendo conter elementos duplicados. Em geral, o usuário 
tem controle total sobre a posição onde cada elemento é inserido e pode recuperá-los através de 
seus índices. Prefira esta interface quando precisar de acesso aleatório, através do índice do elemento;

 
 Queue: um tipo de coleção para manter uma lista de prioridades, onde a ordem dos seus elementos, 
 definida pela implementação de Comparable ou Comparator, determina essa prioridade. Com a interface 
 fila pode-se criar filas e pilhas;
 
Map: mapeia chaves para valores. Cada elemento tem na verdade dois objetos: uma chave e um valor. 
Valores podem ser duplicados, mas chaves não. SortedMap é uma interface que estende Map, e permite 
classificação ascendente das chaves. Uma aplicação dessa interface é a classe Properties, que é usada para 
persistir propriedades/configurações de um sistema, por exemplo.

Set: interface que define uma coleção que não permite elementos duplicados. A interface SortedSet, 
que estende Set, possibilita a classificação natural dos elementos, tal como a ordem alfabética

 */