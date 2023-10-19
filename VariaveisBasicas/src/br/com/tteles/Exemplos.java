package br.com.tteles;

/**
 * @author tarcio teles
 */

public class Exemplos {
	
	private int codigo = 2;
	
	private long codigoMaior = 123124214;
	
	private double valorDecimal1 = 10.3;
	
	private float valorDecimal = 10.3f;
	
	private String texto;
	
	private boolean = false;
	
	private short shor = 0; // Você pode atribuir um valor inicial aqui.
	
	private byte bi = 0; // Você pode atribuir um valor inicial aqui.
	
	public Exemplos() {

	}
	
	public Exemplos(int val) {
		this.codigo = val;
	}
	
	public String retornaTexto() {
		this.codigo = 0;
		return "Hello Word!";
	}
	
	public int retornaInteiro() { // Corrigido o tipo de retorno para int
		int val = 10;
		String texto = "Texto";
		this.texto = null;
		return val;	
		
		//return 150;
	}
	
	public long retornaLong(long num) { // Corrigido o tipo de argumento para long
		this.texto = "retornaLong";
		return num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
