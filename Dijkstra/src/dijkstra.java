import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dijkstra {

	// Lista que guarda os vertices pertencentes ao menor caminho encontrado*/
	List<vertices> menorCaminho = new ArrayList<vertices>();

	/* Variavel que recebe os vertices pertencentes ao menor caminho */
	vertices verticeCaminho = new vertices();

	/* Variavel que guarda o vertice que esta sendo visitado */
	vertices atual = new vertices();

	/* Variavel que marca o vizinho do vertice atualmente visitado */
	vertices vizinho = new vertices();

	/* Lista dos vertices que ainda nao foram visitados */
	List<vertices> naoVisitados = new ArrayList<vertices>();

	/* Algoritmo de Dijkstra */
	public List<vertices> encontrarMenorCaminhoDijkstra(grafos grafo,
			vertices v1, vertices v2) {

		/* Adiciona a origem na lista do menor caminho */
		menorCaminho.add(v1);

		/* Colocando a distancias iniciais */
		for (int i = 0; i < grafo.getVertices().size(); i++) {

			/* Vertice atual tem distancia zero, e todos os outros "infinita" */
			if (grafo.getVertices().get(i).getDescricao()
					.equals(v1.getDescricao())) {

				grafo.getVertices().get(i).setDistancia(0);

			} else {

				grafo.getVertices().get(i).setDistancia(Integer.MAX_VALUE);

			}
			/* Insere o vertice na lista de vertices nao visitados */
			this.naoVisitados.add(grafo.getVertices().get(i));
		}

		Collections.sort(naoVisitados);
		/* O algoritmo não terminar até o todos os vertices sejam visitados */

		while (!this.naoVisitados.isEmpty()) {

			/*
			 * Toma-se sempre o vertice com menor distancia, que eh o primeiro
			 * da lista
			 */

			atual = this.naoVisitados.get(0);
			/*
			 * Para cada vizinho (aresta), calcula-se a sua possível distância,
			 * somando a distancia do vertice atual com a da aresta
			 * correspondente. Se essa distancia for menor que a distancia do
			 * vizinho, esta é atualizada com o seu devido valor.
			 */
			for (int i = 0; i < atual.getArestas().size(); i++) {

				vizinho = atual.getArestas().get(i).getDestino();

				if (!vizinho.FoiVisitado()) {

					/*
					 * Comparando a distância do vizinho(aresta) com a possível
					 * distancia
					 */

					if (vizinho.getDistancia() > (atual.getDistancia() + atual
							.getArestas().get(i).getPeso())) {

						vizinho.setDistancia(atual.getDistancia()
								+ atual.getArestas().get(i).getPeso());
						vizinho.setPai(atual);

						/*
						 * Se o vizinho eh o vertice procurado, e foi feita uma
						 * mudanca na distancia, a lista com o menor caminho
						 * anterior eh apagada, pois existe um caminho menor
						 * vertices pais, ateh o vertice origem.
						 */
						if (vizinho == v2) {
							menorCaminho.clear();
							verticeCaminho = vizinho;
							menorCaminho.add(vizinho);
							while (verticeCaminho.getPai() != null) {

								menorCaminho.add(verticeCaminho.getPai());
								verticeCaminho = verticeCaminho.getPai();

							}
							/*
							 * Ordena a lista do menor caminho, para que ele
							 * seja exibido da origem ao destino.
							 */
							Collections.sort(menorCaminho);

						}
					}
				}

			}
			/*
			 * Marca o vertice atual como visitado e o retira da lista de nao
			 * visitados
			 */
			atual.visitar();
			this.naoVisitados.remove(atual);
			/*
			 * Ordena a lista, para que o vertice com menor distancia fique na
			 * primeira posicao
			 */

			Collections.sort(naoVisitados);

		}

		return menorCaminho;
	}

}