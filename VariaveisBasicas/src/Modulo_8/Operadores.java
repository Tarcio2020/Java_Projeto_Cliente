package Modulo_8;

public class Operadores {

	public static void main(String[] args) {
		OperacoesAritmeticas();
		OperacoesAtribuicoes();
		OperacoesDeIncrementoDecremento();		
		OperadoresRelacionais();
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
	public static void OperacoesDeIncrementoDecremento() {
		
		System.out.println("***OperacoesDeIncrementoDecremento***");
		
		int num1 = 10;
		System.out.println(num1);
		
		int num2 = num1 + 1;
		
		num1++; // = valor + 1
		System.out.println(num1);
		
		num1--; // = valor - 1
		System.out.println(num1);
		
		num1--;// = valor - 1
		System.out.println(num1);
		
	}
	 
	
	public static void OperadoresRelacionais() {
		System.out.println("***OperadoresRelacionais***");
		
		int num1 = 10;
		int num2 = 20;
		
		boolean isMaior = num1 > num2;
		boolean notIsMaior = num1 < num2;
		boolean isIgual = num1 == num2;
		boolean isDiff = num1 != num2;
		boolean isMaiorOrIgual = num1 >= num2;
		boolean isMOrIgual = num1 >= num2;
		boolean isDentrode10 = num1 >= 1 && num1 <=10;
		boolean isDentrode10Dois = num2 >= 1 && num2 <=10;
		boolean isDentrode_10 = num2 >= 1 || num2 <=10;

		System.out.println("isMaior " + isMaior);
		System.out.println("notIsMaior " + notIsMaior);
		System.out.println("isIgual " + isIgual);
		System.out.println("isDiff " +isDiff);
		System.out.println("isMaiorOrIgual " + isMaiorOrIgual);
		System.out.println("isDentrode10 " + isDentrode10);
		System.out.println("isDentrode10Dois " + isDentrode10Dois);
		System.out.println("isDentrode_10 " + isDentrode_10);
		System.out.println("isDentrode_10 " + !isDentrode_10);

	}


}
