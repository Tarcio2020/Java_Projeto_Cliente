package Modulo_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loopings {

	public static void main(String[] args) {
			
		//Taboada();
		//If_And_Else();
		//Breaking();
		//Continue();
		While();
	}
	
	
	public static void If_And_Else() {
		

		/*Em Java, o for é uma estrutura de controle de fluxo que é 
		 * utilizada para criar loops, ou seja, repetições de um bloco de código. 
		 * Ele é especialmente útil quando se sabe antecipadamente quantas vezes você 
		 * deseja executar um determinado conjunto de instruções.
		 * 
		 * Inicialização: Uma expressão que é executada uma vez no início do loop. 
		 * Normalmente, é usada para inicializar uma variável de controle.

			Condição: Uma expressão booleana que é verificada antes de cada iteração do loop.
	 		Se for verdadeira, o bloco de código dentro do loop é executado. Se for falsa, o loop é encerrado.

			Expressão de atualização: Uma expressão que é executada após cada iteração do loop. 
			Geralmente, é usada para modificar a variável de controle.*/
		
		List<Integer> valores = new ArrayList<>();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("linha " + i);
			valores.add(i);
		}
		
		System.out.println("                ");

		for(Integer i : valores) {
			System.out.println("linha " + i);
		}
		
		System.out.println("                ");

		valores.forEach(i -> System.out.println("Linha " + i));
		
		System.out.println("Esse é o Array Valores = " + valores);	
	}
	
	public static void Taboada() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um número para gerar a tabuada: ");
		int num = s.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + num*i);
		}
	}
	
	public static void Breaking() {

		for (int contador = 1; contador<=1000; contador++){
			System.out.println("Está é a repetição número: "+contador);
			if (contador == 90){
				break;
			}
		}
	}
	
	public static void Continue() {

		for (int contador = 1; contador<=1000; contador++){
			System.out.println("Está é a repetição número: "+contador);
			if (contador %5!=0){
				continue;
			}
			System.out.println("Continue: "+contador);
		}
	}
	
	
	public static void While() {
			//continua executando enquanto uma função é verdadeira
		int count = 0;
		while(count < 500) {
			System.out.println("Repetição de números : "+count);
			count ++;
		}
	}
	  
	  /*
	   * For = Para
	   * While = Equanto
	  */
	 
	
	

}
