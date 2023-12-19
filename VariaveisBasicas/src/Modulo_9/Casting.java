package Modulo_9;

public class Casting {
	/**
	 * @author tarcio.tele
	 * Aqui estão os principais tipos primitivos de dados em Java:

			Tipos Inteiros:
			
			byte: 8 bits, valores entre -128 e 127.
			short: 16 bits, valores entre -32,768 e 32,767.
			int: 32 bits, valores entre -2^31 e 2^31 - 1.
			long: 64 bits, valores entre -2^63 e 2^63 - 1.
			Tipos de Ponto Flutuante:
			
			float: 32 bits, representa números de ponto flutuante de precisão simples.
			double: 64 bits, representa números de ponto flutuante de dupla precisão.
			Tipo Caractere:
			
			char: 16 bits, representa um caractere Unicode.
			Tipo Lógico:
			
			boolean: representa valores lógicos, true ou false.
			
			
	 * Casting =  transforma um primitivo em outro.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Exemplo de casting
		 Dessa forma irá gerar um erro:
			
			int num1 = 10;
			short num2 = num1;
			
			Forma Correta:
			
			int num1 = 10;
			short num2 = (short) num1;
		
		
		
		 * */
		int num1 = 10;
		short num2 = (short) num1;
		/*
		 * Vai nos ajudar na hora de organizar a memória
		 */
		System.out.println(num1);
		System.out.println(num2);

	}

}
