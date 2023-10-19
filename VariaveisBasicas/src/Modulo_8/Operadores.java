package Modulo_8;

public class Operadores {

	public static void main(String[] args) {
		// +, -, *, /
		OperacoesAritmeticas();
		OperacoesAtribuicoes();
		OperacoesDeIncrementoDecremento();
	}
	
	public static void OperacoesDeIncrementoDecremento() {
		
		System.out.println("***OperacoesDeIncrementoDecremento***");
		
		int num1 = 10;
		System.out.println(num1);
		int num2 = num1 + 1;
		num1++;
		num1--;

		System.out.println(num1);

		
	}
	
	public static void OperacoesAtribuicoes() {
		
		System.out.println("***OperacoesAtribuicoes***");
		
		int num1 = 10;
		int num2 = 20;					
		num1 += num2;
		System.out.println(num1);
		num1 -= num2;
		System.out.println(num1);
		num1 *= num2;
		System.out.println(num1);
		num1 /= num2;
		System.out.println(num1);

	}
	
	public static void OperacoesAritmeticas() {		
		
		System.out.println("***OperacoesAritmeticas***");
		
		int num1 = 10;
		int num2 = 20;		
		double num10 = 10;
		double num20= 20;		
		int num3 = num1 + num2;
		int num4 = num1 - num2;
		int num5 = num1 * num2;
		double num6 = num10 / num20;
		
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		
	}
	 

}
