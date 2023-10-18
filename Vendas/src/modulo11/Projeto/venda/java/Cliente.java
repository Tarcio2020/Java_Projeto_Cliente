package modulo11.Projeto.venda.java;

// Pegar o valor = get
// Adicionar o valor = set

public class Cliente {

	private int codigo;
	
	private String nome;
	
	private String endereco;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	//todo método em java que não tem retorno, se chama VOID
	//se tiver retorno de de interiro seria (public int), se fosse String (public String)
	
	public void cadastrarEndereco(String endereco) {
		setEndereco(endereco);
		System.out.println(endereco);

	}
	
	public void imprimirEndereco() {
		System.out.println(this.endereco);
	}
	
	public String retornarNomeCliente() {
		return "Endereco do Tarcio!!!";
	}
	
	public static void main(String[] args) {

	}
	
	public int getValorTotal() {
		return 20;
	}

}
