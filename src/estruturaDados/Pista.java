package estruturaDados;

public class Pista {

	// Atributos
	private String nomeIlha;
	private String mensagem;
	
	// Atributos tipo "NO"
	private Pista proximaPixta;
	
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

	public Pista getProximaPixta() {
		return proximaPixta;
	}

	public void setProximaPixta(Pista proximaPixta) {
		this.proximaPixta = proximaPixta;
	}

	public Pist(String nomeIlha, String mensagem) {
		this.nomeIlha = nomeIlha;
		this.mensagem = mensagem;
		this.proximaPixta = null;
	}
}
