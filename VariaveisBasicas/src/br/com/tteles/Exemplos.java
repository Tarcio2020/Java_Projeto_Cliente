package br.com.tteles;

public class Exemplos {
	
	private int codigo = 2;
	
	private long codigoMaior = 123124214;
	
	private double valorDecimal1 = 10.3;
	
	private float valorDecimal = 10.3f;
	
	private String texto;
	
	private boolean status;
	
	private short shor = 0; // Você pode atribuir um valor inicial aqui.
	
	private byte bi = 0; // Você pode atribuir um valor inicial aqui.
	
	public String retornaTexto() {
		return "Hello Word";
	}
	
	public int retornaInteiro() { // Corrigido o tipo de retorno para int
		return 150;
	}
	
	public long retornaLong(long num) { // Corrigido o tipo de argumento para long
		return num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
