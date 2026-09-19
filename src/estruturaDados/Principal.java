//200039616 Francisnei Araujo Borges e Edbarbara Nery

package estruturaDados;

public class Principal {

	public static void main(String[] args) {
	
		// 1. Instanciar a classe CacaoTesouro
        CacaAoTesouro mapa = new CacaAoTesouro();

        // 2. Adicionar as 5 pistas originais na ordem exata[cite: 2]
        mapa.adicionarPista("Ilha dos Passaros", "Procure pela palmeira torta na praia leste.");
        mapa.adicionarPista("Ilha da Névoa", "Siga o rio ate a caverna; atente-se as rochas.");
        mapa.adicionarPista("Ilha do Esqueleto", "Cuidado com as armadilhas no caminho de pedra.");
        mapa.adicionarPista("Ilha das Sereias", "Navegue ao sul ate encontrar o rochedo azul.");
        mapa.adicionarPista("Ilha do Bau de Ouro", "PARABENS! Voce encontrou o tesouro do Capitao Morgan!");

        // 3. Chamar iniciarJornada() para imprimir a rota completa[cite: 2]
        System.out.println(" ROTA COMPLETA DO TESOURO ");
        mapa.iniciarJornada();

        // 4. Simular a Sabotagem (remover a "Ilha do Esqueleto")[cite: 2]
        System.out.println("\n SIMULANDO A SABOTAGEM ");
        mapa.removerPista("Ilha do Esqueleto");

        // 5. Executar iniciarJornada() novamente para comprovar o redirecionamento[cite: 2]
        System.out.println("\n ROTA APOS A SABOTAGEM ");
        mapa.iniciarJornada();

        // 6. Buscar pela "Ilha do Bau de Ouro" usando buscarPista() e exibir a mensagem[cite: 2]
        System.out.println("\n BUSCA PELO TESOURO");
        Pista tesouro = mapa.buscarPista("Ilha do Bau de Ouro");
        if (tesouro != null) {
            System.out.println("Mensagem encontrada: " + tesouro.getMensagem());
        }
    }
}