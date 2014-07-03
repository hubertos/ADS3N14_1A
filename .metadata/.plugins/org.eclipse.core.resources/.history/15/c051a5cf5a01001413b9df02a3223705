//trabalho final Huberto Rosa Júnior

import java.util.List;
import java.util.Scanner;

public class main {

	private static grafos grafo;
	private final static String separador = " ";
	private final static String arquivo_inicial = "D:\\trabalho_dijkstra.TXT";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		lerArquivo(arquivo_inicial);
		/* System.out.println("- Arquivo carregado: " + arquivo_inicial); */
		le();
	}

	private static void lerArquivo(String arquivo) {
		// Aqui vai ler o arquivo com dados
		lerarquivo la = new lerarquivo(arquivo, separador);
		grafo = la.getAll();
	}

	private static void le() {
		Integer a1;
		Integer a2;

		Scanner sc = new Scanner(System.in);
		sc.reset();
		try {
			System.out.print("Digite a Origem: ");
			a1 = sc.nextInt();
			System.out.print("Digite o Destino: ");
			a2 = sc.nextInt();

		} finally {
			sc.close();
		}

		// Aqui vai procurar todos os vertices no grafo
		vertices v1 = grafo.findVertice(a1.toString());
		vertices v2 = grafo.findVertice(a2.toString());
		String erro = "Vertice não localizado: %s";

		// Valida vertice não localizado
		if (v1 == null)
			System.out.println(String.format(erro, a1));
		if (v2 == null)
			System.out.println(String.format(erro, a2));
		if (v1 == null || v2 == null)
			return;

		// Aqui vai calcular a menor distancia entre as vertices
		dijkstra dijkstra = new dijkstra();
		List<vertices> verticeList = dijkstra.encontrarMenorCaminhoDijkstra(
				grafo, v1, v2);

		StringBuilder caminho = new StringBuilder();
		int custo = 0;
		for (vertices vertice : verticeList) {
			caminho.append(" > ");
			caminho.append(vertice.getDescricao());
			custo = vertice.getDistancia();
		}
		String out = "\r\nOrigem: %d" + "\r\nDestino: %d"
				+ "\r\nMenor Caminho: %s" + "\r\nMenor Custo: %d";

		out = String.format(out, a1, a2, caminho.toString(), custo);
		System.out.println(out);

	}
}