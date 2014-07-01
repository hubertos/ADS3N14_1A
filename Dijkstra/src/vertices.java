import java.util.ArrayList;
import java.util.List;

public class vertices implements Comparable<vertices> {

	private String descricao;
	private int distancia;
	private boolean visitado = false;
	private vertices pai;
	private List<aresta> arestas = new ArrayList<aresta>();
	private List<vertices> vizinhos = new ArrayList<vertices>();

	public void setDescricao(String nome) {
		this.descricao = nome;
	}

	public String getDescricao() {
		return descricao;

	}

	public void visitar() {
		this.visitado = true;
	}

	public boolean FoiVisitado() {
		return visitado;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public int getDistancia() {
		return this.distancia;
	}

	public void setPai(vertices pai) {
		this.pai = pai;
	}

	public vertices getPai() {
		return this.pai;
	}

	public void setVizinhos(List<vertices> vizinhos) {
		this.vizinhos.addAll(vizinhos);

	}

	public List<vertices> getVizinhos() {
		return this.vizinhos;
	}

	public void setArestas(List<aresta> arestas) {
		this.arestas.addAll(arestas);

	}

	public List<aresta> getArestas() {
		return arestas;
	}

	public int compareTo(vertices vertice) {
		if (this.getDistancia() < vertice.getDistancia())
			return -1;
		else if (this.getDistancia() == vertice.getDistancia())
			return 0;
		return 1;

	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof vertices) {
			vertices vRef = (vertices) obj;
			if (this.getDescricao().equals(vRef.getDescricao()))
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String s = this.getDescricao();
		return s;
	}

}