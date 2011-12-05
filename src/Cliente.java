
public class Cliente {

	private String nome;
	String endereco;
	String cpf;
	
	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nomeInformado) {
		nome = nomeInformado;
	}
}
