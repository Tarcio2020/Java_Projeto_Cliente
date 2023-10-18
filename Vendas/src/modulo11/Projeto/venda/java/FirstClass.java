package modulo11.Projeto.venda.java;

public class FirstClass {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.setCodigo(45);
		cliente.cadastrarEndereco("Rua Antonio Cutiaro 171");
		cliente.cadastrarEndereco(cliente.getEndereco());
		cliente.imprimirEndereco();
		String end = cliente.retornarNomeCliente();

		System.out.println(cliente.getCodigo());
		System.out.println("Olá Tarcio!!!");
		System.out.println(end);
		System.out.println(cliente.getValorTotal());




	}
}
