package estruturaDados;

public class CacaAoTesouro {
	
	//Ponteiro para o inicio da Lista (Head)
	private Pista primeiraPista;
	//Ponteiro para  o fim da Lista (Tail)
	private Pista ultimaPista;
	
	// Construtor para iniciar lista vazia
	public CacaAoTesouro() {
		this.primeiraPista = null;
		this.ultimaPista = null;
	}
	
	// Metodo para adcinar pista no final
	public void adicionarPista(String nomeIlha, String mensagem){
		Pista novaPista = new Pista (nomeIlha, mensagem); // Cria o novo nó
		
		//Caso a lista esteja vazia
		if (this.primeiraPista == null) {
			this.primeiraPista = novaPista;
			this.ultimaPista = novaPista;
		} else {
			
			// Se ja houver elementos, liga o ultimo atual a nova pista e atualiza o ponteiro do fim
			this.ultimaPista.setProximaPita(novaPista);
			this.ultimaPista = novaPista;
		}
	}
}