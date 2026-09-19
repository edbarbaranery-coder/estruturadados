package estruturaDados;

public class Pista {

	// Atributos
	private String nomeIlha;
	private String mensagem;
	
	// Atributos tipo "NO"
	private Pista proximaPista;
	
	// Construtor
	public String getNomeIlha() {
		return nomeIlha;
	}

	public void setNomeIlha(String nomeIlha) {
		this.nomeIlha = nomeIlha;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Pista getProximaPista() {
		return this.proximaPista;
	}

	public void setProximaPista(Pista proximaPista) {
		this.proximaPista = proximaPista;
	}

	public Pista(String nomeIlha, String mensagem) {
		this.nomeIlha = nomeIlha;
		this.mensagem = mensagem;
		this.proximaPista = null;
	}
}