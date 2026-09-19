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
			this.ultimaPista.setProximaPista(novaPista);
			this.ultimaPista = novaPista;
		}
	}
	
	// Iniciaar jonadar
	public void iniciarJornada() {
		if (this.primeiraPista == null) {
			System.out.println("O mapa está vazio! Nenhum pista foi cadastrada.");
			return;
		}
		Pista atual = this.primeiraPista;
		while (atual != null) {
			System.out.println("Ilha: " + atual.getNomeIlha() + " | Enigma: " + atual.getMensagem());
			atual = atual.getProximaPista(); //Avança  para a proxima pista();
		}
	}
	
	// Busca Pista (para percorremos a lista
	
	public Pista buscarPista(String nomeIlha) {
		Pista atual = this.primeiraPista;
		while (atual != null) {
			if (atual.getNomeIlha().equalsIgnoreCase(nomeIlha)) {
				return atual;
			}
			atual = atual.getProximaPista();
		}
		System.out.println(" Alerta: A ilha " + nomeIlha + " não foi encontrada!");
		return null;
	}
	
	// Remover
	
	public boolean removerPista(String nomeIlha) {
		if (this.primeiraPista == null) {
			return false; // Lista vazia
		}
		
		if (this.primeiraPista.getNomeIlha().equalsIgnoreCase(nomeIlha)){
			this.primeiraPista = this.primeiraPista.getProximaPista();
	        if (this.primeiraPista == null) {
	            this.ultimaPista = null; // A lista ficou vazia
	        }
	        return true;
	    }

	    // Caso 2: A pista está no meio ou no final (Tail)
	    Pista anterior = this.primeiraPista;
	    Pista atual = this.primeiraPista.getProximaPista();

	    while (atual != null) {
	        if (atual.getNomeIlha().equalsIgnoreCase(nomeIlha)) {
	            anterior.setProximaPista(atual.getProximaPista());
	            
	            // Se o elemento removido era o último, atualizamos a ultimaPista
	            if (atual == this.ultimaPista) {
	                this.ultimaPista = anterior;
	            }
	            return true;
	        }
	        anterior = atual;
	        atual = atual.getProximaPista();
	    }

	    return false; // Ilha não encontrada
	}
}